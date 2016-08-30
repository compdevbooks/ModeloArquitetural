package br.com.compdevbooks.business.person;

import br.com.compdevbooks.dao.IDAO;
import br.com.compdevbooks.entity.IEntity;
import br.com.compdevbooks.entity.product.Product;

import java.util.Set;

public class ManufacturerBusiness extends LegalPersonBusiness {

    private Set<Product> productList;

    public ManufacturerBusiness(IDAO dao) {
        super(dao);
    }

    @Override
    public Exception validate(IEntity entity) {
        return null;
    }
}
