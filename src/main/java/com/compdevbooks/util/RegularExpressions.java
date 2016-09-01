package com.compdevbooks.util;

import java.io.IOException;
import java.util.Properties;

public enum RegularExpressions {

    NAME("[A-Za-z]{5,60}","name"),
    PHONE("([0-9]{2,3} [0-9]{3,5}-[0-9]{4}","phone"),
    NATIONAL_REGISTER("\\w+","nationalRegister"),
    TITLE("","");

    private final String regExp;
    private String errorMsg;

    RegularExpressions(String exp, String msg) {
        regExp = exp;
        errorMsg = "Unable to load. RegularExpressions.properties file must be in the same directory as the RegularExpressions.class";
        Properties props = new Properties();
        try {
            props.load(RegularExpressions.class.getResourceAsStream("RegularExpressions.properties"));
            errorMsg = props.getProperty(msg);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getRegExp() {
        return regExp;
    }

    public String getErrorMsg() {
        return errorMsg;
    }
}
