package com.mzcm.pcs.mzcase.dto;

/**
 * Created by xiaoi-010 on 2017-12-04.
 */
public class Mzcm_case_visit {
    /** 主键 */
    private String visit_id = "";
    /** 案件编号 */
    private String case_id = "";
    /** 标题 */
    private String title = "";
    /** 外访同伴 */
    private String partner = "";
    /** 外访人 */
    private String creator = "";
    /** 外访时间 */
    private String createdate = "";
    /** 审核状态 */
    private String status = "";
    /** 外访地址 */
    private String address = "";

    private String audit_status = "";

    private String auditor = "";

    private String auditdate = "";

    public String getVisit_id() {
        return visit_id;
    }

    public void setVisit_id(String visit_id) {
        this.visit_id = visit_id;
    }

    public String getCase_id() {
        return case_id;
    }

    public void setCase_id(String case_id) {
        this.case_id = case_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPartner() {
        return partner;
    }

    public void setPartner(String partner) {
        this.partner = partner;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getCreatedate() {
        return createdate;
    }

    public void setCreatedate(String createdate) {
        this.createdate = createdate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAudit_status() {
        return audit_status;
    }

    public void setAudit_status(String audit_status) {
        this.audit_status = audit_status;
    }

    public String getAuditor() {
        return auditor;
    }

    public void setAuditor(String auditor) {
        this.auditor = auditor;
    }

    public String getAuditdate() {
        return auditdate;
    }

    public void setAuditdate(String auditdate) {
        this.auditdate = auditdate;
    }
}
