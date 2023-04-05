package json.demo;

import org.json.JSONObject;

public class JSONDemoExample1 {
	public static void main(String[] args) {
		JSONObject obj = new JSONObject();
		obj.put("1", new JSONObject().put("name", "SATYA"));
		obj.put("2", new JSONObject().put("name", "SARTHAK"));
		obj.put("3", new JSONObject().put("name", "BHABANI"));
		obj.put("4", new JSONObject().put("name", "SOUMYA"));
		obj.put("5", new JSONObject().put("name", "ABHISEK"));
		obj.put("6", new JSONObject().put("name", "RAJESH"));
		System.out.println(obj);
	}
}
