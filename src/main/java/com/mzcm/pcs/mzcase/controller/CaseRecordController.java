package com.mzcm.pcs.mzcase.controller;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.Page;
import com.mzcm.pcs.commons.Constants;
import com.mzcm.pcs.mzcase.service.CaseRecordService;
import com.mzcm.pcs.user.dto.Mzcm_user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by xiaoi-010 on 2017-12-05.
 */
@RestController
@RequestMapping("/record")
public class CaseRecordController {
    @Autowired
    CaseRecordService caseRecordService;

    @RequestMapping("/list")
    public String list(HttpServletRequest request, String pageIndex, String pageSize){
        JSONObject jsonResult = new JSONObject();
        try{
            int intPageIndex = Integer.parseInt(com.mzcm.pcs.commons.utils.StringUtils.blank2Default(pageIndex, "1"));
            int intPageSize = Integer.parseInt(com.mzcm.pcs.commons.utils.StringUtils.blank2Default(pageSize, "10"));
            HttpSession session = request.getSession();
            Mzcm_user user = (Mzcm_user)session.getAttribute(Constants.MZCM_USER);
            Page pageObj = caseRecordService.getCaseRecordListByUsername(intPageIndex, intPageSize);
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
}
