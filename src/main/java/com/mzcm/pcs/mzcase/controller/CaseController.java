package com.mzcm.pcs.mzcase.controller;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.Page;
import com.mzcm.pcs.commons.Constants;
import com.mzcm.pcs.mzcase.dto.Mzcm_case_contact;
import com.mzcm.pcs.mzcase.service.CaseService;
import com.mzcm.pcs.user.dto.Mzcm_user;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by xiaoi-010 on 2017/11/13.
 */
@RestController
@RequestMapping("/case")
public class CaseController {
    @Autowired
    CaseService caseService;

    @RequestMapping("/listAll")
    public String listAll(HttpServletRequest request, String pageIndex, String pageSize){
        JSONObject jsonResult = new JSONObject();
        try{
            int intPageIndex = Integer.parseInt(com.mzcm.pcs.commons.utils.StringUtils.blank2Default(pageIndex, "1"));
            int intPageSize = Integer.parseInt(com.mzcm.pcs.commons.utils.StringUtils.blank2Default(pageSize, "10"));
            HttpSession session = request.getSession();
            Mzcm_user user = (Mzcm_user)session.getAttribute(Constants.MZCM_USER);
            Page pageObj = caseService.getCaseList(intPageIndex, intPageSize);
            jsonResult.put("data", pageObj.getResult());
            jsonResult.put("total", pageObj.getTotal());
            jsonResult.put("statusCode", 0);
            jsonResult.put("statusMessage", "ok");
        }catch (Exception e){
            e.printStackTrace();
            jsonResult.put("statusCode", 1);
            jsonResult.put("statusMessage", "error");
        }
        return jsonResult.toJSONString();
    }

