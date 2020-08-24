package com.ashokit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.controller.AccountRepository;
import com.ashokit.entity.Account;


@Service
public class AccountServiceImpl implements IAccountService {
	
	@Autowired
	private AccountRepository repo;

	@Override
	public Integer saveAccountDetails(Account account) {
		return repo.save(account).getAccountId();
	}

	@Override
	public Account getAccountById(int accId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Account> getAllAccounts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Account> getAllAdminAccounts(String role) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Account> getAllCaseWorkerAccounts(String role) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateAccountDetails(int accId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean softDeleteAccount() {
		// TODO Auto-generated method stub
		return false;
	}

}
