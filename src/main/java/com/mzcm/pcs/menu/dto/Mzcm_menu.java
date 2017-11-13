package com.mzcm.pcs.menu.dto;

/**
 * Created by xiaoi-010 on 2017/11/13.
 */
public class Mzcm_menu {
    private String mid;
    private String menu_name;
    private String url;
    private String up_menu_id;
    private String module_id;
    private String seq;
    private String status;
    private String username;

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getMenu_name() {
        return menu_name;
    }

    public void setMenu_name(String menu_name) {
        this.menu_name = menu_name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUp_menu_id() {
        return up_menu_id;
    }

    public void setUp_menu_id(String up_menu_id) {
        this.up_menu_id = up_menu_id;
    }

    public String getModule_id() {
        return module_id;
    }

    public void setModule_id(String module_id) {
        this.module_id = module_id;
    }

    public String getSeq() {
        return seq;
    }

    public void setSeq(String seq) {
        this.seq = seq;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
