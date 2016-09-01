package br.com.compdevbooks.business.person;

import br.com.compdevbooks.dao.IDAO;
import br.com.compdevbooks.entity.IEntity;

public class SellerBusiness extends NaturalPersonBusiness {

    public SellerBusiness(IDAO dao) {
        super(dao);
    }

    @Override
    public Exception validate(IEntity entity) {
        return super.validate(entity);
    }

}
