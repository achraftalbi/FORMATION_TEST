package com.orange.request.api.request.external;


import com.orange.request.representation.RequestRepresentation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(value = "/api/request/v1")
public class RequestController {

    @GetMapping(value = "/search", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<RequestRepresentation> getRequestByNumber(@RequestParam(required = true) String number){
        RequestRepresentation requestRepresentation = RequestRepresentation.builder()
                .number(56465l).build();
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(requestRepresentation);
    }
}
