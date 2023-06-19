package com.crscreditapi.delta.integration.connectors;

import com.crscreditapi.delta.connectors.ZipDataConnector;
import com.crscreditapi.delta.dto.zip.ZipDataDto;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@ActiveProfiles("test")
@SpringBootTest
public class ZipDataConnecterTests {

    @Autowired
    private ZipDataConnector zipDataConnector;

    @Test
    public void testGetIp() throws JsonProcessingException {
        ZipDataDto zipDataDto = zipDataConnector.getZipData("05065");
        assertEquals("United States", zipDataDto.getCountry());
        assertEquals("05065", zipDataDto.getPostCode());
    }
}
