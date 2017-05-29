import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.ws.rs.*;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;



@Path("social")
public class socialnw {
	@Path("user")
	@GET
	@Produces("text/plain")
	public String user(){
	
	
		    FileReader fr = null;
			try {
				fr = new FileReader("src/User.txt");
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		    BufferedReader br = new BufferedReader(fr);

		    String zeile1 = null;
			try {
				zeile1 = br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    System.out.println(zeile1);
		     try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		     return zeile1;
	}
		
	@Path("message")
	@GET
	@Produces("text/plain")
	public String message(){
		   FileReader fr = null;
					try {
						fr = new FileReader("src/Message.txt");
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				    BufferedReader br = new BufferedReader(fr);

				    String zeile1 = null;
					try {
						zeile1 = br.readLine();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(zeile1);
					 try {
							br.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					     return zeile1;
					 }
	
	@Path("status")
	@GET
	@Produces("text/plain")
	public String status(){
		   FileReader fr = null;
			try {
				fr = new FileReader("src/Status.txt");
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		    BufferedReader br = new BufferedReader(fr);

		    String zeile1 = null;
			try {
				zeile1 = br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(zeile1);
			 try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			     return zeile1;
	}

}
