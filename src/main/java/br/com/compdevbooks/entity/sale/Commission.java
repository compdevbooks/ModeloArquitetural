package br.com.compdevbooks.entity.sale;

import br.com.compdevbooks.entity.AEntity;

import java.util.Set;

public class Commission extends AEntity {

    private Sale sale;
    private Set<InstallmentCommission> installmentCommissions;
}
