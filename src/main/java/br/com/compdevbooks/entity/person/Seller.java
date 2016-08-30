package br.com.compdevbooks.entity.person;

import java.util.Set;
import br.com.compdevbooks.model.address.City;

public class Seller extends NaturalPerson {

    private Set<City> cityList;
    private Set<Client> clientList;
}
