package com.mzcm.pcs.mzcase.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.mzcm.pcs.mzcase.dto.Mzcm_batch_case;
import com.mzcm.pcs.mzcase.mapper.BatchCaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by xiaoi-010 on 2017-12-04.
 */
@Service
public class BatchCaseService {
    @Autowired
    BatchCaseMapper batchCaseMapper;
    public Page getBatchCaseList(int intPageIndex, int intPageSize) {
        Page<Mzcm_batch_case> page = PageHelper.startPage(intPageIndex+1, intPageSize, true);
        batchCaseMapper.getBatchCaseList();
        return page;
    }
}
