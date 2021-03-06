package com.mzcm.pcs.mzcase.controller;

import com.alibaba.fastjson.JSONObject;
import com.mzcm.pcs.commons.Constants;
import com.mzcm.pcs.mzcase.service.SMSService;
import com.mzcm.pcs.user.dto.Mzcm_user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by xiaoi-010 on 2017/11/14.
 */
@RestController
@RequestMapping("/sms")
public class SMSController {

    @Autowired
    SMSService smsService;

    @RequestMapping("/countunread")
    public String count(HttpServletRequest request){
        JSONObject jsonResult = new JSONObject();
        try{
            HttpSession session = request.getSession();
            Mzcm_user user = (Mzcm_user)session.getAttribute(Constants.MZCM_USER);
            int count = smsService.countUnreadMessage(user.getUsername());
            jsonResult.put("data", count);
            jsonResult.put("statusCode", 0);
            jsonResult.put("statusMessage", "ok");
        }catch (Exception e){
            e.printStackTrace();
            jsonResult.put("statusCode", 1);
            jsonResult.put("statusMessage", "error");
        }
        return jsonResult.toJSONString();
    }

    @RequestMapping("/list")
    public String list(HttpServletRequest request){
        JSONObject jsonResult = new JSONObject();
        try{
            HttpSession session = request.getSession();
            Mzcm_user user = (Mzcm_user)session.getAttribute(Constants.MZCM_USER);
            List list = smsService.getSMSListByCreator(user.getUsername());
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
