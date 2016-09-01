package com.compdevbooks.dao.memory.person;

import com.compdevbooks.entity.IEntity;
import com.compdevbooks.entity.address.City;
import com.compdevbooks.entity.person.Person;

import java.util.ArrayList;
import java.util.List;

public abstract class PersonDAO<ENTITY extends IEntity> extends AMemoryDAO<ENTITY> {

    public List<ENTITY> getByName(String name) {
        ArrayList<ENTITY> list = new ArrayList<>();
        for (ENTITY e : database) {
            if (((Person)e).getName().equals(name))
                list.add(e);
        }
        return list;
    }

    public List<ENTITY> getByCity(City city) {
        ArrayList<ENTITY> list = new ArrayList<>();
        for (ENTITY e : database) {
            if (((Person)e).getAddress().getCity().equals(city))
                list.add(e);
        }
        return list;
    }

}
