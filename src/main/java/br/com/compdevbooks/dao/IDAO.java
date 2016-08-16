package br.com.compdevbooks.dao;

import br.com.compdevbooks.entity.IEntity;

public interface IDAO {

	void save(IEntity entity);
	void delete(IEntity entity);
	IEntity getById(Long id);
	
}
