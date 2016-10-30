package com.compdevbooks.business.payment;

import com.compdevbooks.business.ABusiness;
import com.compdevbooks.dao.IDAO;
import com.compdevbooks.entity.IEntity;
import com.compdevbooks.entity.sale.Sale;

public class PaymentBusiness extends ABusiness{

    public PaymentBusiness(IDAO dao) {
        super(dao);
    }

    @Override
    public Exception validate(IEntity entity) {
        return null;
    }

    public void processSalePayment(Sale sale) {

    }
}
