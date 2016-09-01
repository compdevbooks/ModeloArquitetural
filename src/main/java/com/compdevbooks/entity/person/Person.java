package com.compdevbooks.entity.person;

import com.compdevbooks.entity.AEntity;
import com.compdevbooks.entity.address.Address;
import com.compdevbooks.entity.address.Phone;

import java.util.Set;

public abstract class Person extends AEntity {
	//companyName for LegalPerson
    protected String name;
    //Social Security Number CPF or Registration of Corporate Taxpayers CNPJ
    protected String nationalRegister;
    protected Address address;
    private Set<Phone> phones;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationalRegister() {
        return nationalRegister;
    }

    public void setNationalRegister(String nationalRegister) {
        this.nationalRegister = nationalRegister;
    }

    public Set<Phone> getPhones() {
        return phones;
    }

    public void setPhones(Set<Phone> phones) {
        this.phones = phones;
    }

    public Address getAddress() {
        return address;
    }

}
