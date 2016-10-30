package com.compdevbooks.business.purchase;

import com.compdevbooks.business.ABusiness;
import com.compdevbooks.dao.IDAO;
import com.compdevbooks.dao.memory.purchase.PurchaseDAO;
import com.compdevbooks.entity.IEntity;
import com.compdevbooks.entity.product.Product;
import com.compdevbooks.entity.purchase.Purchase;
import com.compdevbooks.entity.purchase.PurchaseStatus;

import java.util.Collection;
import java.util.Date;

public class PurchaseBusiness extends ABusiness {

    public PurchaseBusiness(IDAO dao) {
        super(dao);
    }

    @Override
    public Exception validate(IEntity entity) {
        return null;
    }

    /*
        TODO: verificar política de como solicitar orçamento junto aos fabricantes: Email, telefone, ...
     */
    public void executeBudgetRequest(Purchase purchase) {
        purchase.setStatus(PurchaseStatus.REGISTERED);
        purchase.setRegistrationDate(new Date());
        ((PurchaseDAO)dao).save(purchase);
    }

    /*
        TODO: verificar a necessidade de criação de um bean para representar uma solicitação de compra.
     */
    public void holdRequest (Purchase purchase) {
        purchase.setStatus(PurchaseStatus.SENT);
        purchase.setSentDate(new Date());
        ((PurchaseDAO)dao).save(purchase);
    }


}
