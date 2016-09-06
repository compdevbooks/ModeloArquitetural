package com.compdevbooks.business.person;

import com.compdevbooks.dao.IDAO;
import com.compdevbooks.entity.IEntity;
import com.compdevbooks.entity.person.LegalPerson;
import com.compdevbooks.util.RegularExpressions;
import com.compdevbooks.util.RegularExpressionsEnum;

public class LegalPersonBusiness extends PersonBusiness {

    public LegalPersonBusiness(IDAO dao) {
        super(dao);
    }

    @Override
    public Exception validate(IEntity entity) {
        Exception e = super.validate(entity);
        StringBuilder str = new StringBuilder();
        LegalPerson person = (LegalPerson) entity;

        try {
            String msg = RegularExpressions.validate("NAME",person.getTradingName());
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
