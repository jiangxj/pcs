package com.mzcm.pcs.mzcase.service;

import com.mzcm.pcs.mzcase.mapper.CaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by xiaoi-010 on 2017/11/14.
 */
@Service
public class CaseFileService {
    @Autowired
    CaseMapper caseMapper;

    public List getCaseFileListByUsername(String username) {
        return caseMapper.getCaseFileListByUsername();
    }
}
