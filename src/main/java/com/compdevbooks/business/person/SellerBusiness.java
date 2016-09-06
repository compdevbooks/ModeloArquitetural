package com.compdevbooks.business.person;

import com.compdevbooks.dao.IDAO;
import com.compdevbooks.dao.memory.person.SellerDAO;
import com.compdevbooks.entity.IEntity;
import com.compdevbooks.entity.address.City;
import com.compdevbooks.entity.person.Seller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SellerBusiness extends NaturalPersonBusiness {

    public SellerBusiness(IDAO dao) {
        super(dao);
    }

    @Override
    public Exception validate(IEntity entity) {
        return super.validate(entity);
    }

    public List<Seller> getByCity(City city) {
        return ((SellerDAO)dao).getByCity(city);
    }

}
