package com.fiapgrupo8.etapa4ws.notificationservice.consumer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fiapgrupo8.etapa4ws.purchaseservice.dto.CreateUpdatePurchaseMessageDTO;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.annotation.RabbitListenerConfigurer;
import org.springframework.amqp.rabbit.listener.RabbitListenerEndpointRegistrar;
import org.springframework.stereotype.Component;

import java.time.format.DateTimeFormatter;

@Component
public class PurchaseConsumer implements RabbitListenerConfigurer {

    @Override
    public void configureRabbitListeners(RabbitListenerEndpointRegistrar rabbitListenerEndpointRegistrar) {
    }

    @RabbitListener(queues = "PURCHASE_NOTIFICATION_QUEUE")
    public void receivedMessage(CreateUpdatePurchaseMessageDTO dto) {
        System.out.println("Message Received " + dto.getTimestamp());
        System.out.println("Type:" + dto.getType());
        System.out.println("Payload: " + dto.getPurchaseDTO());

    }



    }




