package com.mzcm.pcs.notice.controller;

import com.alibaba.fastjson.JSONObject;
import com.mzcm.pcs.notice.dto.Mzcm_notice;
import com.mzcm.pcs.notice.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by xiaoi-010 on 2017/11/13.
 */
@RestController
@RequestMapping("/notice")
public class NoticeController {
    @Autowired
    NoticeService noticeService;

    @RequestMapping("/noticelist")
    public String noticelist(String username){
        JSONObject jsonResult = new JSONObject();
        try{
            List list = noticeService.getNoticeListByUsername(username);
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

    @RequestMapping("/noticedetail")
    public String noticeDetail(String username){
        JSONObject jsonResult = new JSONObject();
        try{
            Mzcm_notice notice = noticeService.getNoticeByNid(username);
            jsonResult.put("data", notice);
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
