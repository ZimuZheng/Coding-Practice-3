package com.itlize.codinghomework3.controller;

import com.itlize.codinghomework3.service.CodingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping(value = "/coding3")
public class CodingController {

    @Autowired
    CodingService codingService;

    @GetMapping(value = "/testone")
    public ResponseEntity<?> CodingTestOne(@RequestParam String path) throws IOException {
        return codingService.codingTestOne(path);
    }

    @GetMapping(value = "/testtwo")
    public ResponseEntity<?> CodingTestTwo(@RequestParam String path) throws IOException {
        return codingService.codingTestTwo(path);
    }

    @GetMapping(value = "/testthree")
    public ResponseEntity<?> CodingTestThree(@RequestParam String path) throws IOException {
        return codingService.codingTestThree(path);
    }
}
