package com.compdevbooks.business.person;

import com.compdevbooks.dao.IDAO;
import com.compdevbooks.entity.IEntity;
import com.compdevbooks.entity.person.Client;

import java.util.List;

public class ClientBusiness extends LegalPersonBusiness {

    public ClientBusiness(IDAO dao) {
        super(dao);
    }

    @Override
    public Exception validate(IEntity entity) {
        return super.validate(entity);
    }

    public List<Client> getByPendingPayment() {
        return null;
    }

}
