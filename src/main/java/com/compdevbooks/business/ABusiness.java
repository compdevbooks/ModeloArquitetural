package com.compdevbooks.business;

import com.compdevbooks.dao.IDAO;
import com.compdevbooks.entity.IEntity;

import java.util.Collection;

/**
 * Every Business class can inherit from this one in order to have a default implementation for IBusiness interface.
 * A default implementation provides a DAO attribute and CRUD operations using the provided DAO.
 * When saving an entity, validate operation is invoked previously, in order to proceed or cancel the save action.
 */
public abstract class ABusiness implements IBusiness {

	public IDAO dao;
	
	public ABusiness(IDAO dao) {
		this.dao = dao;
	}
	
	@Override
	public Exception save(IEntity entity) {
		Exception exc = validate(entity);
		if (exc!=null)
			return exc;
		dao.save(entity);
		return null;
	}

	@Override
	public abstract Exception validate(IEntity entity);

	@Override
	public Exception delete(IEntity entity) {
		dao.delete(entity);
		return null;
	}

	@Override
	public IEntity getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public Collection<IEntity> getAll() {
		return dao.getAll();
	}
	
}
