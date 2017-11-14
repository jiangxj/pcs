package com.mzcm.pcs.mzcase.service;

import com.mzcm.pcs.mzcase.mapper.SMSMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by xiaoi-010 on 2017/11/14.
 */
@Service
public class SMSService {
    @Autowired
    SMSMapper smsMapper;
    public int countUnreadMessage(String username) {
        return smsMapper.getSMSCountForUnread(username);
    }

    public List getSMSListByCreator(String username) {
        return smsMapper.getSMSListByCreator(username);
    }
}
