package com.bjpowernode.crm.base.exception;

import com.bjpowernode.crm.base.constants.CrmExceptionEnum;


public class CrmException extends RuntimeException {


    private CrmExceptionEnum exceptionEnum;

    public CrmException(CrmExceptionEnum exceptionEnum) {
        super(exceptionEnum.getMess());//将异常信息放在堆栈信息中
        this.exceptionEnum = exceptionEnum;
    }


    public CrmExceptionEnum getExceptionEnum() {
        return exceptionEnum;
    }

    public void setExceptionEnum(CrmExceptionEnum exceptionEnum) {
        this.exceptionEnum = exceptionEnum;
    }
}