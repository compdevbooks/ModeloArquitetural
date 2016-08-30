package br.com.compdevbooks.business.person;

import br.com.compdevbooks.dao.IDAO;
import br.com.compdevbooks.entity.IEntity;
import br.com.compdevbooks.entity.person.Seller;

public class ClientBusiness extends LegalPersonBusiness {
    
    private Seller seller;

    public ClientBusiness(IDAO dao) {
        super(dao);
    }

    @Override
    public Exception validate(IEntity entity) {
        return null;
    }
}
