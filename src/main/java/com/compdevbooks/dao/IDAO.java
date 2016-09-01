package com.compdevbooks.dao;

import com.compdevbooks.entity.IEntity;

public interface IDAO<ENTITY extends IEntity> {

	void save(ENTITY entity);
	void delete(ENTITY entity);
	ENTITY getById(Long id);
	
}
