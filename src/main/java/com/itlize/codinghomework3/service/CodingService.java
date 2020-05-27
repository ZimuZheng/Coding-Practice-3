package com.itlize.codinghomework3.service;

import org.springframework.http.ResponseEntity;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface CodingService {

    ResponseEntity<?> codingTestOne(String path) throws IOException;

    ResponseEntity<?> codingTestTwo(String path) throws IOException;

    ResponseEntity<?> codingTestThree(String path) throws IOException;
}
