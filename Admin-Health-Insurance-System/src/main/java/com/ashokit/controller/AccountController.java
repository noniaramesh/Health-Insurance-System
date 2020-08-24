package com.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ashokit.entity.Account;
import com.ashokit.service.IAccountService;
import com.ashokit.util.AccountUtil;

@Controller
public class AccountController {

	@Autowired
	private IAccountService accountService;

	@Autowired
	private AccountUtil util;

	@GetMapping(value = "/show")
	public String showForm(ModelMap map) {
		map.addAttribute("account", new Account());
		map.addAttribute("accRoles", util.getAllRoles());
		return "accountCreation";
	}

	@PostMapping(value = "/createAccount")
	public String saveAccount(@ModelAttribute("account") Account caseWorkerAccount, RedirectAttributes redirectAttributes) {

		caseWorkerAccount.setDeleteSwitch('Y');
		caseWorkerAccount.setAccountStatus(false);
		caseWorkerAccount.setTempPassword(util.generateTempPassword());

		Integer accId = accountService.saveAccountDetails(caseWorkerAccount);

		if (accId == null)
			redirectAttributes.addFlashAttribute("msg", "Some Problem Occured!!!");
		else
			redirectAttributes.addFlashAttribute("msg", "Account Created Successfully with Id :: " + accId);

		return "redirect:show";
	}

}
