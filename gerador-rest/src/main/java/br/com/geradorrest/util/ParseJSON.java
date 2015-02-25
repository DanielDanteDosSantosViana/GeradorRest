package br.com.geradorrest.util;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

import org.codehaus.jackson.JsonFactory;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.MappingJsonFactory;
import org.codehaus.jackson.map.ObjectMapper;

public class ParseJSON {

	public static String toJson(Object objeto) {
	     
		try{
	    	  
	    	  ObjectMapper mapper = new ObjectMapper();
	    	  StringWriter jsonValue = new StringWriter();
	    	  mapper.writeValue(new PrintWriter(jsonValue), objeto);
	    	  return jsonValue.toString();
	   
	      } catch (JsonGenerationException e) {
 
	    	  e.printStackTrace();
	    	  System.exit(1);
	      } catch (JsonMappingException e) {
 
	    	  e.printStackTrace();
	    	  System.exit(1);
	      } catch (IOException e) {
 
	    	  e.printStackTrace();
	    	  System.exit(1);
	      }
	    	  
		return null;
	 }


	   public static Object fromJson(String json, Class objectClass) throws Exception {
	      JsonFactory f = new MappingJsonFactory();
	      JsonParser jp = f.createJsonParser(json);
	      Object obj = jp.readValueAs(objectClass);
	      return obj;
	   }
	   
	   
}
