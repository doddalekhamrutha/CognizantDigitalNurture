package com.example;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class OrderServiceTest {

    @Test
    void testCreateOrder_VerifiesSaveCalled() {
        // Arrange
        OrderRepository mockRepo = mock(OrderRepository.class);
        OrderService service = new OrderService(mockRepo);

        // Act
        service.createOrder("O123", "Laptop");

        // Assert
        verify(mockRepo).save(any(Order.class));  // Verify save() was called with any Order
    }

    @Test
    void testCreateOrder_VerifiesSaveCalledWithCorrectOrder() {
        // Arrange
        OrderRepository mockRepo = mock(OrderRepository.class);
        OrderService service = new OrderService(mockRepo);

        // Act
        service.createOrder("O124", "Mobile");

        // Assert
        verify(mockRepo).save(argThat(order ->
            order.getId().equals("O124") && order.getItem().equals("Mobile")
        ));
    }

    @Test
    void testCreateOrder_VerifyCalledOnce() {
        // Arrange
        OrderRepository mockRepo = mock(OrderRepository.class);
        OrderService service = new OrderService(mockRepo);

        // Act
        service.createOrder("O125", "Tablet");

        // Assert
        verify(mockRepo, times(1)).save(any(Order.class));
    }
}
