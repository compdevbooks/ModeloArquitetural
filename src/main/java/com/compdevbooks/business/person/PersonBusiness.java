package com.compdevbooks.business.person;

import com.compdevbooks.business.ABusiness;
import com.compdevbooks.dao.IDAO;
import com.compdevbooks.entity.IEntity;
import com.compdevbooks.entity.person.Person;
import com.compdevbooks.util.Messagesi18N;
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

        if (person.getPhones()==null || person.getPhones().size()==0)
            str.append(RegularExpressionsEnum.PHONE.getErrorMsg());

        if (!person.getNationalRegister().matches(RegularExpressionsEnum.NATIONAL_REGISTER.getRegExp()))
            str.append(RegularExpressionsEnum.NATIONAL_REGISTER.getErrorMsg());

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
            System.out.println(Messagesi18N.validate("NAME","123ads"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
