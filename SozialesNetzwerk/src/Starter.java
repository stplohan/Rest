import java.net.URI;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.ws.rs.core.UriBuilder;

import org.glassfish.jersey.jdkhttp.JdkHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import com.sun.net.httpserver.HttpServer;

public class Starter {

	private final static int port = 123;
	private final static String host="http://localhost/";
	
	
	
	public static void main(String[] args) {
		URI baseUri = UriBuilder.fromUri(host).port(port).build();
		ResourceConfig config = new ResourceConfig(socialnw.class);
		HttpServer server = JdkHttpServerFactory.createHttpServer(baseUri, config);
	}
	
	

}
