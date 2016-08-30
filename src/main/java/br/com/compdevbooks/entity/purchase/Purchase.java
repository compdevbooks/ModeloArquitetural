
package br.com.compdevbooks.entity.purchase;

import br.com.compdevbooks.model.payment.Payment;
import br.com.compdevbooks.model.person.Manufacturer;
import java.util.Date;
import java.util.Set;

public class Purchase{

    private Date registrationDate; //data do registro
    private Date sentDate; //data do envio
    private Date receivedDate; //data do recebimento
    private Date processedDate; //data do processamento
    private PurchaseStatus status; 
    private Set<PurchaseItem> purchasedItems;
    private Manufacturer manufacturer;
    private Payment payment;
}
