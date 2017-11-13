package com.mzcm.pcs.mzcase.controller;

import com.alibaba.fastjson.JSONObject;
import com.mzcm.pcs.mzcase.service.CaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by xiaoi-010 on 2017/11/13.
 */
@RestController
@RequestMapping("/case")
public class CaseController {
    @Autowired
    CaseService caseService;

    @RequestMapping("/caselist")
    public String caselist(String username){
        JSONObject jsonResult = new JSONObject();
        try{
            List list = caseService.getCaseListByUsername(username);
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
