package com.mzcm.pcs.notice.service;

import com.mzcm.pcs.notice.dto.Mzcm_notice;
import com.mzcm.pcs.notice.mapper.NoticeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by xiaoi-010 on 2017/11/13.
 */
@Service
public class NoticeService {
    @Autowired
    NoticeMapper noticeMapper;

    public List getNoticeListByUsername(String username) {
        return noticeMapper.getNoticeListByUsername(username);
    }

    public Mzcm_notice getNoticeByNid(String nid) {
        return noticeMapper.getNoticeByNid(nid);
    }
}
