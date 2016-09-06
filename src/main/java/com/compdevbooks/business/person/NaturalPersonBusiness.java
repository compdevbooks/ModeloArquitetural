package com.compdevbooks.business.person;

import com.compdevbooks.dao.IDAO;
import com.compdevbooks.entity.IEntity;
import com.compdevbooks.entity.person.NaturalPerson;
import com.compdevbooks.util.RegularExpressions;
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

        try {
            String msg = RegularExpressions.validate("TITLE",person.getTitle());
            str.append(msg==null?"":msg);
        } catch (Exception e1) {
            e1.printStackTrace();
        }

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
