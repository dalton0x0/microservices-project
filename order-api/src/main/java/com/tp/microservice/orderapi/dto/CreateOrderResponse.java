package com.tp.microservice.orderapi.dto;

public class CreateOrderResponse {

    private String orderId;
    private String status;
    private Integer userId;
    private Integer productId;
    private Integer quantity;

    public CreateOrderResponse(String orderId, String status, Integer userId, Integer productId, Integer quantity) {
        this.orderId = orderId;
        this.status = status;
        this.userId = userId;
        this.productId = productId;
        this.quantity = quantity;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getStatus() {
        return status;
    }

    public Integer getUserId() {
        return userId;
    }

    public Integer getProductId() {
        return productId;
    }

    public Integer getQuantity() {
        return quantity;
    }
}
