package json.demo;

import java.util.Iterator;

import org.json.JSONArray;
import org.json.JSONObject;

public class JSONDemoExample8 {
	public static void display(JSONArray arr){
		Iterator<Object> itr = arr.iterator();
		System.out.println("ID\t\tType");
		System.out.println("=========================================================");
		System.out.println();
		while(itr.hasNext()){
			JSONObject batterObject = (JSONObject) itr.next();
			System.out.println(batterObject.get("id")+"\t\t"+batterObject.get("type"));
		}
		System.out.println("=========================================================");
		System.out.println();
	}
	public static void main(String[] args) {
		String data= "[{\"id\": \"0001\",\"type\": \"donut\",\"name\": \"Cake\",\"ppu\": 0.55,"
+ "\"batters\":{\"batter\":[{ \"id\": \"1001\", \"type\": \"Regular\" },"
+ "{ \"id\": \"1002\", \"type\": \"Chocolate\" },{ \"id\": \"1003\", \"type\": \"Blueberry\" }, "
+ " { \"id\": \"1004\", \"type\": \"Devil's Food\" }]},\"topping\":[ "
+ "{ \"id\": \"5001\", \"type\": \"None\" },{ \"id\": \"5002\", \"type\": \"Glazed\" }, "
+ "{ \"id\": \"5005\", \"type\": \"Sugar\" },{ \"id\": \"5007\", \"type\": \"Powdered Sugar\" }, "
+ "{ \"id\": \"5006\", \"type\": \"Chocolate with Sprinkles\" },{ \"id\": \"5003\", \"type\": \"Chocolate\" }, "
+ "{ \"id\": \"5004\", \"type\": \"Maple\" }]},"
+ "{\"id\": \"0002\",\"type\": \"donut\",\"name\": \"Raised\",\"ppu\": 0.55,"
+ "\"batters\":{\"batter\":[{ \"id\": \"1001\", \"type\": \"Regular\" }]},\"topping\":[ "
+ "{ \"id\": \"5001\", \"type\": \"None\" },{ \"id\": \"5002\", \"type\": \"Glazed\" }, "
+ "{ \"id\": \"5005\", \"type\": \"Sugar\" },{ \"id\": \"5003\", \"type\": \"Chocolate\" }, "
+ "{ \"id\": \"5004\", \"type\": \"Maple\" }]},"
+ "{\"id\": \"0003\",\"type\": \"donut\",\"name\": \"old Fashioned\",\"ppu\": 0.55,"
+ "\"batters\":{\"batter\":[{ \"id\": \"1001\", \"type\": \"Regular\" },"
+ "{ \"id\": \"1002\", \"type\": \"Chocolate\" }]},\"topping\":[ "
+ "{ \"id\": \"5001\", \"type\": \"None\" },{ \"id\": \"5002\", \"type\": \"Glazed\" }, "
+" { \"id\": \"5003\", \"type\": \"Chocolate\" }, { \"id\": \"5004\", \"type\": \"Maple\" }]}]";
			
		
		
		JSONArray arr = new JSONArray(data);
		Iterator<Object> itr = arr.iterator();
		while(itr.hasNext()){
			JSONObject json = (JSONObject) itr.next();
			System.out.println("OrderID :"+json.get("id")+ "\tName :"+json.get("name"));
			JSONObject batters = (JSONObject) json.get("batters");
			JSONArray batter = (JSONArray) batters.get("batter");
			display(batter);
		}

	}
}

















