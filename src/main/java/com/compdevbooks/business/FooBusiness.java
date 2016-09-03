package com.compdevbooks.business;

import com.compdevbooks.dao.IDAO;
import com.compdevbooks.entity.FooEntity;
import com.compdevbooks.entity.IEntity;
import com.compdevbooks.util.RegularExpressions;

public class FooBusiness extends ABusiness {

    public FooBusiness(IDAO dao) {
        super(dao);
    }

    @Override
    public Exception validate(IEntity iEntity) {
        FooEntity fooEntity = (FooEntity) iEntity;
        try {
            RegularExpressions.validate("NAME","123ads");
        } catch (Exception e) {
            return e;
        }
        return null;
    }
}
