package br.com.compdevbooks.business.person;

import br.com.compdevbooks.dao.IDAO;
import br.com.compdevbooks.entity.IEntity;
import br.com.compdevbooks.entity.address.City;
import br.com.compdevbooks.entity.person.Client;

import java.util.Set;

public class SellerBusiness extends NaturalPersonBusiness {

    private Set<City> cityList;
    private Set<Client> clientList;

    public SellerBusiness(IDAO dao) {
        super(dao);
    }

    @Override
    public Exception validate(IEntity entity) {
        return null;
    }
}
