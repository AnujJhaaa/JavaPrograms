package com.codegnan.app.javaapp25032026.program;

import java.util.List;
import java.util.Map;

import com.codegnan.app.javaapp25032026.dao.AccountDaoImplentation;
import com.codegnan.app.javaapp25032026.entity.Account;
import com.codegnan.app.javaapp25032026.entity.Kyc;

public class MainProgram {
	public static void main(String[] args) {
		AccountDaoImplentation dao = new AccountDaoImplentation();
		
		/*Account newAccount = new Account();
		newAccount.setAccount_number(105);
		newAccount.setAccount_holder_name("Person5");
		newAccount.setAccount_type("Savings");
		
		Kyc newKyc = new Kyc();
		newKyc.setPan_number("PAN105");
		newKyc.setAadhaar_number("AADHAAR105");
		
		boolean isSaved = dao.saveAccount(newAccount, newKyc);
		
		if(isSaved) {
			System.out.println("Records saved successfully.");
		}
		else {
			System.out.println("Records not saved.");
		}*/
		
		
		/*Map<Account, Kyc> map = dao.getAllAccountsAndKycs();
		
		for(Map.Entry<Account, Kyc> entry : map.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			System.out.println();
		}*/
		
		/*Map<Account, Kyc> map = dao.getAccountAndKycByAccountNumber(105);
		for(Map.Entry<Account, Kyc> entry : map.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			System.out.println();
		}*/
		
		/*List<Kyc> list = dao.getAllKycs();
		for(Kyc kyc : list) {
			System.out.println(kyc);
		}*/
		
		/*List<Account> list = dao.getAllAccounts();
		for(Account account : list) {
			System.out.println(account);
		}*/
		
		/*Account account = dao.getAccountByAccountNumber(105);
		System.out.println(account);
		Kyc kyc = dao.getAccountKycByAccountNumber(105);
		System.out.println(kyc);*/
		
		/*boolean isUpdated = dao.updateKycInformationByAccountNumber(105, "pan105", "aadhaar105");
		
		if(isUpdated) {
			System.out.println("Record Updated successfully.");
		}
		else {
			System.out.println("Record not updated.");
		}*/
		
		/*boolean isDeleted = dao.removeAccount(105);
		if(isDeleted) {
			System.out.println("Record Deleted successfully.");
		}
		else {
			System.out.println("Record not deleted.");
		}*/
		
		/*boolean isUpdated = dao.updateAccountNumber(104, 404);
		if(isUpdated) {
			System.out.println("Record Updated successfully.");
		}
		else {
			System.out.println("Record not updated.");
		}*/
		
		/*boolean isUpdated = dao.updateAadhaarInformationByAccountNumber(404,"aadhaar404");
		if(isUpdated) {
			System.out.println("Record Updated successfully.");
		}
		else {
			System.out.println("Record not updated.");
		}*/
		
		/*boolean isUpdated = dao.updatePanInformationByAccountNumber(404,"pan404");
		if(isUpdated) {
			System.out.println("Record Updated successfully.");
		}
		else {
			System.out.println("Record not updated.");
		}*/
	}
} 