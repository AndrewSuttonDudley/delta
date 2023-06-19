package com.crscreditapi.delta.dto.zip;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ZipDataDto {

    @JsonProperty("post code")
    private String postCode;

    private String country;

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
