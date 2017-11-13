package com.mzcm.pcs.menu.mapper;

import com.mzcm.pcs.menu.dto.Mzcm_menu;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by xiaoi-010 on 2017/11/13.
 */
@Mapper
@Repository
public interface MenuMapper {
    List getMenuListByUsernameAndModuleId(Mzcm_menu menu);
    List getMenuListByUsername(String username);
    List getMenuListByUpMenuIds(List<String> ids);

    List getModuleListByMids(List<String> idlist);
}
