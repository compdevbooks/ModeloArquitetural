package com.compdevbooks.business.person;

import com.compdevbooks.dao.IDAO;
import com.compdevbooks.entity.IEntity;

public class SellerBusiness extends NaturalPersonBusiness {

    public SellerBusiness(IDAO dao) {
        super(dao);
    }

    @Override
    public Exception validate(IEntity entity) {
        return super.validate(entity);
    }

}
