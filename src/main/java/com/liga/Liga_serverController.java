package com.liga;

import io.micronaut.http.annotation.*;

@Controller("/liga_server")
public class Liga_serverController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}