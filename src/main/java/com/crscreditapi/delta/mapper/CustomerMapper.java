package com.crscreditapi.delta.mapper;

import com.crscreditapi.delta.config.MapStructConfig;
import com.crscreditapi.delta.dto.CustomerDto;
import com.crscreditapi.delta.model.Customer;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Service;

@Service
@Mapper(
        componentModel = "spring",
        config = MapStructConfig.class
)
public abstract class CustomerMapper extends AbstractMapper<Customer, CustomerDto> {
}
