package br.com.compdevbooks.business.person;

import br.com.compdevbooks.dao.IDAO;
import br.com.compdevbooks.entity.IEntity;

public class LegalPersonBusiness extends PersonBusiness {

    private String stateRegistrationCode; //inscricao estadual
    private String tradingName;

    public LegalPersonBusiness(IDAO dao) {
        super(dao);
    }

    @Override
    public Exception validate(IEntity entity) {
        return null;
    }
}
