package com.compdevbooks.business.person;

import com.compdevbooks.dao.IDAO;
import com.compdevbooks.entity.IEntity;
import com.compdevbooks.entity.person.NaturalPerson;
import com.compdevbooks.util.RegularExpressionsEnum;

public class NaturalPersonBusiness extends PersonBusiness {

    public NaturalPersonBusiness(IDAO dao) {
        super(dao);
    }

    @Override
    public Exception validate(IEntity entity) {
        Exception e = super.validate(entity);
        StringBuilder str = new StringBuilder();
        NaturalPerson person = (NaturalPerson) entity;

        if (!person.getTitle().matches(RegularExpressionsEnum.TITLE.getRegExp()))
            str.append(RegularExpressionsEnum.TITLE.getErrorMsg());

        if (e!=null || str.length()>0) {
            if (e==null)
                e = new Exception(str.toString());
            else
                e.getMessage().concat(str.toString());
            return e;
        }

        return null;
    }
}
