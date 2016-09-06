package com.compdevbooks.dao;

import com.compdevbooks.entity.IEntity;

import java.util.Collection;

/**
 * Every DAO class must implement this interface.
 * Every DAO must have a default named CRUD operations and manipulate entities that implements IEntity interface.
 */
public interface IDAO<ENTITY extends IEntity> {

	void save(ENTITY entity);
	void delete(ENTITY entity);
	ENTITY getById(Long id);
	Collection<ENTITY> getAll();
}
