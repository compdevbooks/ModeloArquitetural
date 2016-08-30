package br.com.compdevbooks.entity.person;

import br.com.compdevbooks.entity.AEntity;
import br.com.compdevbooks.entity.address.Address;
import br.com.compdevbooks.entity.address.Phone;

import java.util.Set;

public abstract class Person extends AEntity {
	//companyName for LegalPerson
    protected String name;
    //Social Security Number CPF or Registration of Corporate Taxpayers CNPJ
    protected String nationalRegister;
    protected Address address;
    private Set<Phone> phones;
    
}
