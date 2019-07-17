package com.example.demo.repositories;

import com.example.demo.entities.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Pageable;

import java.util.*;

public interface AccountRepository extends JpaRepository<AccountEntity, Integer> {

    AccountEntity findByPhone(String phone);

    AccountEntity findById(int id);

    List<AccountEntity> findAllByOrderByIdDesc(Pageable pageable);

    List<AccountEntity> findAllByStatusOrderByUserName(String status);

}
