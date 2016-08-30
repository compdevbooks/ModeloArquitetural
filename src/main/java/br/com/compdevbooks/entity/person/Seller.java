package br.com.compdevbooks.entity.person;

import br.com.compdevbooks.entity.address.City;

import java.util.Set;

public class Seller extends NaturalPerson {

    private Set<City> cityList;
    private Set<Client> clientList;
}
