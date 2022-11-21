package com.json;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.json.model.Person;


/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper map = new ObjectMapper();
		Person person = map.readValue(new File("info/person.json"), Person.class);
		
		System.out.println(person.getId()+"  "+person.getName());
		
		String fullPhone = person.getPhones().getCode()+person.getPhones().getPhone();
		
		System.out.println(fullPhone);
	}
}
