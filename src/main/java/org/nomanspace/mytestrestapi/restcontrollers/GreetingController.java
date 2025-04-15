package org.nomanspace.mytestrestapi.restcontrollers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {


    @GetMapping("/hello")
    public String greeting() {
        return "this is get body response";
    }
}
