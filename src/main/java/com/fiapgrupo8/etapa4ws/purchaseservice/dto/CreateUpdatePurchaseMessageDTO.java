package com.fiapgrupo8.etapa4ws.purchaseservice.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class CreateUpdatePurchaseMessageDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    public CreateUpdatePurchaseMessageDTO(){}

    public PurchaseDTO purchaseDTO;
    public LocalDateTime timestamp;
    public String type;


}
