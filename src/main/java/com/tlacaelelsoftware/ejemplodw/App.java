package com.tlacaelelsoftware.ejemplodw;

import com.tlacaelelsoftware.ejemplodw.resources.FibonacciResource;
import com.tlacaelelsoftware.ejemplodw.resources.VersionResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class App extends Application<Configuracion> {

    public static void main(String[] args) throws Exception {
        new App().run(args);
    }

    @Override
    public String getName() {
        return "hello-world";
    }

    @Override
    public void initialize(Bootstrap<Configuracion> bootstrap) {
        // nothing to do yet
    }

    @Override
    public void run(Configuracion configuration,
                    Environment environment) {
        final VersionResource resource = new VersionResource(
                configuration.getVersion()
        );
        environment.jersey().register(resource);
        environment.jersey().register(new FibonacciResource());

        // nothing to do yet
    }
}

