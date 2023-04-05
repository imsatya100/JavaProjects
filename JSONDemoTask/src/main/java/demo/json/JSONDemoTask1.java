package demo.json;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JSONDemoTask1 {
	private static final String PATH="E:\\Mohanty.S\\JSON Files\\JsonTask1.txt";
	public static void main(String[] args) {
		FileReader reader = null;
		BufferedReader bfr = null;
		try{
			reader = new FileReader(PATH);
			bfr = new BufferedReader(reader);
			JSONParser parser = new JSONParser();
			JSONObject json = (JSONObject) parser.parse(bfr);
			JSONExtract.extract(json);
		}//try
		catch(NullPointerException ne){
			System.out.println("JSON File is Empty");
		}
		catch(FileNotFoundException fne){
			System.out.println("Invalid File Path");
		}
		catch(Exception e){
			System.out.println("Internal Problem Try Again");
			e.printStackTrace();
		}
		finally{
			if(reader!=null || bfr!=null){
				try {
					reader.close();
					bfr.close();
				} 
				catch (IOException e) {
					e.printStackTrace();
				}
				
			}//if
		}//finally
		
	}//main()

}//Class
