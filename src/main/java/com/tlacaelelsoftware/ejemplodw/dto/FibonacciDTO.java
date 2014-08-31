package com.tlacaelelsoftware.ejemplodw.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FibonacciDTO {
    private Integer n;
    private Long f;

    public FibonacciDTO() {
    }

    public FibonacciDTO(Integer n, Long f) {
        this.n = n;
        this.f = f;
    }

    @JsonProperty
    public Integer getN() {
        return n;
    }

    @JsonProperty
    public void setN(Integer n) {
        this.n = n;
    }

    @JsonProperty
    public Long getF() {
        return f;
    }

    @JsonProperty
    public void setF(Long f) {
        this.f = f;
    }
}
