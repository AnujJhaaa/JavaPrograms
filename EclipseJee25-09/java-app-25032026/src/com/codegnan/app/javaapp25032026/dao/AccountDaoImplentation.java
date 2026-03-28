package com.codegnan.app.javaapp25032026.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.codegnan.app.javaapp25032026.entity.Account;
import com.codegnan.app.javaapp25032026.entity.Kyc;

public class AccountDaoImplentation implements AccountDao {

	@Override
	public Account getAccountByAccountNumber(int accountNumber) {
		DatabaseUtility.loadDriverClass();
		Connection conn = DatabaseUtility.createConnection();
		Statement stmt = DatabaseUtility.createStatement(conn);
		
		String sql = "SELECT * FROM account WHERE account_number = " + accountNumber;
		ResultSet resultSet = null;
		Account account = null;
		
		try {
			resultSet = stmt.executeQuery(sql);
			if(resultSet.next()) {
				account = new Account();
				
				account.setAccount_id(resultSet.getInt(1));
				account.setAccount_number(resultSet.getInt(2));
				account.setAccount_holder_name(resultSet.getString(3));
				account.setAccount_type(resultSet.getString(4));
			}
		}	catch(SQLException sqlEx) {
				sqlEx.printStackTrace();
		} 	finally {
				DatabaseUtility.closeResultSet(resultSet);
				DatabaseUtility.closeStatement(stmt);
				DatabaseUtility.closeConnection(conn);
		}
		
		return account;
	}

	@Override
	public Kyc getAccountKycByAccountNumber(int accountNumber) {
		DatabaseUtility.loadDriverClass();
		Connection conn = DatabaseUtility.createConnection();
		Statement stmt = DatabaseUtility.createStatement(conn);
		
		String sql = "SELECT account_id FROM account WHERE account_number = " + accountNumber;
		ResultSet resultSet = null;
		Kyc kyc = null;
		int account_id = -1;
		
		try {
			resultSet = stmt.executeQuery(sql);
			if(resultSet.next()) {
				account_id = resultSet.getInt("account_id");
			}
			
			sql = "SELECT *  FROM kyc WHERE account_id = " + account_id;
			resultSet = stmt.executeQuery(sql);
			
			if(resultSet.next()) {
				kyc = new Kyc();
				
				kyc.setAccount_id(resultSet.getInt(1));
				kyc.setPan_number(resultSet.getString(2));
				kyc.setAadhaar_number(resultSet.getString(3));
			}
			
		}	catch(SQLException sqlEx) {
				sqlEx.printStackTrace();
		} 	finally {
				DatabaseUtility.closeResultSet(resultSet);
				DatabaseUtility.closeStatement(stmt);
				DatabaseUtility.closeConnection(conn);
		}
		
		return kyc;
	}

	@Override
	public Map<Account, Kyc> getAccountAndKycByAccountNumber(int accountNumber) {
		DatabaseUtility.loadDriverClass();
		Connection conn = DatabaseUtility.createConnection();
		Statement stmt = DatabaseUtility.createStatement(conn);
		
		String sql = "SELECT  pt.account_number,pt.account_holder_name,pt.account_type,ct.pan_number,ct.aadhaar_number "
				+ "FROM account pt INNER JOIN kyc ct "
				+ "ON pt.account_id = ct.account_id "
				+ "WHERE pt.account_number = " + accountNumber;
		ResultSet resultSet = null;
		Map<Account, Kyc>  map = null ;
		
		try {
			resultSet = stmt.executeQuery(sql);
			if(resultSet.next()) {
				map = new HashMap<>();
				Account account = new Account();
				Kyc kyc = new Kyc();
				
	
				account.setAccount_number(resultSet.getInt(1));
				account.setAccount_holder_name(resultSet.getString(2));
				account.setAccount_type(resultSet.getString(3));
				
				kyc.setAccount_id(resultSet.getInt(1));
				kyc.setPan_number(resultSet.getString(4));
				kyc.setAadhaar_number(resultSet.getString(5));
				
				map.put(account, kyc);
			}
		}	catch(SQLException sqlEx) {
				sqlEx.printStackTrace();
		} 	finally {
				DatabaseUtility.closeResultSet(resultSet);
				DatabaseUtility.closeStatement(stmt);
				DatabaseUtility.closeConnection(conn);
		}
		
		return map;
	}

