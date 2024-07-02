package org.serialization;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestSerialization {
	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		File f = new File("C:\\Users\\jayas\\eclipse-workspace\\JSONText\\src\\test\\resources\\Text5.json");
		ObjectMapper objectMapper = new ObjectMapper();
		
		ArrayList<Batter> batter = new ArrayList<Batter>();
		Batter batter2 = new Batter("1001", "Regular");
		Batter batter3 = new Batter("1002", "Chocolate");
		Batter batter4 = new Batter("1003", "Blueberry");
		Batter batter5 = new Batter("1004", "Devil's Food");
		batter.add(batter2);
		batter.add(batter3);
		batter.add(batter4);
		batter.add(batter5);

		ArrayList<Topping> topping = new ArrayList<Topping>();
		topping.add(new Topping("5001", "None"));
		topping.add(new Topping("5002", "Glazed"));
		topping.add(new Topping("5005", "Sugar"));
		topping.add(new Topping("5007", "Powdered Sugar"));
		topping.add(new Topping("5006", "Chocolate with Sprinkles"));
		topping.add(new Topping("5003", "Chocolate"));
		topping.add(new Topping("5004", "Maple"));
		Batters batters = new Batters(batter);
		Root root = new Root("0001", "donut", "Cake", 0.55, batters, topping);
		objectMapper.writeValue(f, root);
	}
}

