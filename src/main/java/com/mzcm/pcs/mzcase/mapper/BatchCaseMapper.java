package com.mzcm.pcs.mzcase.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by xiaoi-010 on 2017/11/13.
 */
@Mapper
@Repository
public interface BatchCaseMapper {
    List getBatchCaseList();
}
