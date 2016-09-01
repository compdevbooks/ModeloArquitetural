package com.compdevbooks.entity.sale;

import com.compdevbooks.entity.AEntity;

import java.util.Set;

public class Commission extends AEntity {

    private Sale sale;
    private Set<InstallmentCommission> installmentCommissions;
}
