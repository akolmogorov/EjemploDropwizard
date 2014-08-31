package com.tlacaelelsoftware.ejemplodw.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class VersionDTO {
    private String version;
    private Date fecha = new Date();

    public VersionDTO(){}

    public VersionDTO(String version) {
        this.version = version;
    }

    @JsonProperty
    public String getVersion() {
        return version;
    }

    @JsonProperty
    public void setVersion(String version) {
        this.version = version;
    }

    @JsonProperty
    public Date getFecha() {
        return fecha;
    }

    @JsonProperty
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
