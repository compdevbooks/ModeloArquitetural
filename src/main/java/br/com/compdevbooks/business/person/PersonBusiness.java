package br.com.compdevbooks.business.person;

import br.com.compdevbooks.business.ABusiness;
import br.com.compdevbooks.dao.IDAO;
import br.com.compdevbooks.entity.IEntity;
import br.com.compdevbooks.entity.address.Address;
import br.com.compdevbooks.entity.address.Phone;

import java.util.Set;

public abstract class PersonBusiness extends ABusiness {
	//companyName for LegalPerson
    protected String name;
    //Social Security Number CPF or Registration of Corporate Taxpayers CNPJ
    protected String nationalRegister;
    protected Address address;
    private Set<Phone> phones;

    public PersonBusiness(IDAO dao) {
        super(dao);
    }

    @Override
    public Exception validate(IEntity entity) {
        return null;
    }
}
