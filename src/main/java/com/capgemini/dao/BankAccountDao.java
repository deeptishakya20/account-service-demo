package com.capgemini.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.entity.BankAccount;

@Repository
public interface BankAccountDao extends JpaRepository<BankAccount, Integer> {

}