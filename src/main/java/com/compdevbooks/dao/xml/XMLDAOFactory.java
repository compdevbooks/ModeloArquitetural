package com.compdevbooks.dao.xml;

import com.compdevbooks.dao.DAOFactory;
import com.compdevbooks.dao.IDAO;

public class XMLDAOFactory implements DAOFactory {

    private static XMLDAOFactory factory = null;

    public static XMLDAOFactory getInstance() {
        if (factory == null)
            factory = new XMLDAOFactory();
        return factory;
    }

    public IDAO getFooDAO() {
        return null;
    }

}
