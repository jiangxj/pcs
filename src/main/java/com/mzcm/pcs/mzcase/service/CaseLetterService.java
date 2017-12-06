package com.mzcm.pcs.mzcase.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.mzcm.pcs.mzcase.dto.Mzcm_case_letter;
import com.mzcm.pcs.mzcase.mapper.CaseLetterMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xiaoi-010 on 2017-12-06.
 */
@Service
public class CaseLetterService {
    @Autowired
    CaseLetterMapper caseLetterMapper;
    public Page getTodoCaseLetterList(String username, int intPageIndex, int intPageSize) {
        Page<Mzcm_case_letter> pageObj = PageHelper.startPage(intPageIndex+1, intPageSize, true);
        caseLetterMapper.getTodoCaseLetterList(username);
        return pageObj;
    }

    public Page getCaseLetterListByUsername(String username, int intPageIndex, int intPageSize) {
        Page<Mzcm_case_letter> pageObj = PageHelper.startPage(intPageIndex+1, intPageSize, true);
        caseLetterMapper.getCaseLetterListByUsername(username);
        return pageObj;
    }
}
