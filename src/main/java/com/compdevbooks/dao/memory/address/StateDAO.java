package com.compdevbooks.dao.memory.address;

import com.compdevbooks.dao.memory.AMemoryDAO;
import com.compdevbooks.entity.AEntity;
import com.compdevbooks.entity.address.Country;
import com.compdevbooks.entity.address.State;

import java.util.ArrayList;
import java.util.List;

public class StateDAO extends AMemoryDAO<State> {

    public State getByAcronym(String acronym) {
        for (State s : database)
            if (s.getAcronym().equals(acronym))
                return s;
        return null;
    }

    public List<State> getByName(String name) {
        ArrayList<State> states = new ArrayList<>();
        for (State s : database)
            if (s.getName().contains(name))
                states.add(s);
        return states;
    }

    public List<State> getByCountry(Country country) {
        ArrayList<State> states = new ArrayList<>();
        for (State s : database)
            if (s.getCountry().equals(country))
                states.add(s);
        return states;
    }
}
