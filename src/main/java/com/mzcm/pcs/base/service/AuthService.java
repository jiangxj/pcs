package com.mzcm.pcs.base.service;

import com.mzcm.pcs.base.dto.Mzcm_menu;
import com.mzcm.pcs.user.dto.Mzcm_user;
import com.mzcm.pcs.base.mapper.MenuMapper;
import com.mzcm.pcs.user.mapper.UserMapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xiaoi-010 on 2017/11/13.
 */
@Service
public class AuthService {
    @Autowired
    MenuMapper menuMapper;

    @Autowired
    UserMapper userMapper;

    public List getMenuListByUsernameAndModuleId(Mzcm_menu menu){
        List<Mzcm_menu> list = menuMapper.getMenuListByUsernameAndModuleId(menu);
        List<String> idlist = new ArrayList();
        for (Mzcm_menu m: list) {
            idlist.add(m.getUp_menu_id());
        }
        List list2 = menuMapper.getMenuListByUpMenuIds(idlist);
        list.addAll(list2);
        return list;
    }

    public List getModuleListByUsername(String username){
        List<Mzcm_menu> list = menuMapper.getMenuListByUsername(username);
        List<String> idlist = new ArrayList();
        for (Mzcm_menu menu: list) {
            if (idlist.contains(menu.getModule_id())){
                continue;
            }
            idlist.add(menu.getModule_id());
        }
        return menuMapper.getModuleListByMids(idlist);
    }

    public Mzcm_user login(String username, String password) {
        Mzcm_user user = userMapper.getUserByUsername(username);
        if(user == null){
            return null;
        }
        if(StringUtils.equals(user.getPassword(), password)){
            return user;
        }
        return null;
    }
}
