package com.codegnan.app.javaapp25032026.dao;

import java.util.List;
import java.util.Map;

import com.codegnan.app.javaapp25032026.entity.Account;
import com.codegnan.app.javaapp25032026.entity.Kyc;

public interface AccountDao {
	Account getAccountByAccountNumber(int accountNumber);
	Kyc getAccountKycByAccountNumber(int accountNumber);
	Map<Account, Kyc> getAccountAndKycByAccountNumber(int accountNumber);
	Map<Account, Kyc> getAllAccountsAndKycs();
	List<Account> getAllAccounts();
	List<Kyc> getAllKycs();
	boolean saveAccount(Account account, Kyc kyc);
	boolean updatePanInformationByAccountNumber(int accountNumber, String panNumber);
	boolean updateAadhaarInformationByAccountNumber(int accountNumber, String aadhaarNumber);
	boolean updateKycInformationByAccountNumber(int accountNumber, String panNumber, String aadhaarNumber);
	boolean updateAccountNumber(int existingAccountNumber, int newAccountNumber);
	boolean removeAccount(int accountNumber);
}