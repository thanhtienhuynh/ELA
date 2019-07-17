package com.example.demo.controllers;

import com.example.demo.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoleController {
    @Autowired
    private RoleRepository rr;

    @GetMapping("/role")
    public ResponseEntity getAllRole() {
        if (rr.findAll().isEmpty()) {
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        } else {
            return new ResponseEntity(rr.findAll(), HttpStatus.OK);
        }
    }
}
