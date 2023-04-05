package demo.json2;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Set;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.networknt.schema.JsonSchema;
import com.networknt.schema.JsonSchemaFactory;
import com.networknt.schema.SpecVersion;
import com.networknt.schema.ValidationMessage;

public class JSONSchemaValidation1 {
	  private static final String JSONPATH="target/Product.json";
	  private static final String SCHEMAPATH="target/Product-Schema.json";
	 
	  private static InputStream getInputStreamFromClasspath( String path ) throws Exception {  
	       return new FileInputStream(new File(path)); 
	       //return Thread.currentThread().getContextClassLoader().getResourceAsStream(path); 
	    }  
	public static void main(String[] args) {
		
		 try{
			
			ObjectMapper mapper = new ObjectMapper();
			JsonNode jsonNode = mapper.readTree(getInputStreamFromClasspath(JSONPATH ));
			JsonSchemaFactory schemaFactory = JsonSchemaFactory.getInstance(SpecVersion.VersionFlag.V7);  
			JsonSchema schema = schemaFactory.getSchema(getInputStreamFromClasspath(SCHEMAPATH));
			
			Set<ValidationMessage> validationMessage = schema.validate(jsonNode);
			Iterator<ValidationMessage> msg = validationMessage.iterator();
			if(msg.hasNext()==false) {
				System.out.println("Json Is Valid acording to Schema...");
				
			}
			while(msg.hasNext()){
				System.out.println(msg.next().getMessage());
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
