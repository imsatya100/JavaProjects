package json.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.json.simple.JSONArray;

public class JSONDemoExample4 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		List<String> employeeNames = new ArrayList<String>();
		employeeNames.add("RAJESH");
		employeeNames.add("BIRA");
		employeeNames.add("SOUMYA");
		employeeNames.add("SATYA");
		employeeNames.add("SARTHAK");
		employeeNames.add("BHABANI");
		employeeNames.add("LIPUN");
		employeeNames.add("JYOTI");
		employeeNames.add("RANIT");
		JSONArray employee = new JSONArray();
		employee.addAll(employeeNames);
		System.out.println(employee);
		ListIterator<String> litr= employee.listIterator();
		//Spliterator<String> spl = employee.spliterator();
		
		while(litr.hasNext()){
			litr.next();
		}
		while(litr.hasPrevious()){
			System.out.println(litr.previous());
		}
		
		
	}
}
