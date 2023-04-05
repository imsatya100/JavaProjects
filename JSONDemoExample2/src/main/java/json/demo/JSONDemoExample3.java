package json.demo;

import java.io.File;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONDemoExample3 {
	private static final String PATH="E:\\Mohanty.S\\JSON Files\\Example4.json";
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Map<String,String> address = new LinkedHashMap<String,String>();
		//JSONObject address = new JSONObject();
		address.put("Area", "Ameerpet");
		address.put("City", "Hyderabad");
		address.put("State", "Telangana");
		Map<String,Object> employee = new LinkedHashMap<String,Object>();
		//JSONObject employee = new JSONObject();
		employee.put("Name", "Satya");
		employee.put("Age", 23);
		employee.put("Gender", "Male");
		employee.put("Married", false);
		employee.put("Permanent", false);
		employee.put("Salary", 20000);
		employee.put("Address", address);
		Map<String,Object> employee1 = new LinkedHashMap<String,Object>();
		//JSONObject employee = new JSONObject();
		employee1.put("Name", "Sarthak");
		employee1.put("Age", 23);
		employee1.put("Gender", "Male");
		employee1.put("Married", false);
		employee1.put("Permanent", false);
		employee1.put("Salary", 22000);
		employee1.put("Address", address);
		JSONArray arr = new JSONArray();
		arr.add(employee);
		arr.add(employee1);
		
		Map<String,Object> company = new LinkedHashMap<String,Object>();
		//JSONObject company = new JSONObject();
		company.put("Employee", arr);
		JSONObject comp = new JSONObject(company);
		
		try {
			File file = new File(PATH);
			PrintWriter pw = new PrintWriter(file);
			pw.write(comp.toJSONString());
			System.out.println("Employe Added Successfull....");
			System.out.println(comp);
			pw.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
