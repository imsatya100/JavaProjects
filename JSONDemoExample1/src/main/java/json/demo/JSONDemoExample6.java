package json.demo;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.json.JSONArray;
import org.json.JSONObject;

public class JSONDemoExample6 {
	public static void main(String[] args) {
		String data = "[{\"color\": \"red\",\"value\": \"#f00\"},{\"color\": \"green\","+
				"\"value\": \"#0f0\"},{\"color\": \"blue\",\"value\": \"#00f\"},{\"color\": \"cyan\","+
				"\"value\": \"#0ff\"},{\"color\": \"magenta\",\"value\": \"#f0f\"},{\"color\": \"yellow\","
				+"\"value\": \"#ff0\"},{\"color\": \"black\",\"value\": \"#000\"},]";
		JSONArray arr = new JSONArray(data);
		Iterator<Object> itr = arr.iterator();
		Map<String,String> map = new LinkedHashMap<String,String>();
		while(itr.hasNext()){
			//System.out.println(itr.next());
			JSONObject jso = (JSONObject) itr.next();
			String color=jso.optString("color");
			String value=jso.optString("value");
			map.put(color, value);
			
		}
		//System.out.println(map);
		System.out.println("Color\t\tValue");
		/*map.forEach((color,value)->{
			System.out.println(color+"\t"+value);
			
			
		});*/
		
		Set<Entry<String,String>> set = map.entrySet();
		
		Iterator<Entry<String,String>>it = set.iterator();
		while(it.hasNext()){
			//System.out.println(it.next());
			Entry<String,String> entry=it.next();
			System.out.println(entry.getKey()+"\t\t"+entry.getValue());
		}
		
	}
}





