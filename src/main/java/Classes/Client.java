/**
 * 
 */
package Classes;

import java.util.Scanner;
import java.sql.*;

/**
 * @author amina
 *
 */
public class Client {
	
	int accountIn; 
	int age;
	
	//JDBC driver name and database URL

	static String JDBC_DRIVER = "org.postgresql.Driver";
	static String DB_URL = "jdbc:postgresql://localhost/bankdb";

	//Database credentials
	static String USER = "postgres";
	static String PASS = "20December2012";
	
        public static void SetNamePassBalance(){try {
			//NameSet()
			
				String fname;
				String lname;
				String password;
				
			// Methods to set username.
			
				// Creating a db connection instance.
				Connection conn = null;
				Statement stmt = null;
			
				
				Scanner scan = new Scanner(System.in);
			
				System.out.println("Please note \r\n  *To create an account with\r\n a minimum of $500 must be deposited.");
				System.out.println("  *Applicants age is not less than 21.\r\n");
				System.out.println("Please enter you first name:");
				fname = scan.nextLine(); 
				System.out.println("Please enter you last name:");
				lname = scan.nextLine();
				System.out.println("Please write your password:");
				String passwordx = scan.nextLine();
				System.out.println("Please enter balance:");
				String balance = scan.nextLine();
				
				// Calling the constructor and inserting  first and last name.
				
				try {
					conn = DriverManager.getConnection(DB_URL, USER, PASS);
				
					stmt = conn.createStatement();
					String sql1 = "INSERT INTO client (lastname, firstname, password, balance) VALUES ('"+lname+"','"+fname+"','"+passwordx+"','"+balance+"')";
					stmt.executeUpdate(sql1);
					String sql2 = "Select * FROM client";
					System.out.println(sql2);
				
				}
				catch (Exception e) {
					
			// TODO Auto-generated catch block
			e.printStackTrace();		
        }
				
        }finally {System.out.println("complete");}
        }

		
    public static void Login() {
    	
    	Scanner scan = new Scanner(System.in);
    	
    	System.out.println("Enter first name:");
    	String fname = scan.nextLine();
    	
    	System.out.println("Enter password:");
    	String pass = scan.nextLine();
    	
    		Connection conn = null;
    		Statement stmt = null;
    		
    	try {
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
		
			stmt = conn.createStatement();
			String sql1 = "SELECT balance FROM client WHERE firstname = '"+fname+"' AND password = '"+pass+"'";
			stmt.executeQuery(sql1);
			 
			ResultSet rs = stmt.getResultSet();
			
			while(rs.next()) {
			System.out.println("Your available balance is:");
			System.out.println( rs.getInt(1) );
			System.out.println("What would you want to do next:");
			System.out.println("1. Deposit.");
			System.out.println("2. Withrdaw.");
			int ch= scan.nextInt();
			
			}
			System.out.println("How much would you like to deposit?");
	    	int d = scan.nextInt();    //}finally {System.out.println("Done");}
		
		}
		catch (Exception e) {
			
	// TODO Auto-generated catch block
	e.printStackTrace();
		}finally {System.out.println("Complete");}
	    	
		
		//Query to retrieve and Check.
/*	}
    }
    
    
    	
    
    	
    	
		
		}
		catch (Exception e) {
			
	// TODO Auto-generated catch block
	e.printStackTrace();*/
    	
    	scan.close();
		
	}
    public static void Withrdaw() {
		
	}
    public static void Transfere() {
		
	}
    public static void Receive() {
		
	} 
    }
    
    

