package com.mzcm.pcs.mzcase.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.mzcm.pcs.mzcase.dto.Mzcm_case_record;
import com.mzcm.pcs.mzcase.mapper.CaseRecordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xiaoi-010 on 2017-12-05.
 */
@Service
public class CaseRecordService {
    @Autowired
    CaseRecordMapper caseRecordMapper;
    public Page getCaseRecordListByUsername(int intPageIndex, int intPageSize) {
        Page<Mzcm_case_record> pageObj = PageHelper.startPage(intPageIndex+1, intPageSize, true);
        caseRecordMapper.getCaseRecordList();
        return pageObj;
    }
}
