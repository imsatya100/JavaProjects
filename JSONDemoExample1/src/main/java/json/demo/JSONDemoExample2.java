package json.demo;


import org.json.JSONObject;

public class JSONDemoExample2 {
	public static void main(String[] args) {
		JSONObject obj = new JSONObject();
		//Map<String,Object> obj = new TreeMap<String,Object>(); 
		obj.put("name", "SATYA");
		obj.put("age", 22);
		obj.put("mail-ID", "imsatya100@gmail.com");
		obj.put("phone", "6370024102");
		System.out.println(obj);
	}
}
