package org.demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
public class TestScript {
	public static void main(String[] args) throws IOException, ParseException {
		FileReader fileReader = new FileReader(new File("C:\\Users\\jayas\\eclipse-workspace\\JSONText\\src\\test\\resources\\Text.json"));
		JSONParser jsonParser = new JSONParser();
		Object parse = jsonParser.parse(fileReader);
		JSONObject jsonObject = (JSONObject)parse;
		System.out.println(jsonObject.get("id"));
		System.out.println(jsonObject.get("type"));
		System.out.println(jsonObject.get("name"));
		System.out.println(jsonObject.get("ppu"));
		JSONObject jsonObject1 = (JSONObject)parse;
		Object object = jsonObject1.get("batters");
		JSONObject jsonObject2 = (JSONObject)object;
		Object object2 = jsonObject2.get("batter");
		JSONArray jsonArray = (JSONArray)object2;
		for (int i = 0; i <jsonArray.size() ; i++) {
			Object object3 = jsonArray.get(i);
			JSONObject jsonObject3 = (JSONObject)object3;
			System.out.println(jsonObject3.get("id"));
			System.out.println(jsonObject3.get("type"));
		}
		Object object3 = jsonObject.get("topping");
		JSONArray jsonArray2 = (JSONArray)object3;
		for (int i = 0; i <jsonArray2.size() ; i++) {
			Object object4 = jsonArray2.get(i);
			JSONObject jsonObject3 = (JSONObject)object4;
			System.out.println(jsonObject3.get("id"));
			System.out.println(jsonObject3.get("type"));
		}
		
	}

}
