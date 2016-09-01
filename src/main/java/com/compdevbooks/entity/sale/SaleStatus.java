package com.compdevbooks.entity.sale;

public enum SaleStatus {

    REQUEST, //SOLICIDADA
    ANALYSIS, //ANALISE
    APPROVED, //APROVADA pelo gerente de venda
    PROCESSED, //PROCESSADA pelo gerente de estoque (baixa do estoque/lote)
    READY, //PRONTA PARA ENVIO (serapação física para embalar)
    SENT //ENVIADA
}
