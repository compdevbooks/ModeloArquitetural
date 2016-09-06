package com.compdevbooks.dao;

import com.compdevbooks.entity.IEntity;

import java.util.Collection;

public interface IDAO<ENTITY extends IEntity> {

	void save(ENTITY entity);
	void delete(ENTITY entity);
	ENTITY getById(Long id);
	Collection<ENTITY> getAll();
}
