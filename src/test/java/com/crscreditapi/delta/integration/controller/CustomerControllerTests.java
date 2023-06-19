package com.crscreditapi.delta.integration.controller;

import com.crscreditapi.delta.controller.CustomerController;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.testcontainers.junit.jupiter.Testcontainers;

@ActiveProfiles("test")
@SpringBootTest
@Testcontainers
public class CustomerControllerTests {

    @Autowired
    private CustomerController customerController;

    @Test
    public void testFindAll() {
        assertEquals("Hello, World!", customerController.findAll());
    }
}
