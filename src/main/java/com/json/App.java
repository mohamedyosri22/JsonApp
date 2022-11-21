package com.json;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.json.model.User;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper map = new ObjectMapper();
		User user = map.readValue(new File("info/user.json"), User.class);
		System.out.println(user.getId() + "  " + user.getName());
		System.out.println(user.getAge() + "  " + user.getAddress()[0]+","+user.getAddress()[1]);
	}
}
