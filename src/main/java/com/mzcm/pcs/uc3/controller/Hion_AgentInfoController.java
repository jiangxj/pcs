package com.mzcm.pcs.uc3.controller;

import com.alibaba.fastjson.JSONObject;
import com.mzcm.pcs.commons.Constants;
import com.mzcm.pcs.uc3.service.Hion_AgentInfoService;
import com.mzcm.pcs.user.dto.Mzcm_user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by xiaoi-010 on 2017/11/15.
 */
@RestController
@RequestMapping("/agent")
public class Hion_AgentInfoController {

    @Autowired
    Hion_AgentInfoService hion_AgentInfoService;

    @RequestMapping("/list")
    public String list(HttpServletRequest request){
        JSONObject jsonResult = new JSONObject();
        try{
            List list = hion_AgentInfoService.getHion_AgentInfoList();
            jsonResult.put("data", list);
            jsonResult.put("statusCode", 0);
            jsonResult.put("statusMessage", "ok");
        }catch (Exception e){
            e.printStackTrace();
            jsonResult.put("statusCode", 1);
            jsonResult.put("statusMessage", "error");
        }
        return jsonResult.toJSONString();
    }
}
