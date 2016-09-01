package com.compdevbooks.dao;

import com.compdevbooks.dao.database.DatabaseDAOFactory;
import com.compdevbooks.dao.memory.MemoryDAOFactory;
import com.compdevbooks.dao.xml.XMLDAOFactory;

public interface DAOFactory {

	public abstract IDAO getFooDAO();

	public static DAOFactory getDAOFactory(DAOFactoryEnum daoFactoryType) {
		switch (daoFactoryType) {
			case MEMORY:
			return MemoryDAOFactory.getInstance();
			case DATABASE:
			return DatabaseDAOFactory.getInstance();
			case XML:
			return XMLDAOFactory.getInstance();
		default:
			return null;
		}
	}

}
