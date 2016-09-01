package com.compdevbooks.dao.memory;

import com.compdevbooks.dao.IDAO;
import com.compdevbooks.entity.FooEntity;
import com.compdevbooks.entity.IEntity;

import java.util.ArrayList;
import java.util.List;

public class FooDAO implements IDAO {
    private static List<FooEntity> fooList = new ArrayList<>();

    @Override
    public void save(IEntity entity) {
        if (fooList.indexOf(entity)< 0) fooList.add((FooEntity) entity);
    }

    @Override
    public void delete(IEntity entity) {
        fooList.remove(entity);
    }

    @Override
    public IEntity getById(Long id) {
        for (IEntity i : fooList)
            if (i.getId().equals(id))
                return i;

        return null;
    }
}