	@Override
	public Map<Account, Kyc> getAllAccountsAndKycs() {
		DatabaseUtility.loadDriverClass();
		Connection conn = DatabaseUtility.createConnection();
		Statement stmt = DatabaseUtility.createStatement(conn);
		
		String sql = "SELECT  pt.account_id,pt.account_number,pt.account_holder_name,pt.account_type,ct.pan_number,ct.aadhaar_number "
				+ "FROM account pt INNER JOIN kyc ct "
				+ "ON pt.account_id = ct.account_id ";
		
		ResultSet resultSet = null;
		Map<Account, Kyc>  map = new HashMap<Account, Kyc>();
		
		try {
			resultSet = stmt.executeQuery(sql);
			while(resultSet.next()) {
				Account account = new Account();
				Kyc kyc = new Kyc();
				
				account.setAccount_id(resultSet.getInt(1));
				account.setAccount_number(resultSet.getInt(2));
				account.setAccount_holder_name(resultSet.getString(3));
				account.setAccount_type(resultSet.getString(4));
				
				kyc.setAccount_id(resultSet.getInt(1));
				kyc.setPan_number(resultSet.getString(5));
				kyc.setAadhaar_number(resultSet.getString(6));
				
				map.put(account, kyc);
			}
		}	catch(SQLException sqlEx) {
				sqlEx.printStackTrace();
		} 	finally {
				DatabaseUtility.closeResultSet(resultSet);
				DatabaseUtility.closeStatement(stmt);
				DatabaseUtility.closeConnection(conn);
		}
		
		return map;
	}

	@Override
	public List<Account> getAllAccounts() {
		DatabaseUtility.loadDriverClass();
		Connection conn = DatabaseUtility.createConnection();
		Statement stmt = DatabaseUtility.createStatement(conn);
		
		String sql = "SELECT * FROM account";
		ResultSet resultSet = null;
		List<Account> accounts = new ArrayList<Account>();
		
		try {
			resultSet = stmt.executeQuery(sql);
			while(resultSet.next()) {
				Account account = new Account();
	
				account.setAccount_id(resultSet.getInt(1));
				account.setAccount_number(resultSet.getInt(2));
				account.setAccount_holder_name(resultSet.getString(3));
				account.setAccount_type(resultSet.getString(4));
				
				accounts.add(account);
			}
		}	catch(SQLException sqlEx) {
				sqlEx.printStackTrace();
		} 	finally {
				DatabaseUtility.closeResultSet(resultSet);
				DatabaseUtility.closeStatement(stmt);
				DatabaseUtility.closeConnection(conn);
		}
		
		return accounts;
	}

	@Override
	public List<Kyc> getAllKycs() {
		DatabaseUtility.loadDriverClass();
		Connection conn = DatabaseUtility.createConnection();
		Statement stmt = DatabaseUtility.createStatement(conn);
		
		String sql = "SELECT * FROM kyc";
		
		ResultSet resultSet = null;
		List<Kyc> kycs = new ArrayList<Kyc>();
		
		try {
			resultSet = stmt.executeQuery(sql);
			
			while(resultSet.next()) {
				Kyc kyc = new Kyc();
				
				kyc.setAccount_id(resultSet.getInt(1));
				kyc.setPan_number(resultSet.getString(2));
				kyc.setAadhaar_number(resultSet.getString(3));
				
				kycs.add(kyc);
			}
			
		}	catch(SQLException sqlEx) {
				sqlEx.printStackTrace();
		} 	finally {
				DatabaseUtility.closeResultSet(resultSet);
				DatabaseUtility.closeStatement(stmt);
				DatabaseUtility.closeConnection(conn);
		}
		
		return kycs;
	}

	@Override
	public boolean saveAccount(Account account, Kyc kyc) {
		DatabaseUtility.loadDriverClass();
		Connection conn = DatabaseUtility.createConnection();
		Statement stmt = DatabaseUtility.createStatement(conn);
		
		String sql = "INSERT INTO account(account_number,account_holder_name,account_type) VALUES ("
				+ "%d,'%s','%s')";
		sql = sql.formatted(account.getAccount_number(),
				account.getAccount_holder_name(),
				account.getAccount_type());
		try {
			// transaction based queries
			conn.setAutoCommit(false);
			
			int rowsAffected = stmt.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS);
			if(rowsAffected>0) {
				ResultSet resultSet = stmt.getGeneratedKeys();
				
				//to point to the first column field
				resultSet.next();
				int account_id = resultSet.getInt(1);
				DatabaseUtility.closeResultSet(resultSet);
				
				sql = "INSERT INTO kyc VALUES (%d,'%s','%s')";
				sql = sql.formatted(account_id,
						kyc.getPan_number(),
						kyc.getAadhaar_number());
				
				rowsAffected = stmt.executeUpdate(sql);
				if(rowsAffected>0) {
					//if both queries executed successfully commit
					conn.commit();
					return true;
				}
			}
			
		}	catch(SQLException sqlEx) {
			sqlEx.printStackTrace();
			
				//if not the roll-back the changes
				try {
					conn.rollback();
				}	catch(SQLException sqlEx2) {
					sqlEx2.printStackTrace();
				}	
		}
			finally {
			DatabaseUtility.closeStatement(stmt);
			DatabaseUtility.closeConnection(conn);
		}
		
