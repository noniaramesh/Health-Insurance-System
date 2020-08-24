package com.ashokit.controller;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Serializable> {

}
