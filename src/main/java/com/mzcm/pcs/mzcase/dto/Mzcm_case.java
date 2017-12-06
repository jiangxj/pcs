package com.mzcm.pcs.mzcase.dto;

/**
 * Created by xiaoi-010 on 2017-11-27.
 */
public class Mzcm_case {
    /** 批次编号 */
    private String batch_id = "";
    /** 案件编号 */
    private String case_id = "";
    /** 委托单位 */
    private String unit = "";
    /** 姓名 */
    private String realname = "";
    /** 身份证号 */
    private String id_card_no = "";
    /** 手机号 */
    private String mobile_phone = "";
    /** 银行卡号 */
    private String bank_card_no = "";
    /** 银行卡开户行 */
    private String bank;
    /** 借款日期 */
    private String borrow_date = "";
    /** 应还款日期 */
    private String repayment_date = "";
    /** 逾期天数 */
    private int overdue_days;
    /** 原始本金 */
    private double orign_principal;
    /** 本金 */
    private double principal;
    /** 滞纳金 */
    private double late_fee;
    /** 应还金额 */
    private double yhje;
    /** 已还金额 */
    private double yihje;
    /** 未还金额 */
    private double whje;
    /** 还款状态 */
    private String repayment_status;
    /** 最后催收时间 */
    private String lastestdate = "";
    /** 经办人 */
    private String operator = "";
    /** 案件状态 */
    private String status = "";
    /** 档案状态 */
    private String file_status = "";
    /** 委托日期 */
    private String casedate;

    public String getBatch_id() {
        return batch_id;
    }

    public void setBatch_id(String batch_id) {
        this.batch_id = batch_id;
    }

    public String getCase_id() {
        return case_id;
    }

    public void setCase_id(String case_id) {
        this.case_id = case_id;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getId_card_no() {
        return id_card_no;
    }

    public void setId_card_no(String id_card_no) {
        this.id_card_no = id_card_no;
    }

    public String getMobile_phone() {
        return mobile_phone;
    }

    public void setMobile_phone(String mobile_phone) {
        this.mobile_phone = mobile_phone;
    }

    public String getBank_card_no() {
        return bank_card_no;
    }

    public void setBank_card_no(String bank_card_no) {
        this.bank_card_no = bank_card_no;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getBorrow_date() {
        return borrow_date;
    }

    public void setBorrow_date(String borrow_date) {
        this.borrow_date = borrow_date;
    }

    public String getRepayment_date() {
        return repayment_date;
    }

    public void setRepayment_date(String repayment_date) {
        this.repayment_date = repayment_date;
    }

    public int getOverdue_days() {
        return overdue_days;
    }

    public void setOverdue_days(int overdue_days) {
        this.overdue_days = overdue_days;
    }

    public double getOrign_principal() {
        return orign_principal;
    }

    public void setOrign_principal(double orign_principal) {
        this.orign_principal = orign_principal;
    }

    public double getPrincipal() {
        return principal;
    }

    public void setPrincipal(double principal) {
        this.principal = principal;
    }

    public double getLate_fee() {
        return late_fee;
    }

    public void setLate_fee(double late_fee) {
        this.late_fee = late_fee;
    }

    public double getYhje() {
        return yhje;
    }

    public void setYhje(double yhje) {
        this.yhje = yhje;
    }

    public double getYihje() {
        return yihje;
    }

    public void setYihje(double yihje) {
        this.yihje = yihje;
    }

    public double getWhje() {
        return whje;
    }

    public void setWhje(double whje) {
        this.whje = whje;
    }

    public String getRepayment_status() {
        return repayment_status;
    }

    public void setRepayment_status(String repayment_status) {
        this.repayment_status = repayment_status;
    }

    public String getLastestdate() {
        return lastestdate;
    }

    public void setLastestdate(String lastestdate) {
        this.lastestdate = lastestdate;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFile_status() {
        return file_status;
    }

    public void setFile_status(String file_status) {
        this.file_status = file_status;
    }

    public String getCasedate() {
        return casedate;
    }

    public void setCasedate(String casedate) {
        this.casedate = casedate;
    }
}
