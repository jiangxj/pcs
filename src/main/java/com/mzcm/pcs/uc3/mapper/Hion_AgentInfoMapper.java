package com.mzcm.pcs.uc3.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by xiaoi-010 on 2017/11/15.
 */
@Mapper
@Repository
public interface Hion_AgentInfoMapper {
    List getHion_AgentInfoList();
}
