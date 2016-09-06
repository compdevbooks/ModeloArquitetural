package com.compdevbooks.business;

import com.compdevbooks.entity.IEntity;

import java.util.Collection;

public interface IBusiness {

	Exception save(IEntity entity);
	Exception delete(IEntity entity);
	IEntity getById(Long id);
	Collection<IEntity> getAll();
	Exception validate(IEntity entity);
	
}
