package com.compdevbooks.entity.person;

import com.compdevbooks.entity.address.City;

import java.util.Set;

public class Seller extends NaturalPerson {

    private Set<City> cities;
    private Set<Client> clients;

    public Set<City> getCities() {
        return cities;
    }

    public void setCities(Set<City> cities) {
        this.cities = cities;
    }

    public Set<Client> getClients() {
        return clients;
    }

    public void setClientList(Set<Client> clients) {
        this.clients = clients;
    }
}
