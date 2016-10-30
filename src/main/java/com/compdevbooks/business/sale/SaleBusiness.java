package com.compdevbooks.business.sale;

import com.compdevbooks.business.ABusiness;
import com.compdevbooks.dao.IDAO;
import com.compdevbooks.entity.IEntity;
import com.compdevbooks.entity.product.Product;
import com.compdevbooks.entity.sale.Sale;

import java.util.Collection;

public class SaleBusiness extends ABusiness {

    public SaleBusiness(IDAO dao) {
        super(dao);
    }

    @Override
    public Exception validate(IEntity entity) {
        return null;
    }

    /*
        TODO: verificar os reais argumentos dessa operação. Talvez seja necessário criar um bean para pedidos?
     */
    public void registerRequest(Sale sale) {

    }

    public void denyRequest(Sale sale) {

    }

    public void approveRequest(Sale sale) {
        generateCommissions(sale);
    }

    public void generateCommissions(Sale sale) {

    }
}
