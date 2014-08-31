package com.tlacaelelsoftware.ejemplodw.resources;

import com.tlacaelelsoftware.ejemplodw.dto.VersionDTO;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/version")
@Produces(MediaType.APPLICATION_JSON)
public class VersionResource {

    private final String version;

    public VersionResource(String version) {
        this.version = version;
    }

    @GET
    public VersionDTO getVersion(){
        return new VersionDTO(version);
    }
}
