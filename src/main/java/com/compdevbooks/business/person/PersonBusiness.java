package com.compdevbooks.business.person;

import com.compdevbooks.business.ABusiness;
import com.compdevbooks.dao.IDAO;
import com.compdevbooks.entity.IEntity;
import com.compdevbooks.entity.person.Person;
import com.compdevbooks.util.RegularExpressions;

public abstract class PersonBusiness extends ABusiness {

    public PersonBusiness(IDAO dao) {
        super(dao);
    }

    @Override
    public Exception validate(IEntity entity) {
        Person person = (Person) entity;
        StringBuilder str = new StringBuilder();

        if (!person.getName().matches(RegularExpressions.NAME.getRegExp()))
            str.append(RegularExpressions.NAME.getErrorMsg());

        if (person.getPhones()==null || person.getPhones().size()==0)
            str.append(RegularExpressions.PHONE.getErrorMsg());

        if (!person.getNationalRegister().matches(RegularExpressions.NATIONAL_REGISTER.getRegExp()))
            str.append(RegularExpressions.NATIONAL_REGISTER.getErrorMsg());

        if (str.length()>0)
            return new Exception(str.toString());

        return null;
    }

}
