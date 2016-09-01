package com.compdevbooks;

import com.compdevbooks.business.FooBusiness;
import com.compdevbooks.dao.DAOFactory;
import com.compdevbooks.dao.DAOFactoryEnum;
import com.compdevbooks.dao.memory.FooDAO;
import com.compdevbooks.entity.FooEntity;

public class App
{
    public static void main( String[] args )
    {
        DAOFactory daoFactory = DAOFactory.getDAOFactory(DAOFactoryEnum.MEMORY);

        FooBusiness fooBusiness = new FooBusiness(new FooDAO());

        FooEntity fooEntity = new FooEntity();
        fooEntity.setId(1L);
        fooEntity.setFooString("foo string");
        fooEntity.setFooNumber(0);

        fooBusiness.save(fooEntity);

        System.out.println(((FooEntity)fooBusiness.getById(1L)).getFooString());
    }
}
