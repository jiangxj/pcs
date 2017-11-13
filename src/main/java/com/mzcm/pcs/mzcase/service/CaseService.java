package com.mzcm.pcs.mzcase.service;

import com.mzcm.pcs.mzcase.mapper.CaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by xiaoi-010 on 2017/11/13.
 */
@Service
public class CaseService {
    @Autowired
    CaseMapper caseMapper;
    public List getCaseListByUsername(String username){
        return caseMapper.getCaseListByUsername(username);
    }
}
