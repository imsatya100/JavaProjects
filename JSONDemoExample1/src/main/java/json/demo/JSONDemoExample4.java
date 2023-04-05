package json.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;

public class JSONDemoExample4 {
		public static void main(String[] args) {
			JSONArray arr = new JSONArray();
			arr.put("SATYA");
			arr.put("SARTHAK");
			arr.put("RAJESH");
			arr.put("BIRA");
			arr.put("RANIT");
			arr.put("JYOTI");
			arr.put("BHABANI");
			//System.out.println(arr);
			List<String> li = new ArrayList<String>();
			Map<Integer,String> map = new LinkedHashMap<Integer,String>();
			Iterator<Object> itr = arr.iterator();
			int i=1;
			while(itr.hasNext()){
				//System.out.println(itr.next());
				String obj = (String) itr.next();
				li.add(obj);
				map.put(i, obj);
				i++;
			}
			
			System.out.println(li);
			System.out.println(map);
			
		}
}
