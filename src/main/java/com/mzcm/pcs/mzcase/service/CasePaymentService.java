package com.mzcm.pcs.mzcase.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.mzcm.pcs.mzcase.dto.Mzcm_case_payment;
import com.mzcm.pcs.mzcase.mapper.CasePaymentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xiaoi-010 on 2017-12-06.
 */
@Service
public class CasePaymentService {
    @Autowired
    CasePaymentMapper casePaymentMapper;

    public Page getCasePaymentListByUsername(String username, int intPageIndex, int intPageSize) {
        Page<Mzcm_case_payment> pageObj = PageHelper.startPage(intPageIndex+1, intPageSize, true);
        casePaymentMapper.getCasePaymentListByUsername(username);
        return pageObj;
    }
}
