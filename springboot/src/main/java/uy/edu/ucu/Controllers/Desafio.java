package uy.edu.ucu.Controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import uy.edu.ucu.DTO.PingDTO;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class Desafio {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(path = "/ping", produces = "application/json")
    public ResponseEntity<PingDTO> ping() throws JsonProcessingException {
        return ResponseEntity
                .ok()
                .body(PingDTO.builder()
                        .message("Pong!")
                        .build());
    }

    @GetMapping(path = "/forward", produces = "application/json")
    public ResponseEntity<?> forward(@RequestParam("url") String url) {
        String response = restTemplate.getForObject(url, String.class);
        return ResponseEntity.ok(response);
        // HttpHeaders headers = new HttpHeaders();
        // headers.setLocation(URI.create(url));
        // return new ResponseEntity<>(headers, HttpStatus.TEMPORARY_REDIRECT);
    }

}