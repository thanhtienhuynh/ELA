package com.example.demo.controllers;

import com.example.demo.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.example.demo.MainConstant.TEACHER_ROLE_ID;

@RestController

public class TeacherAccountController {
    @Autowired
    private AccountRepository accountRepository;

    @GetMapping("/account_teacher")
    public ResponseEntity getAllTeacherAccount() {
        if(accountRepository.findAllByRoleId(TEACHER_ROLE_ID).isEmpty()){
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        } else {
            return new ResponseEntity(accountRepository.findAllByRoleId(TEACHER_ROLE_ID), HttpStatus.OK);
        }
    }
}
