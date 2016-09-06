package com.compdevbooks.entity.address;

import com.compdevbooks.entity.AEntity;

public class City extends AEntity {

    private String name;
    private State state;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
