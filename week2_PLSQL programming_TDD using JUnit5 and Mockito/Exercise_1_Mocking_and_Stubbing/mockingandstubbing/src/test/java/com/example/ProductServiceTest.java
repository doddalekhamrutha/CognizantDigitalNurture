package com.example;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;


public class ProductServiceTest {

    @Test
    void testGetProductName_Found() {
        // Arrange
        ProductRepository repo = mock(ProductRepository.class);
        when(repo.findById("P100")).thenReturn(new Product("P100", "Laptop", 75000));
        ProductService service = new ProductService(repo);

        // Act
        String name = service.getProductName("P100");

        // Assert
        assertEquals("Laptop", name);
    }

    @Test
    void testGetProductName_NotFound() {
        // Arrange
        ProductRepository repo = mock(ProductRepository.class);
        when(repo.findById("P999")).thenReturn(null);
        ProductService service = new ProductService(repo);

        // Act
        String name = service.getProductName("P999");

        // Assert
        assertNull(name);
    }
}
