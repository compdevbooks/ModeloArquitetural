package br.com.compdevbooks.business.person;

import br.com.compdevbooks.dao.IDAO;
import br.com.compdevbooks.entity.IEntity;
import br.com.compdevbooks.entity.person.NaturalPerson;
import br.com.compdevbooks.util.RegularExpressions;

public class NaturalPersonBusiness extends PersonBusiness {

    public NaturalPersonBusiness(IDAO dao) {
        super(dao);
    }

    @Override
    public Exception validate(IEntity entity) {
        Exception e = super.validate(entity);
        StringBuilder str = new StringBuilder();
        NaturalPerson person = (NaturalPerson) entity;

        if (!person.getTitle().matches(RegularExpressions.TITLE.getRegExp()))
            str.append(RegularExpressions.TITLE.getErrorMsg());

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
