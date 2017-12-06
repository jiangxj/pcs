package com.mzcm.pcs.mzcase.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by xiaoi-010 on 2017-12-05.
 */
@Repository
@Mapper
public interface CaseRecordMapper {
    List getCaseRecordListByUsername(String username);

    List getCaseRecordList();
}
