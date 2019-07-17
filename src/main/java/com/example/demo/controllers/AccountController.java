package com.example.demo.controllers;

import com.example.demo.MainConstant;
import com.example.demo.repositories.AccountRepository;
import com.example.demo.utils.DateTimeUtils;
import com.example.demo.entities.*;
import org.aspectj.apache.bcel.classfile.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.*;


@RestController
public class AccountController {
    @Autowired
    private AccountRepository accountRepository;

    @GetMapping("/account")
    public ResponseEntity getAllAccount() {
        if (accountRepository.findAll().isEmpty()) {
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        } else {
            return new ResponseEntity(accountRepository.findAll(), HttpStatus.OK);
        }
    }

    @PostMapping("/account/create")
    public ResponseEntity signUpAccount(@RequestBody Map<String, String> body) {
        String userName = body.get("userName");
        String password = body.get("password");
        String phone = body.get("phone");
        String role = body.get("role");

        AccountEntity accountEntity = paramAccountEntityCreateRequest(userName, password, phone, role);

        accountRepository.save(accountEntity);

        return new ResponseEntity(HttpStatus.CREATED);
    }

    private AccountEntity paramAccountEntityCreateRequest( String userName, String password, String phone, String role) {
        AccountEntity accountEntity = new AccountEntity();

        accountEntity.setUserName(userName);
        accountEntity.setCreatedTime(DateTimeUtils.getCurrentTime());
        accountEntity.setPhone(phone);
        accountEntity.setPassword(password);
        if (role.equalsIgnoreCase(MainConstant.ROLE_ADMIN)) {
            accountEntity.setRoleId(3);
        } else if (role.equalsIgnoreCase(MainConstant.ROLE_TEACHER)) {
            accountEntity.setRoleId(1);
        } else {
            accountEntity.setRoleId(2);
        }
        return accountEntity;
    }
}
