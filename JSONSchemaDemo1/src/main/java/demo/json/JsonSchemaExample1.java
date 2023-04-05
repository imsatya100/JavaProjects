package demo.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.jsonSchema.JsonSchema;
import com.fasterxml.jackson.module.jsonSchema.JsonSchemaGenerator;

public class JsonSchemaExample1 {

	public static void main(String[] args) throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		JsonSchema schema = new JsonSchemaGenerator(mapper).generateSchema(Person.class);
		String schemaString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(schema);
		System.out.println(schemaString);
	}

}
