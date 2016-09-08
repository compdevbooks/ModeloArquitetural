package com.compdevbooks.business.product;

import com.compdevbooks.business.ABusiness;
import com.compdevbooks.dao.IDAO;
import com.compdevbooks.entity.IEntity;
import com.compdevbooks.entity.product.Category;
import com.compdevbooks.util.RegularExpressions;

public class CategoryBusiness extends ABusiness {
    
    public CategoryBusiness(IDAO dao) {
        super(dao);
    }

    @Override
    public Exception validate(IEntity entity) {
        Category category = (Category) entity;
        StringBuilder str = new StringBuilder();

        try {
            String msg = RegularExpressions.validate("NAME",category.getName());
            str.append(msg==null?"":msg);

            msg = RegularExpressions.validate("COMISSION_PERCENTAGE",String.valueOf(category.getSellerCommissionPerc()));
            str.append(msg==null?"":msg);
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (str.length()>0)
            return new Exception(str.toString());

        return null;

    }
}

