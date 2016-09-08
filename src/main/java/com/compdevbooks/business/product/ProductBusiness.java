package com.compdevbooks.business.product;

import com.compdevbooks.business.ABusiness;
import com.compdevbooks.dao.IDAO;
import com.compdevbooks.entity.IEntity;
import com.compdevbooks.entity.product.Product;
import com.compdevbooks.util.RegularExpressions;

public class ProductBusiness extends ABusiness {

    public ProductBusiness(IDAO dao) {
        super(dao);
    }

    @Override
    public Exception validate(IEntity entity) {
        Product product = (Product) entity;
        StringBuilder str = new StringBuilder();

        try {
            String msg = RegularExpressions.validate("NAME",product.getName());
            str.append(msg==null?"":msg);

            msg = RegularExpressions.validate("COMISSION_PERCENTAGE",String.valueOf(product.getSellerCommissionPerc()));
            str.append(msg==null?"":msg);

            msg = RegularExpressions.validate("PURCHASE_VALUE",String.valueOf(product.getPurchaseValue()));
            str.append(msg==null?"":msg);

            msg = RegularExpressions.validate("SALE_VALUE",String.valueOf(product.getSaleValue()));
            str.append(msg==null?"":msg);

            msg = RegularExpressions.validate("CATEGORY_NULL",String.valueOf(product.getCategory()));
            str.append(msg==null?"":msg);

            msg = RegularExpressions.validate("MANUFACTURER_NULL",String.valueOf(product.getManufacturer()));
            str.append(msg==null?"":msg);

        } catch (Exception e) {
            e.printStackTrace();
        }

        if (str.length()>0)
            return new Exception(str.toString());

        return null;

    }
}

