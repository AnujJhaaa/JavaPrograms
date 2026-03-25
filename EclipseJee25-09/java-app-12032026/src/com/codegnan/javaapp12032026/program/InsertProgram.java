package com.codegnan.javaapp12032026.program;

import com.codegnan.javaapp12032026.dao.PersonPassportDAO;
import com.codegnan.javaapp12032026.entity.Passport;
import com.codegnan.javaapp12032026.entity.Person;

public class InsertProgram {
	public static void main(String[] args) {
		Person person = new Person(6,"Nitin","Kumar","Sharma",'M',"1999-02-13","Dehradun","Uttarakhand","Santosh Sharma","Sanjana Sharma","Preeti Sharma");
		Passport passport = new Passport(6,"P6789012","Regular","2020-08-23","2030-08-22","Deharadun","Uttarakhand",6);
		
		PersonPassportDAO personPassportDAO = new PersonPassportDAO();
		
		int rowsAffected = personPassportDAO.insertRecordInPerson(person);
		
		if(rowsAffected>0) {
			System.out.println("Record Inserted.");
		} else {
			System.out.println("Record not Inserted ");
		}
		
		
		rowsAffected = personPassportDAO.insertRecordInPassport(passport);
		if(rowsAffected > 0) {
			System.out.println("Record Inserted.");
		} else {
			System.out.println("Record not Inserted ");
		}
	}
}
