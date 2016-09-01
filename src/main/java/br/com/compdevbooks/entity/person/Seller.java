package br.com.compdevbooks.entity.person;

import br.com.compdevbooks.entity.address.City;

import java.util.Set;

public class Seller extends NaturalPerson {

    private Set<City> cityList;
    private Set<Client> clientList;

    public Set<City> getCityList() {
        return cityList;
    }

    public void setCityList(Set<City> cityList) {
        this.cityList = cityList;
    }

    public Set<Client> getClientList() {
        return clientList;
    }

    public void setClientList(Set<Client> clientList) {
        this.clientList = clientList;
    }
}
