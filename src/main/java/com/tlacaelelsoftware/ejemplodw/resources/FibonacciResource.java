package com.tlacaelelsoftware.ejemplodw.resources;

import com.tlacaelelsoftware.ejemplodw.dto.FibonacciDTO;
import com.tlacaelelsoftware.ejemplodw.servicios.Fibonacci;
import com.tlacaelelsoftware.ejemplodw.servicios.FibonacciO1;
import com.tlacaelelsoftware.ejemplodw.servicios.FibonacciRecursivo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/fibonacci")
@Produces(MediaType.APPLICATION_JSON)
public class FibonacciResource {
    @GET
    public FibonacciDTO getFibonacci(@QueryParam("n") Integer n) {
        Fibonacci fibonacci = new FibonacciO1();
        return new FibonacciDTO(n, fibonacci.fib(n));
    }
}
