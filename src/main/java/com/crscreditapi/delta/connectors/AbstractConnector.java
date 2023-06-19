package com.crscreditapi.delta.connectors;

import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.Map;

public abstract class AbstractConnector {

    protected abstract String getHost();

    protected <T> T get(String path, Class<T> clazz, Map<String, String> uriVariables) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<T> entity = new HttpEntity<>(null, headers);

        ResponseEntity<T> response = restTemplate.exchange(getHost() + path, HttpMethod.GET, entity, clazz, uriVariables);
        return response.getBody();

//        return new RestTemplate().getForObject(getHost() + path, clazz, uriVariables);
    }
}
