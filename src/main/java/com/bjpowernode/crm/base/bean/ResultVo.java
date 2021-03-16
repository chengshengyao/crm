package com.bjpowernode.crm.base.bean;


public class ResultVo {

    private boolean success;

    private String mess;

    @Override
    public String toString() {
        return "ResultVo{" +
                "success=" + success +
                ", mess='" + mess + '\'' +
                '}';
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMess() {
        return mess;
    }

    public void setMess(String mess) {
        this.mess = mess;
    }
}