package br.com.geradorrest;

import java.io.IOException;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ws.rs.ext.ContextResolver;

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.moxy.json.MoxyJsonConfig;
import org.glassfish.jersey.server.ResourceConfig;

/**
 * Main class.
 *
 */
public class Main {
    public static final String BASE_URI = "http://localhost:3000/gerador-rest/";

    public static HttpServer startServer() {
    	System.out.println("Gerador REST - Iniciando ...");
        return GrizzlyHttpServerFactory.createHttpServer(URI.create(BASE_URI), createApp());
    }

    /**
     * Metodo Main.
     * @param args
     */
    public static void main(String[] args) {
        
    	try{

    		final HttpServer server = startServer();
	        System.out.println(String.format("applicação Gerador-REST está rodando. Acesse  ", BASE_URI));
	        System.in.read();
	        server.shutdown();
    	
    	}catch(IOException e){
    		
    		Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, e);
    	}
    }

    public static ResourceConfig createApp() {
        return new ResourceConfig().
                packages("br.com.geradorrest.recursojson").
                register(createMoxyJsonResolver());
    }
    
    public static ContextResolver<MoxyJsonConfig> createMoxyJsonResolver() {
        final MoxyJsonConfig moxyJsonConfig = new MoxyJsonConfig();
        Map<String, String> namespacePrefixMapper = new HashMap<String, String>(1);
        namespacePrefixMapper.put("http://www.w3.org/2001/XMLSchema-instance", "xsi");
        moxyJsonConfig.setNamespacePrefixMapper(namespacePrefixMapper).setNamespaceSeparator(':');
        
        return moxyJsonConfig.resolver();
    }
    
       
}

