package com.ashokit.service;

import java.util.List;

import com.ashokit.entity.Account;

public interface IAccountService {

	public Integer saveAccountDetails(Account account);

	public Account getAccountById(int accId);

	public List<Account> getAllAccounts();

	public List<Account> getAllAdminAccounts(String role);

	public List<Account> getAllCaseWorkerAccounts(String role);

	public boolean updateAccountDetails(int accId);

	public boolean softDeleteAccount();

}
