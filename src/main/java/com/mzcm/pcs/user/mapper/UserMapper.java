package com.mzcm.pcs.user.mapper;

import com.mzcm.pcs.user.dto.Mzcm_user;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * Created by xiaoi-010 on 2017/11/13.
 */
@Mapper
@Repository
public interface UserMapper {
    Mzcm_user getUserByUsername(String username);
}
