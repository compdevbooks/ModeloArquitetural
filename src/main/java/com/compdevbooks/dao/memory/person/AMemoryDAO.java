package com.compdevbooks.dao.memory.person;

import com.compdevbooks.dao.IDAO;
import com.compdevbooks.entity.IEntity;

import java.util.ArrayList;

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
}
