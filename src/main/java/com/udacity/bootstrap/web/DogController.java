package com.udacity.bootstrap.web;

import com.udacity.bootstrap.service.DogService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DogController {

    private DogService dogService;

    public DogController(DogService dogService) {
        this.dogService = dogService;
    }

    @GetMapping("/breed")
    public ResponseEntity<List<String>> getBreeds() {
        List<String> list = dogService.findBreeds();
        return new ResponseEntity<List<String>>(list, HttpStatus.OK);
    }

    @GetMapping("/breed/id")
    public ResponseEntity<String> getBreedsById(Long id) {
        String list = dogService.findBreedsById(id);
        if (list.isEmpty()) return new ResponseEntity<String>(list, HttpStatus.NO_CONTENT);
        else return new ResponseEntity<String>(list, HttpStatus.OK);
    }

    @GetMapping("/name")
    public ResponseEntity<List<String>> getNames() {
        List<String> list = dogService.findNames();
        return new ResponseEntity<List<String>>(list, HttpStatus.OK);
    }

}
