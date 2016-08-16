package br.com.compdevbooks.dao.memory;

import br.com.compdevbooks.dao.DAOFactory;
import br.com.compdevbooks.dao.IDAO;

public class MemoryDAOFactory implements DAOFactory {

	private static MemoryDAOFactory factory = null;
	
	public static MemoryDAOFactory getInstance() {
		if (factory == null)
			factory = new MemoryDAOFactory();
		return factory;
	}
	
    public IDAO getFooDAO() {
        return new FooDAO();
    }

}
