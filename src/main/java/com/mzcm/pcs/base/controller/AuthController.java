package com.mzcm.pcs.base.controller;

import com.alibaba.fastjson.JSONObject;
import com.mzcm.pcs.base.dto.Mzcm_menu;
import com.mzcm.pcs.user.dto.Mzcm_user;
import com.mzcm.pcs.base.service.AuthService;
import com.mzcm.pcs.commons.Constants;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by xiaoi-010 on 2017/11/13.
 */
@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    AuthService authService;

    @RequestMapping("/menulist")
    public String menulist(HttpServletRequest request, String moduleid){
        JSONObject jsonResult = new JSONObject();
        try{
            HttpSession session = request.getSession();
            Mzcm_user user = (Mzcm_user)session.getAttribute(Constants.MZCM_USER);
            Mzcm_menu menu = new Mzcm_menu();
            menu.setModule_id(moduleid);
            menu.setUsername(user.getUsername());
            List dataList = new ArrayList();
            if(StringUtils.isNotBlank(moduleid)){
                dataList = authService.getMenuListByUsernameAndModuleId(menu);
            }
            jsonResult.put("data", dataList);
            jsonResult.put("statusCode", 0);
            jsonResult.put("statusMessage", "ok");
        }catch (Exception e){
            e.printStackTrace();
            jsonResult.put("statusCode", 0);
            jsonResult.put("statusMessage", "error");
        }
        return jsonResult.toJSONString();
    }

    @RequestMapping("/modulelist")
    public String modulelist(HttpServletRequest request){
        JSONObject jsonResult = new JSONObject();
        try{
            HttpSession session = request.getSession();
            Mzcm_user user = (Mzcm_user)session.getAttribute(Constants.MZCM_USER);
            List list = authService.getModuleListByUsername(user.getUsername());
            jsonResult.put("data", list);
            jsonResult.put("statusCode", 0);
            jsonResult.put("statusMessage", "ok");
        }catch (Exception e){
            e.printStackTrace();
            jsonResult.put("statusCode", 0);
            jsonResult.put("statusMessage", "error");
        }
        return jsonResult.toJSONString();
    }

    @RequestMapping("/login")
    public String login(HttpServletRequest request, String username, String password){
        JSONObject jsonResult = new JSONObject();
        try{
            HttpSession session = request.getSession();
            Mzcm_user user = authService.login(username, password);
            boolean flag = false;
            if(user != null){
                flag = true;
                session.setAttribute(Constants.MZCM_USER, user);
            }
            jsonResult.put("data", flag);
            jsonResult.put("statusCode", 0);
            jsonResult.put("statusMessage", "ok");
        }catch (Exception e){
            e.printStackTrace();
            jsonResult.put("statusCode", 0);
            jsonResult.put("statusMessage", "error");
        }
        return jsonResult.toJSONString();
    }

    @RequestMapping("/logout")
    public String logout(HttpServletRequest request){
        JSONObject jsonResult = new JSONObject();
        try{
            HttpSession session = request.getSession();
            session.invalidate();
            jsonResult.put("statusCode", 0);
            jsonResult.put("statusMessage", "ok");
        }catch (Exception e){
            e.printStackTrace();
            jsonResult.put("statusCode", 0);
            jsonResult.put("statusMessage", "error");
        }
        return jsonResult.toJSONString();
    }

    @RequestMapping("/realname")
    public String realname(HttpServletRequest request){
        JSONObject jsonResult = new JSONObject();
        try{
            HttpSession session = request.getSession();
            Mzcm_user user = (Mzcm_user)session.getAttribute(Constants.MZCM_USER);
            jsonResult.put("data", user.getRealname());
            jsonResult.put("statusCode", 0);
            jsonResult.put("statusMessage", "ok");
        }catch (Exception e){
            e.printStackTrace();
            jsonResult.put("statusCode", 0);
            jsonResult.put("statusMessage", "error");
        }
        return jsonResult.toJSONString();
    }
}
