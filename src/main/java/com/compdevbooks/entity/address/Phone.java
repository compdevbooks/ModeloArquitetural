package com.compdevbooks.entity.address;

public class Phone {
    
    private String countryCode;
    private String areaCode;
    private String number;
    private PhoneUseType phoneUseType;
    private PhoneType phoneType;

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public PhoneUseType getPhoneUseType() {
        return phoneUseType;
    }

    public void setPhoneUseType(PhoneUseType phoneUseType) {
        this.phoneUseType = phoneUseType;
    }

    public PhoneType getPhoneType() {
        return phoneType;
    }

    public void setPhoneType(PhoneType phoneType) {
        this.phoneType = phoneType;
    }

    public String toString() {
        return "("+areaCode+") " + number;
    }
}

