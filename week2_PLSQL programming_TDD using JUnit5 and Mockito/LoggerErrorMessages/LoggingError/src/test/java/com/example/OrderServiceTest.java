package com.example;

public class OrderServiceTest {
    public static void main(String[] args) {
        OrderService service = new OrderService();

        service.processOrder(null, 500);
        service.processOrder("ORD123", -100);
        service.processOrder("ORD124", 2500);
    }
}
