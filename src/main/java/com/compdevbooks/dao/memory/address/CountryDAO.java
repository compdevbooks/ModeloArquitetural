package com.compdevbooks.dao.memory.address;

import com.compdevbooks.dao.memory.AMemoryDAO;
import com.compdevbooks.entity.AEntity;
import com.compdevbooks.entity.address.Country;

import java.util.ArrayList;
import java.util.List;

public class CountryDAO extends AMemoryDAO<Country> {

    public Country getByAcronym(String acronym) {
        for (Country c : database)
            if (c.getAcronym().equals(acronym))
                return c;
        return null;
    }

    public List<Country> getByName(String name) {
        ArrayList<Country> countries = new ArrayList<>();
        for (Country c : database)
            if (c.getName().contains(name))
                countries.add(c);
        return countries;
    }

}
