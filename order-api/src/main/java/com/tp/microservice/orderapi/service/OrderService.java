package com.tp.microservice.orderapi.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.tp.microservice.orderapi.dto.CreateOrderRequest;
import com.tp.microservice.orderapi.dto.CreateOrderResponse;

@Service
public class OrderService {

    public CreateOrderResponse createOrder(CreateOrderRequest request) {

        // Génération d'un orderId aléatoire (sans base de données)
        String orderId = UUID.randomUUID().toString();

        // Création de la réponse
        return new CreateOrderResponse(
                orderId,
                "CREATED",
                request.getUserId(),
                request.getProductId(),
                request.getQuantity()
        );
    }
}
