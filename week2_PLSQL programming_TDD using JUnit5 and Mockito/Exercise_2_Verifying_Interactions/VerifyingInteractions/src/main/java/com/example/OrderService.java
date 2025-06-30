package com.example;

public class OrderService {

    private final OrderRepository repository;

    public OrderService(OrderRepository repository) {
        this.repository = repository;
    }

    public void createOrder(String id, String item) {
        Order order = new Order(id, item);
        repository.save(order);
    }
}
