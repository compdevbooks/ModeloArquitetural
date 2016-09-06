package com.compdevbooks.business;

import com.compdevbooks.entity.IEntity;

import java.util.Collection;

/**
 * Every business class must implement this interface.
 * Every business class must have a default named CRUD operations and manipulate entities that implements IEntity interface.
 * Exceptions must be returned when violating business rules. A validate operation must be implemented with business rules.
 */
public interface IBusiness {

	Exception save(IEntity entity);
	Exception delete(IEntity entity);
	IEntity getById(Long id);
	Collection<IEntity> getAll();
	Exception validate(IEntity entity);
	
}
