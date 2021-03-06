package com.example.template;

import java.text.SimpleDateFormat;
import java.util.Date;

public class OrderCancelled extends AbstractEvent{

    private String stateMessage = "주문이 취소됨";

    private Long productId;
    private Long orderId;
    private String productName;
    private int quantity;
    private int price;
    private String customerId;
    private String customerName;

    public OrderCancelled(){
        this.setEventType(this.getClass().getSimpleName());
        SimpleDateFormat defaultSimpleDateFormat = new SimpleDateFormat("YYYYMMddHHmmss");
        this.timestamp = defaultSimpleDateFormat.format(new Date());
    }

    public OrderCancelled(Order order){
        this();
        this.setProductId(order.getProductId());
        this.setProductName(order.getProductName());
        this.setOrderId(order.getId());
        this.setQuantity(order.getQuantity());
        this.setPrice(order.getPrice());
        this.setCustomerId(order.getCustomerId());
        this.setCustomerName(order.getCustomerName());
    }

    public String getStateMessage() {
        return stateMessage;
    }

    public void setStateMessage(String stateMessage) {
        this.stateMessage = stateMessage;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

}
