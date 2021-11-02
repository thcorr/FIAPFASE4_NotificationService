package com.fiapgrupo8.etapa4ws.purchaseservice.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class PurchaseDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    public PurchaseDTO(){}

    Long purchaseId;
    private LocalDateTime createdDate;
    private Long cartId;
    private Long clientCode;
    private String clientName;
    private String purchaseStatus;

}
