package br.com.compdevbooks.entity.sale;

import br.com.compdevbooks.model.payment.InstallmentPayment;

import java.util.Date;

public class InstallmentCommission {

    private Date dueDate; //data do vencimento
    private Date paymentDate; //data do pagamento
    private float installmentValue; //valor da parcela
    private InstallmentPayment installmentPayment;
}

