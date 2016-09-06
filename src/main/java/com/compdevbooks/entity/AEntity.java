package com.compdevbooks.entity;

/**
 * Every entity class can inherit from this one in order to have a default implementation for IEntity interface.
 * A default implementation of id attribute and equals operation is provided.
 */
public abstract class AEntity implements IEntity {

    protected Long id;

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(IEntity entity) {
        if (this == entity) return true;
        if (!(entity instanceof AEntity)) return false;

        AEntity aEntity = (AEntity) entity;

        return getId().equals(aEntity.getId());
    }
}
