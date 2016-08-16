package br.com.compdevbooks.dao.database;

import br.com.compdevbooks.dao.DAOFactory;
import br.com.compdevbooks.dao.IDAO;

public class DatabaseDAOFactory implements DAOFactory {

    private static DatabaseDAOFactory factory = null;

    public static DatabaseDAOFactory getInstance() {
        if (factory == null)
            factory = new DatabaseDAOFactory();
        return factory;
    }

    public IDAO getFooDAO() {
        return null;
    }

}
