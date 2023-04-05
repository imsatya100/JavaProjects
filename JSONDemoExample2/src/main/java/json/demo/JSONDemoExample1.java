package json.demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JSONDemoExample1 {
	private static final String PATH="E:\\Mohanty.S\\JSON Files\\Example5.json";
	public static void display(JSONArray arr){
		Iterator<?> litr =arr.iterator();
		
		while(litr.hasNext()){
			JSONObject jso = (JSONObject) litr.next();
			System.out.println(jso.get("id")+"\t"+jso.get("type"));
		}
	}
	public static void main(String[] args) {
		JSONParser parser = new JSONParser();
		try {
			FileReader filereader  = new FileReader(PATH);
			BufferedReader bfr = new BufferedReader(filereader);
			JSONObject obj = (JSONObject) parser.parse(bfr);
			JSONObject items = (JSONObject) obj.get("items");
			JSONObject item = (JSONObject) items.get("item");
			JSONObject batters = (JSONObject) item.get("batters");
			JSONArray arr = (JSONArray) batters.get("batter");
			display(arr);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
