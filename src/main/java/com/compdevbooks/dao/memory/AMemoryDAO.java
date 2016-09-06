package com.compdevbooks.dao.memory;

import com.compdevbooks.dao.IDAO;
import com.compdevbooks.entity.IEntity;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Every entity class can inherit from this one in order to have a default implementation for IDAO interface.
 * A default implementation based on memory data structure is provided.
 * This implementation manipulates only transient objects. All data is lost when exiting the application.
 */
public abstract class AMemoryDAO<ENTITY extends IEntity> implements IDAO<ENTITY> {
    protected final ArrayList<ENTITY> database = new ArrayList<>();

    @Override
    public void save(ENTITY entity) {
        if (!database.contains(entity))
            database.add(entity);
    }

    @Override
    public void delete(ENTITY entity) {
        database.remove(entity);
    }

    @Override
    public ENTITY getById(Long id) {
        for (ENTITY ent : database)
            if (ent.getId().equals(id))
                return ent;
        return null;
    }

    @Override
    public Collection<ENTITY> getAll() {
        return database;
    }
}