		return false;
	}

	@Override
	public boolean updatePanInformationByAccountNumber(int accountNumber, String panNumber) {
		DatabaseUtility.loadDriverClass();
		Connection conn = DatabaseUtility.createConnection();
		Statement stmt = DatabaseUtility.createStatement(conn);
		

		String sql = "SELECT account_id FROM account WHERE account_number = " + accountNumber;
		int rowsAffected = 0;
		
		try {
			ResultSet resultSet = stmt.executeQuery(sql);
			int account_id = -1;
			if(resultSet.next()) {
				account_id = resultSet.getInt(1);
			}
			DatabaseUtility.closeResultSet(resultSet);
			
			sql = "UPDATE kyc SET pan_number = '%s' WHERE account_id = " + account_id;
			sql = sql.formatted(panNumber);
			rowsAffected = stmt.executeUpdate(sql);
				
		}	catch(SQLException sqlEx) {
				sqlEx.printStackTrace();
		}	finally {
				DatabaseUtility.closeStatement(stmt);
				DatabaseUtility.closeConnection(conn);
			}
		
		return rowsAffected>0;
	}

	@Override
	public boolean updateAadhaarInformationByAccountNumber(int accountNumber, String aadhaarNumber) {
		DatabaseUtility.loadDriverClass();
		Connection conn = DatabaseUtility.createConnection();
		Statement stmt = DatabaseUtility.createStatement(conn);
		

		String sql = "SELECT account_id FROM account WHERE account_number = " + accountNumber;
		int rowsAffected = 0;
		
		try {
			ResultSet resultSet = stmt.executeQuery(sql);
			int account_id = -1;
			if(resultSet.next()) {
				account_id = resultSet.getInt(1);
			}
			DatabaseUtility.closeResultSet(resultSet);
			
			sql = "UPDATE kyc SET aadhaar_number = '%s' WHERE account_id = " + account_id;
			sql = sql.formatted(aadhaarNumber);
			rowsAffected = stmt.executeUpdate(sql);
				
		}	catch(SQLException sqlEx) {
				sqlEx.printStackTrace();
		}	finally {
				DatabaseUtility.closeStatement(stmt);
				DatabaseUtility.closeConnection(conn);
			}
		
		return rowsAffected>0;
	}

	@Override
	public boolean updateKycInformationByAccountNumber(int accountNumber, String panNumber, String aadhaarNumber) {
		DatabaseUtility.loadDriverClass();
		Connection conn = DatabaseUtility.createConnection();
		Statement stmt = DatabaseUtility.createStatement(conn);
		

		String sql = "SELECT account_id FROM account WHERE account_number = " + accountNumber;
		int rowsAffected = 0;
		
		try {
			ResultSet resultSet = stmt.executeQuery(sql);
			int account_id = -1;
			if(resultSet.next()) {
				account_id = resultSet.getInt(1);
			}
			DatabaseUtility.closeResultSet(resultSet);
			
			sql = "UPDATE kyc SET pan_number = '%s',aadhaar_number = '%s' WHERE account_id = " + account_id;
			sql = sql.formatted(panNumber,aadhaarNumber);
			rowsAffected = stmt.executeUpdate(sql);
				
		}	catch(SQLException sqlEx) {
				sqlEx.printStackTrace();
		}	finally {
				DatabaseUtility.closeStatement(stmt);
				DatabaseUtility.closeConnection(conn);
			}
		
		return rowsAffected>0;
	}

	@Override
	public boolean updateAccountNumber(int existingAccountNumber, int newAccountNumber) {
		DatabaseUtility.loadDriverClass();
		Connection conn = DatabaseUtility.createConnection();
		Statement stmt = DatabaseUtility.createStatement(conn);
		
		String sql = "UPDATE account SET account_number = %d WHERE account_number = " + existingAccountNumber;
		sql = sql.formatted(newAccountNumber);
		int rowsAffected = 0;
		
		try {
			rowsAffected = stmt.executeUpdate(sql);	
		}	catch(SQLException sqlEx) {
				sqlEx.printStackTrace();
		}	finally {
				DatabaseUtility.closeStatement(stmt);
				DatabaseUtility.closeConnection(conn);
			}
		
		return rowsAffected>0;
	}

	@Override
	public boolean removeAccount(int accountNumber) {
		DatabaseUtility.loadDriverClass();
		Connection conn = DatabaseUtility.createConnection();
		Statement stmt = DatabaseUtility.createStatement(conn);
		
		String sql = "DELETE FROM account WHERE account_number = " + accountNumber; 
		int rowsAffected = 0;
		
		try {
			rowsAffected = stmt.executeUpdate(sql);
		}	catch(SQLException sqlEx) {
				sqlEx.printStackTrace();
		}	finally {
				DatabaseUtility.closeStatement(stmt);
				DatabaseUtility.closeConnection(conn);
		}
	
		return rowsAffected>0;
	}
}
