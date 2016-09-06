package com.compdevbooks.util;

import java.util.ResourceBundle;

public enum RegularExpressionsEnum {

    NAME("[A-Za-z]{5,60}","name"),
    PHONE("([0-9]{2,3} [0-9]{3,5}-[0-9]{4}","phone"),
    NATIONAL_REGISTER("\\w+","nationalRegister"),
    TITLE("","");

    private final String regExp;
    private String errorMsg;

    RegularExpressionsEnum(String exp, String msg) {
        regExp = exp;
        errorMsg = "Unable to load. RegularExpressionsEnum.properties file must be in the same directory as the RegularExpressionsEnum.class";
        try {
            ResourceBundle bundle = ResourceBundle.getBundle("RegularExpressions");
            errorMsg = bundle.getString(msg);
        } catch(Exception e) {
//            e.printStackTrace();
        }
    }

    public String getRegExp() {
        return regExp;
    }

    public String getErrorMsg() {
        return errorMsg;
    }
}
