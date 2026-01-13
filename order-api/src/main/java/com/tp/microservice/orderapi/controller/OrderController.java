package com.tp.microservice.orderapi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.tp.microservice.orderapi.dto.CreateOrderRequest;
import com.tp.microservice.orderapi.dto.CreateOrderResponse;
import com.tp.microservice.orderapi.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CreateOrderResponse createOrder(@RequestBody CreateOrderRequest request) {
        return orderService.createOrder(request);
    }
}
