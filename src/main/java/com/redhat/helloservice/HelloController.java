package com.redhat.helloservice;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HelloController {
	
	@GetMapping(path = "/")
    public ResponseEntity<String> sayHello()  {
        
        return ResponseEntity.ok("Hello World!");
    }
}