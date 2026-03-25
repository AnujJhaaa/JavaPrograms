package com.codegnan.javaapp12032026.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

import com.codegnan.javaapp12032026.entity.Passport;
import com.codegnan.javaapp12032026.entity.Person;

public class PersonPassportDAO {
	public int insertRecordInPerson(Person person) {
		
		DataBaseUtility.loadDriverClass();
		Connection connection = DataBaseUtility.getConnection();
		Statement statement  = DataBaseUtility.createStatement(connection);
		
		String sql = "INSERT INTO person VALUES (%d,'%s','%s','%s','%c','%s','%s','%s','%s','%s','%s')";
		sql = sql.formatted(person.getPersonId(),
				person.getFirstName(),
				person.getMiddleName(),
				person.getLastName(),
				person.getGender(),
				person.getDateOfBirth(),
				person.getCityOfBirth(),
				person.getStateOfBirth(),
				person.getFatherName(),
				person.getMotherName(),
				person.getHusbandSpouseName());
		
		
		int rowsAffected = DataBaseUtility.executeDML(statement, sql);
		
		DataBaseUtility.closeStatement(statement);
		DataBaseUtility.closeConnection(connection);
		
		return rowsAffected;
	}
	
	public int insertRecordInPassport(Passport passport) {
			
			DataBaseUtility.loadDriverClass();
			Connection connection = DataBaseUtility.getConnection();
			Statement statement  = DataBaseUtility.createStatement(connection);
			
			String sql = "SELECT person_id FROM person WHERE person_id = %d";
			sql = sql.formatted(passport.getPersonId());
			ResultSet resultSet = DataBaseUtility.createResultSet(statement, sql);
					
			int rowsAffected = 0;
			
			try {
				if(resultSet.next()) {
					sql = "INSERT INTO passport VALUES (%d,'%s','%s','%s','%s','%s','%s',%d)";
					sql = sql.formatted(passport.getPassportId(),
							passport.getPassportNumber(),
							passport.getPassportType(),
							passport.getDateOfIssue(),
							passport.getDateOfExpiry(),
							passport.getCityOfIssue(),
							passport.getStateOfIssue(),
							passport.getPersonId());
					
					
					rowsAffected = DataBaseUtility.executeDML(statement, sql);
				}
			}	catch(SQLException sqlEx) {
				sqlEx.printStackTrace();
			}
			
			DataBaseUtility.closeResultSet(resultSet);
			DataBaseUtility.closeStatement(statement);
			DataBaseUtility.closeConnection(connection);
			
			return rowsAffected;
			
			
		}
	
	public HashMap<Person, Passport> selectAllPersonAndPassportRecords(){
		
		DataBaseUtility.loadDriverClass();
		Connection connection = DataBaseUtility.getConnection();
		Statement statement = DataBaseUtility.createStatement(connection);
		
		String sql = "SELECT ";
		sql+= "pt.person_id, pt.first_name, pt.middle_name, pt.last_name, pt.gender, pt.date_of_birth, pt.city_of_birth, pt.state_of_birth, pt.father_name, pt.mother_name, pt.husband_spouse_name, ";
		sql+= "ct.passport_id, ct.passport_number, ct.passport_type, ct.date_of_issue, ct.date_of_expiry, ct.city_of_issue, ct.state_of_issue ";
		sql+= "FROM person pt INNER JOIN passport ct ON pt.person_id = ct.person_id";
		
		ResultSet resultSet  = DataBaseUtility.createResultSet(statement, sql);
		
		
		HashMap<Person, Passport> map = new HashMap<>();
		
		
		try{
			while(resultSet.next()) {
				Person person  = new Person();
				Passport passport = new Passport();
				
				
				person.setPersonId(resultSet.getInt("person_id"));
				person.setFirstName(resultSet.getString("first_name"));
				person.setMiddleName(resultSet.getString("middle_name"));
				person.setLastName(resultSet.getString("last_name"));
				person.setGender(resultSet.getString("gender").charAt(0));
				person.setDateOfBirth(resultSet.getString("date_of_birth"));
				person.setCityOfBirth(resultSet.getString("city_of_birth"));
				person.setStateOfBirth(resultSet.getString("state_of_birth"));
				person.setFatherName(resultSet.getString("father_name"));
				person.setMotherName(resultSet.getString("mother_name"));
				person.setHusbandSpouseName(resultSet.getString("husband_spouse_name"));
				
				passport.setPassportId(resultSet.getInt("passport_id"));
				passport.setPassportNumber(resultSet.getString("passport_number"));
				passport.setPassportType(resultSet.getString("passport_type"));
				passport.setDateOfIssue(resultSet.getString("date_of_issue"));
				passport.setDateOfExpiry(resultSet.getString("date_of_expiry"));
				passport.setCityOfIssue(resultSet.getString("city_of_issue"));
				passport.setStateOfIssue(resultSet.getString("state_of_issue"));
				passport.setPersonId(resultSet.getInt("person_id"));
				
				map.put(person, passport);
				
			}
			
		}	catch(SQLException sqlEx) {
			sqlEx.printStackTrace();
		}
		
		
		return map;
	}
}
