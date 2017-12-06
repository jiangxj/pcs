package com.mzcm.pcs.mzcase.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.mzcm.pcs.mzcase.dto.Mzcm_case_teamwork;
import com.mzcm.pcs.mzcase.mapper.CaseTeamworkMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xiaoi-010 on 2017-12-06.
 */
@Service
public class CaseTeamworkService {
    @Autowired
    CaseTeamworkMapper caseTeamworkMapper;

    public Page getTodoCaseTeamworkList(String username, int intPageIndex, int intPageSize) {
        Page<Mzcm_case_teamwork> pageObj = PageHelper.startPage(intPageIndex+1, intPageSize, true);
        caseTeamworkMapper.getTodoCaseTeamworkList(username);
        return pageObj;
    }

    public Page getCaseTeamworkListByUsername(String username, int intPageIndex, int intPageSize) {
        Page<Mzcm_case_teamwork> pageObj = PageHelper.startPage(intPageIndex+1, intPageSize, true);
        caseTeamworkMapper.getCaseTeamworkListByUsername(username);
        return pageObj;
    }
}
