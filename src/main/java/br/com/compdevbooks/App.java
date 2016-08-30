package br.com.compdevbooks;

import br.com.compdevbooks.business.FooBusiness;
import br.com.compdevbooks.dao.DAOFactory;
import br.com.compdevbooks.dao.DAOFactoryEnum;
import br.com.compdevbooks.dao.memory.FooDAO;
import br.com.compdevbooks.entity.FooEntity;

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
