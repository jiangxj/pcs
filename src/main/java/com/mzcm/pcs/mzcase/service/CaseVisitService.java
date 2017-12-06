package com.mzcm.pcs.mzcase.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.mzcm.pcs.mzcase.dto.Mzcm_case_visit;
import com.mzcm.pcs.mzcase.mapper.CaseVisitMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xiaoi-010 on 2017-12-06.
 */
@Service
public class CaseVisitService {
    @Autowired
    CaseVisitMapper caseVisitMapper;

    public Page getTodoCaseVisitList(String username, int intPageIndex, int intPageSize) {
        Page<Mzcm_case_visit> pageObj = PageHelper.startPage(intPageIndex+1, intPageSize, true);
        caseVisitMapper.getTodoCaseVisitList(username);
        return pageObj;
    }

    public Page getToArrangeCaseVisitList(String username, int intPageIndex, int intPageSize) {
        Page<Mzcm_case_visit> pageObj = PageHelper.startPage(intPageIndex+1, intPageSize, true);
        caseVisitMapper.getToArrangeCaseVisitList(username);
        return pageObj;
    }

    public Page getArrangeCaseVisitList(String username, int intPageIndex, int intPageSize) {
        Page<Mzcm_case_visit> pageObj = PageHelper.startPage(intPageIndex+1, intPageSize, true);
        caseVisitMapper.getArrangeCaseVisitList(username);
        return pageObj;
    }

    public Page getCaseVisitListByUsername(String username, int intPageIndex, int intPageSize) {
        Page<Mzcm_case_visit> pageObj = PageHelper.startPage(intPageIndex+1, intPageSize, true);
        caseVisitMapper.getCaseVisitListByUsername(username);
        return pageObj;
    }

    public Page getFinishCaseVisitList(String username, int intPageIndex, int intPageSize) {
        Page<Mzcm_case_visit> pageObj = PageHelper.startPage(intPageIndex+1, intPageSize, true);
        caseVisitMapper.getFinishCaseVisitList(username);
        return pageObj;
    }
}
