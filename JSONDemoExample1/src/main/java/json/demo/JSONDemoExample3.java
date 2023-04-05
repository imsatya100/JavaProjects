package json.demo;

import java.util.Iterator;

import org.json.JSONArray;
import org.json.JSONObject;

public class JSONDemoExample3 {

	public static void main(String[] args) {
		JSONObject obj = new JSONObject();
		obj.put("name", "SATYA");
		obj.put("age", 22);
		obj.put("mail-ID", "imsatya100@gmail.com");
		obj.put("phone", "6370024102");
		
		JSONObject obj1 = new JSONObject();
		obj1.put("name", "SARTHAK");
		obj1.put("age", 23);
		obj1.put("mail-ID", "sarthak@gmail.com");
		obj1.put("phone", "9090552356");
		
		JSONArray employee = new JSONArray();
		employee.put(obj);
		employee.put(obj1);
		
		Iterator<Object> itr=employee.iterator();
		while(itr.hasNext()){
			//System.out.println(itr.next());
			JSONObject jso =(JSONObject) itr.next();
			Iterator<String> it =jso.keys();
			while(it.hasNext()){
				System.out.println(it.next());
			}
			//System.out.println(jso.toString());
		}
		//System.out.println(employee);
	}

}
