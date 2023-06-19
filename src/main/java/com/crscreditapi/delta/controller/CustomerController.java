package com.crscreditapi.delta.controller;

import com.crscreditapi.delta.dto.CustomerDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @GetMapping
    public List<CustomerDto> findAll() {
        return new ArrayList<>();
    }
}
