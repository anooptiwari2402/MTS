package org.matrix.solution.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(path = "/matrix-interface", method = RequestMethod.GET)
public class InterfaceController {

    @GetMapping(path = "/health")
    public Mono<ResponseEntity<String>> health() {
        return Mono.just(ResponseEntity.ok("OK"));
    }
}
