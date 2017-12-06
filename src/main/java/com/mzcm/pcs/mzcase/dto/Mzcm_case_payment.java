package com.mzcm.pcs.mzcase.dto;

/**
 * Created by xiaoi-010 on 2017-12-06.
 */
public class Mzcm_case_payment {
    private String payment_id = "";
    private String paymentdate = "";
    private String case_id = "";
    private String bak = "";
    private String creator = "";
    private String createdate = "";
    private String voucher_url = "";
    private double money;
    private String type = "";

    public String getPayment_id() {
        return payment_id;
    }

    public void setPayment_id(String payment_id) {
        this.payment_id = payment_id;
    }

    public String getPaymentdate() {
        return paymentdate;
    }

    public void setPaymentdate(String paymentdate) {
        this.paymentdate = paymentdate;
    }

    public String getCase_id() {
        return case_id;
    }

    public void setCase_id(String case_id) {
        this.case_id = case_id;
    }

    public String getBak() {
        return bak;
    }

    public void setBak(String bak) {
        this.bak = bak;
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

    public String getVoucher_url() {
        return voucher_url;
    }

    public void setVoucher_url(String voucher_url) {
        this.voucher_url = voucher_url;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
