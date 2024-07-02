package org.deserializationdemo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.databind.ObjectMapper;

public class TestDeserialization {

	public static void main(String[] args) throws IOException   {
		FileReader fileReader = new FileReader("C:\\Users\\jayas\\eclipse-workspace\\JSONText\\src\\test\\resources\\Text.json");
		ObjectMapper objectMapper = new ObjectMapper();
		Root readValue = objectMapper.readValue(fileReader, Root.class);
		System.out.println(readValue.getId());
		System.out.println(readValue.getType());
		System.out.println(readValue.getName());
		System.out.println(readValue.getPpu());
		Batters batters = readValue.getBatters();
		ArrayList<Batter> batter = batters.getBatter();
		for (Batter batter2 : batter) {
			System.out.println(batter2.getId());
			System.out.println(batter2.getType());
		}
		ArrayList<Topping> topping = readValue.getTopping();
		for (Topping topping2 : topping) {
			System.out.println(topping2.getId());
			System.out.println(topping2.getType());
		}
	}
}