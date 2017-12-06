package com.mzcm.pcs.mzcase.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by xiaoi-010 on 2017-12-06.
 */
@Repository
@Mapper
public interface CaseVisitMapper {

    List getTodoCaseVisitList(String username);

    List getToArrangeCaseVisitList(String username);

    List getArrangeCaseVisitList(String username);

    List getCaseVisitListByUsername(String username);

    List getFinishCaseVisitList(String username);
}
