package com.zizo.object;

/**
 * Created by dengy on 2016/6/27.
 */
public class ReturnUtil {
    public Object retVal;
    public Object retObj;
    public Object retCode;
    public Object retMsg;

    public ReturnUtil(Object retVal, Object retObj, Object retCode, Object retMsg) {
        this.retVal = retVal;
        this.retObj = retObj;
        this.retCode = retCode;
        this.retMsg = String.valueOf(retMsg);
    }
}
