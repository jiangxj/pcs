package com.mzcm.pcs.uc3.service;

import com.mzcm.pcs.datasource.TargetDataSource;
import com.mzcm.pcs.uc3.mapper.Hion_AgentInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by xiaoi-010 on 2017/11/15.
 */
@Service
public class Hion_AgentInfoService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    Hion_AgentInfoMapper hion_AgentInfoMapper;

    @TargetDataSource(name="uc3")
    public List getHion_AgentInfoList() {
        return hion_AgentInfoMapper.getHion_AgentInfoList();
    }
}