    @RequestMapping("/deptlist")
    public String deptlist(HttpServletRequest request, String pageIndex, String pageSize){
        JSONObject jsonResult = new JSONObject();
        try{
            int intPageIndex = Integer.parseInt(com.mzcm.pcs.commons.utils.StringUtils.blank2Default(pageIndex, "1"));
            int intPageSize = Integer.parseInt(com.mzcm.pcs.commons.utils.StringUtils.blank2Default(pageSize, "10"));
            HttpSession session = request.getSession();
            Mzcm_user user = (Mzcm_user)session.getAttribute(Constants.MZCM_USER);
            Page pageObj = caseService.getCaseList(user.getGroupid(), intPageIndex, intPageSize);
            jsonResult.put("data", pageObj.getResult());
            jsonResult.put("total", pageObj.getTotal());
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
    public String list(HttpServletRequest request, String pageIndex, String pageSize){
        JSONObject jsonResult = new JSONObject();
        try{
            int intPageIndex = Integer.parseInt(com.mzcm.pcs.commons.utils.StringUtils.blank2Default(pageIndex, "1"));
            int intPageSize = Integer.parseInt(com.mzcm.pcs.commons.utils.StringUtils.blank2Default(pageSize, "10"));
            HttpSession session = request.getSession();
            Mzcm_user user = (Mzcm_user)session.getAttribute(Constants.MZCM_USER);
            Page pageObj = caseService.getCaseListByUsername(user.getUsername(), intPageIndex, intPageSize);
            jsonResult.put("data", pageObj.getResult());
            jsonResult.put("total", pageObj.getTotal());
            jsonResult.put("statusCode", 0);
            jsonResult.put("statusMessage", "ok");
        }catch (Exception e){
            e.printStackTrace();
            jsonResult.put("statusCode", 1);
            jsonResult.put("statusMessage", "error");
        }
        return jsonResult.toJSONString();
    }


    @RequestMapping("/listfile")
    public String listfile(HttpServletRequest request, String pageIndex, String pageSize){
        JSONObject jsonResult = new JSONObject();
        try{
            int intPageIndex = Integer.parseInt(com.mzcm.pcs.commons.utils.StringUtils.blank2Default(pageIndex, "1"));
            int intPageSize = Integer.parseInt(com.mzcm.pcs.commons.utils.StringUtils.blank2Default(pageSize, "10"));
            HttpSession session = request.getSession();
            Mzcm_user user = (Mzcm_user)session.getAttribute(Constants.MZCM_USER);
            Page pageObj = caseService.getCaseFileList(intPageIndex, intPageSize);
            jsonResult.put("data", pageObj.getResult());
            jsonResult.put("total", pageObj.getTotal());
            jsonResult.put("statusCode", 0);
            jsonResult.put("statusMessage", "ok");
        }catch (Exception e){
            e.printStackTrace();
            jsonResult.put("statusCode", 1);
            jsonResult.put("statusMessage", "error");
        }
        return jsonResult.toJSONString();
    }

    @RequestMapping("/import")
    public String importCase(HttpServletRequest request, MultipartFile casefile){
        JSONObject jsonResult = new JSONObject();
        Workbook wookbook = null;
        try{
            HttpSession session = request.getSession();
            Mzcm_user user = (Mzcm_user)session.getAttribute(Constants.MZCM_USER);
            if(StringUtils.endsWithIgnoreCase(casefile.getOriginalFilename(), "xls")){
                wookbook = new HSSFWorkbook(casefile.getInputStream());
            }else{
                wookbook = new XSSFWorkbook(casefile.getInputStream());
            }
            boolean flag = caseService.importCase(wookbook, user.getUsername());
            jsonResult.put("data", flag);
            jsonResult.put("statusCode", 0);
            jsonResult.put("statusMessage", "ok");
        }catch (Exception e){
            e.printStackTrace();
            jsonResult.put("statusCode", 1);
            jsonResult.put("statusMessage", "error");
        }
        return jsonResult.toJSONString();
    }

    @RequestMapping("/allocate")
    public String allocateCase(HttpServletRequest request, String cids, String touser){
        JSONObject jsonResult = new JSONObject();
        try{
            HttpSession session = request.getSession();
            Mzcm_user user = (Mzcm_user)session.getAttribute(Constants.MZCM_USER);
            boolean flag = caseService.allocateCase(cids.split(","), touser, user.getUsername());
            jsonResult.put("data", flag);
            jsonResult.put("statusCode", 0);
            jsonResult.put("statusMessage", "ok");
        }catch (Exception e){
            e.printStackTrace();
            jsonResult.put("statusCode", 1);
            jsonResult.put("statusMessage", "error");
        }
        return jsonResult.toJSONString();
    }

    @RequestMapping("/updateprogress")
    public String updateProgress(HttpServletRequest request, String cid){
        JSONObject jsonResult = new JSONObject();
        try{
            HttpSession session = request.getSession();
            Mzcm_user user = (Mzcm_user)session.getAttribute(Constants.MZCM_USER);
            boolean flag = caseService.updateProgress(cid, user.getUsername());
            jsonResult.put("data", flag);
            jsonResult.put("statusCode", 0);
            jsonResult.put("statusMessage", "ok");
        }catch (Exception e){
            e.printStackTrace();
            jsonResult.put("statusCode", 1);
            jsonResult.put("statusMessage", "error");
        }
        return jsonResult.toJSONString();
    }

    @RequestMapping("/updatestatus")
    public String updateStatus(HttpServletRequest request, String cid){
        JSONObject jsonResult = new JSONObject();
        try{
            HttpSession session = request.getSession();
            Mzcm_user user = (Mzcm_user)session.getAttribute(Constants.MZCM_USER);
            boolean flag = caseService.updateStatus(cid, user.getUsername());
            jsonResult.put("data", flag);
            jsonResult.put("statusCode", 0);
            jsonResult.put("statusMessage", "ok");
        }catch (Exception e){
            e.printStackTrace();
            jsonResult.put("statusCode", 1);
            jsonResult.put("statusMessage", "error");
        }
        return jsonResult.toJSONString();
    }

    @RequestMapping("/reallocate")
    public String reallocate(HttpServletRequest request, String cid, String touser){
        JSONObject jsonResult = new JSONObject();
        try{
            HttpSession session = request.getSession();
            Mzcm_user user = (Mzcm_user)session.getAttribute(Constants.MZCM_USER);
            boolean flag = caseService.reallocate(cid, user.getUsername(), touser);
            jsonResult.put("data", flag);
            jsonResult.put("statusCode", 0);
            jsonResult.put("statusMessage", "ok");
        }catch (Exception e){
            e.printStackTrace();
            jsonResult.put("statusCode", 1);
            jsonResult.put("statusMessage", "error");
        }
        return jsonResult.toJSONString();
    }

    @RequestMapping("/addcontact")
    public String addContact(HttpServletRequest request, Mzcm_case_contact case_contact){
        JSONObject jsonResult = new JSONObject();
        try{
            HttpSession session = request.getSession();
            Mzcm_user user = (Mzcm_user)session.getAttribute(Constants.MZCM_USER);
            boolean flag = caseService.addContact(case_contact, user.getUsername());
            jsonResult.put("data", flag);
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
