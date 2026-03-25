package com.codegnan.javaapp12032026.program;

import java.util.HashMap;
import java.util.Map;

import com.codegnan.javaapp12032026.dao.PersonPassportDAO;
import com.codegnan.javaapp12032026.entity.Passport;
import com.codegnan.javaapp12032026.entity.Person;

public class SelectProgram {
	public static void main(String[] args) {
		PersonPassportDAO personPassportDAO = new PersonPassportDAO();
		HashMap<Person,Passport> map = personPassportDAO.selectAllPersonAndPassportRecords();
		
		for(Map.Entry<Person, Passport> entry : map.entrySet()) {
			Person person = entry.getKey();
			Passport passport = entry.getValue();
			
			System.out.println(person);
			System.out.println(passport);
			System.out.println();
		}
	}
}
