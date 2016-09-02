package com.compdevbooks.business.person;

import com.compdevbooks.dao.IDAO;
import com.compdevbooks.entity.IEntity;
import com.compdevbooks.entity.person.LegalPerson;
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

        if (!person.getTradingName().matches(RegularExpressionsEnum.NAME.getRegExp()))
            str.append(RegularExpressionsEnum.NAME.getErrorMsg());

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
