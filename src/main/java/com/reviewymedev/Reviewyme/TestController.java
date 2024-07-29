package com.reviewymedev.Reviewyme;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/v1/user")
public class TestController {

    @GetMapping("/say-hello")
    public ResponseEntity<String> sayHelloMethod() {
        return new ResponseEntity<>("Hello User Femi", HttpStatus.OK);
    }

}
