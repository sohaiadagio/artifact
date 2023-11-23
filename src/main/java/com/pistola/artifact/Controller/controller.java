package com.pistola.artifact.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
     @GetMapping(value = "/")
    public String index(){
        return "hola pelotudo";
    }
    
}
