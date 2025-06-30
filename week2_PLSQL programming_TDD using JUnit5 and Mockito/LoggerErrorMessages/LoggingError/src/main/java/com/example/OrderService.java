package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OrderService {

    private static final Logger logger = LoggerFactory.getLogger(OrderService.class);

    public void processOrder(String orderId, double amount) {
        logger.info("Starting processing for orderId: {}", orderId);

        if (orderId == null || orderId.isBlank()) {
            logger.error("Invalid orderId provided!");
            return;
        }

        if (amount <= 0) {
            logger.warn("Suspicious amount: {}. Check for fraud.", amount);
        }

        logger.info("Order processed successfully. orderId: {}, amount: {}", orderId, amount);
    }
}
