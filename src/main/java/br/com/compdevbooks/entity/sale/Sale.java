package br.com.compdevbooks.entity.sale;

import br.com.compdevbooks.entity.AEntity;
import br.com.compdevbooks.entity.payment.Payment;
import br.com.compdevbooks.entity.person.Client;

import java.util.Date;
import java.util.Set;

public class Sale extends AEntity {

    private Date registrationDate; //data do registro
    private Date receivedDate; //data do recebimento
    private Date approvalDate; //data da aprovação
    private Date processedDate; //data do processamento
    private SaleStatus status;
    private Set<SaleItem> saleItems;
    private Client client;
    private Payment payment;
}
