package com.compdevbooks.dao.memory.address;

import com.compdevbooks.dao.memory.AMemoryDAO;
import com.compdevbooks.entity.AEntity;
import com.compdevbooks.entity.address.City;
import com.compdevbooks.entity.address.State;

import java.util.ArrayList;
import java.util.List;

public class CityDAO extends AMemoryDAO<City> {

    public List<City> getByState(State state) {
        ArrayList<City> cities = new ArrayList<>();
        for (City c : database)
            if (c.getState().equals(state))
                cities.add(c);
        return cities;
    }

    public List<City> getByName(String name) {
        ArrayList<City> cities = new ArrayList<>();
        for (City c : database)
            if (c.getName().contains(name))
                cities.add(c);
        return cities;
    }

}
