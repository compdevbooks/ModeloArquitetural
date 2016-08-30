package br.com.compdevbooks.entity.person;

import br.com.compdevbooks.model.address.Address;
import br.com.compdevbooks.model.address.Phone;
import java.util.Set;

public abstract class Person {
	//companyName for LegalPerson
    protected String name;
    //Social Security Number CPF or Registration of Corporate Taxpayers CNPJ
    protected String nationalRegister;
    protected Address address;
    private Set<Phone> phones;
    
}
