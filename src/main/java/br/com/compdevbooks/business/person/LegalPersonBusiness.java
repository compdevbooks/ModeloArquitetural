package br.com.compdevbooks.business.person;

import br.com.compdevbooks.dao.IDAO;
import br.com.compdevbooks.entity.IEntity;
import br.com.compdevbooks.entity.person.LegalPerson;
import br.com.compdevbooks.util.RegularExpressions;

public class LegalPersonBusiness extends PersonBusiness {

    public LegalPersonBusiness(IDAO dao) {
        super(dao);
    }

    @Override
    public Exception validate(IEntity entity) {
        Exception e = super.validate(entity);
        StringBuilder str = new StringBuilder();
        LegalPerson person = (LegalPerson) entity;

        if (!person.getTradingName().matches(RegularExpressions.NAME.getRegExp()))
            str.append(RegularExpressions.NAME.getErrorMsg());

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
