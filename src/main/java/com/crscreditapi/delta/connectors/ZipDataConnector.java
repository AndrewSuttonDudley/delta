package com.crscreditapi.delta.connectors;

import com.crscreditapi.delta.dto.zip.ZipDataDto;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class ZipDataConnector extends AbstractConnector {

    private static final Logger logger = LoggerFactory.getLogger(ZipDataConnector.class);

    @Value("${com.crscreditapi.ip-service-host}")
    private String ipServiceHost;

    @Override
    protected String getHost() {
        logger.info("ipServiceHost: " + ipServiceHost);
        return ipServiceHost;
    }

    public ZipDataDto getZipData(String zipCode) throws JsonProcessingException {
        ZipDataDto zipDataDto = get(zipCode, ZipDataDto.class, new HashMap<>());
        logger.info("Response: " + zipDataDto);
        return zipDataDto;
//        return new ObjectMapper().readValue(response, IpDto.class);
    }
}
