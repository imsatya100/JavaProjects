package json.demo;

import java.io.File;
import java.io.PrintWriter;

import org.json.simple.JSONObject;

public class JSONDemoExample2 {
	private static final String PATH="E:\\Mohanty.S\\JSON Files\\Example6.JSON";
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		JSONObject obj = new JSONObject();
		//Map<String,Object> apogee = new TreeMap<String,Object>(); 
			
		obj.put("name", "SATYA");
		obj.put("age", 22);
		obj.put("mail-ID", "imsatya100@gmail.com");
		obj.put("phone", "6370024102");
		File file = new File(PATH);
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(file);
			pw.write(obj.toJSONString());
			System.out.println(obj.toJSONString());
			System.out.println(obj.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			pw.close();
		}
		
		//System.out.println(obj);
	}
}
