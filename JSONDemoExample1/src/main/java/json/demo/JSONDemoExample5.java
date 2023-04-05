package json.demo;

import org.json.JSONArray;
import org.json.JSONObject;

public class JSONDemoExample5 {
	 public static void main(String[] args){
	        
	        String jsonStr = "{\"name\":\"SK\",\"arr\":{\"a\":\"1\",\"b\":\"2\"}}";
	        JSONObject jsonObj = new JSONObject(jsonStr);
	        String name = jsonObj.getString("name");
	        System.out.println(name);

	        JSONObject obj = jsonObj.getJSONObject("arr");
	        System.out.println(obj.get("a"));
	        System.out.println(obj.get("b"));
	        
	        
	        JSONObject jso = new JSONObject();
	        jso.put("a", "1");
	        jso.put("b", "2");
	         
	        
	        JSONObject jso1 = new JSONObject();
	        jso1.put("name","satya");
	        JSONObject jso2 = new JSONObject();
	        jso2.put("arr", jso);
	        
	        JSONArray arr = new JSONArray();
	        arr.put(jso1);
	        arr.put(jso2);
	        String data=arr.toString();
	        System.out.println(data);
	        
	    }
}
