package br.com.geradorrest.protocolo;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import java.util.Set;

import br.com.geradorrest.util.ParseJSON;

public class ProtocoloDeComunicacao {
	
public static Object httpGet(Class tipoObjetoRetorno, String urlWebService, Map<String, String> paramentrosDeBusca){
	
		Object objetoRetorno = null;
					
		  try {
			  	
			   if(paramentrosDeBusca!=null && !paramentrosDeBusca.isEmpty()){
				   Set<String> keys = paramentrosDeBusca.keySet();
				   for (String chave : keys) {
					  if(urlWebService.contains(chave)){
						urlWebService = urlWebService.replace(chave,paramentrosDeBusca.get(chave)); 
					  }
				   }
			  	 }
				  
			   URL url = new URL(urlWebService);
			   HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			   connection.setRequestMethod("GET");
			   connection.setConnectTimeout(15000);
			   connection.connect();
	
			   String responseJson = inputStreamToString(connection.getInputStream());
			   connection.disconnect();
				  
				  
			   return ParseJSON.fromJson(responseJson, tipoObjetoRetorno);
	
			   } catch (Exception e) {
			       e.printStackTrace();
		       }	
			     
		   		return objetoRetorno;
			
			}
	
	 public static Object httpPost(Object objetoEnvio, Class tipoObjetoRetorno, String urlWebService) {
	      Object objetoRetorno = null;
		
	      try {
	         String requestJson = ParseJSON.toJson(objetoEnvio);
			
	         URL url = new URL(urlWebService);
	         HttpURLConnection connection = (HttpURLConnection) url.openConnection();
	         connection.setRequestMethod("POST");
	         connection.setDoOutput(true);
	         connection.setUseCaches(false);
		     connection.setConnectTimeout(15000);
	         connection.setRequestProperty("Content-Type", "application/json");
	         connection.setRequestProperty("Accept", "application/json");
	         connection.setRequestProperty("Content-Length", Integer.toString(requestJson.length()));
				
	         DataOutputStream stream = new DataOutputStream(connection.getOutputStream());
	         stream.write(requestJson.getBytes("UTF-8"));
	         stream.flush();
	         stream.close();
	         connection.connect();

	         String responseJson = inputStreamToString(connection.getInputStream());
	         connection.disconnect();
	         objetoRetorno = ParseJSON.fromJson(responseJson, tipoObjetoRetorno);

	      } catch (Exception e) {
	         e.printStackTrace();
	      }
	      return objetoRetorno;
	   }
	
	public static String inputStreamToString(InputStream is) throws IOException {
		if (is != null) {
			Writer writer = new StringWriter();

			char[] buffer = new char[1024];
			try {
				Reader reader = new BufferedReader(new InputStreamReader(is,"UTF-8"));
				int n;
				while ((n = reader.read(buffer)) != -1) {
					writer.write(buffer, 0, n);
				}
			} finally {
				is.close();
			}
			return writer.toString();
		} else {
			return "";
		}
    }
	


}
