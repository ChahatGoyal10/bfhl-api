package com.chahat.bfhl.api.controller;

import com.chahat.bfhl.api.dto.RequestDTO;
import com.chahat.bfhl.api.dto.ResponseDTO;
import com.chahat.bfhl.api.service.BfhlService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class BfhlController {

    private final BfhlService bfhlService;

    public BfhlController(BfhlService bfhlService) {
        this.bfhlService = bfhlService;
    }

    @PostMapping("/bfhl")
    public ResponseEntity<ResponseDTO> process(
            @RequestBody RequestDTO request) {

        return ResponseEntity.ok(
                bfhlService.process(request)
        );
    }
    @GetMapping("/test")
public String test() {
    return "Controller Working";
}
}