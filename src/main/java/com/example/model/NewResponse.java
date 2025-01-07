package com.example.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class NewResponse {

    @JsonProperty("response")
    private String response;

    public NewResponse() {
    }

    public NewResponse(String response) {
        this.response = response;
    }
}
