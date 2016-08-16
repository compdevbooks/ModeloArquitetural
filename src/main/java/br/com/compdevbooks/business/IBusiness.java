package br.com.compdevbooks.business;

import br.com.compdevbooks.entity.IEntity;

public interface IBusiness {

	Exception save(IEntity entity);
	Exception delete(IEntity entity);
	IEntity getById(Long id);
	Exception validate(IEntity entity);
	
}
