package com.compdevbooks.entity;

import java.io.Serializable;

/**
 * Every entity class must implement this interface.
 * Every entity must have an unique id and an equals operation based on the unique id.
 */
public interface IEntity extends Serializable {
	
	Long getId();
	boolean equals(IEntity entity);

}
