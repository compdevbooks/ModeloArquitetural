package com.compdevbooks.business.person;

import com.compdevbooks.business.ABusiness;
import com.compdevbooks.dao.IDAO;
import com.compdevbooks.entity.IEntity;
import com.compdevbooks.entity.address.Phone;
import com.compdevbooks.entity.person.Person;
import com.compdevbooks.util.RegularExpressions;
import com.compdevbooks.util.RegularExpressionsEnum;

public abstract class PersonBusiness extends ABusiness {

    public PersonBusiness(IDAO dao) {
        super(dao);
    }

    @Override
    public Exception validate(IEntity entity) {
        Person person = (Person) entity;
        StringBuilder str = new StringBuilder();

        if (!person.getName().matches(RegularExpressionsEnum.NAME.getRegExp()))
            str.append(RegularExpressionsEnum.NAME.getErrorMsg());

        try {
            String msg = RegularExpressions.validate("NAME",person.getName());
            str.append(msg==null?"":msg);
            for (Phone phone : person.getPhones()) {
                msg = RegularExpressions.validate("PHONE", phone.toString());
                str.append(msg == null ? "" : msg);
            }
            msg = RegularExpressions.validate("NATIONAL_REGISTER",person.getNationalRegister());
            str.append(msg==null?"":msg);
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (str.length()>0)
            return new Exception(str.toString());

        return null;
    }

    public static void main (String args[]) {
        //Locale.setDefault(new Locale("en","US"));
        if (!"123das".matches(RegularExpressionsEnum.NAME.getRegExp()))
            System.out.println (RegularExpressionsEnum.NAME.getErrorMsg());

        //OU
        try {
            System.out.println(RegularExpressions.validate("NAME","123ads"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
