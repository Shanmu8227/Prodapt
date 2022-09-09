package miniprojects;

import java.util.Scanner;
import java.sql.*;

public class book{
	public Connection getconn()
	{
	Connection con = null;
	try
	{
	String url= "jdbc:mysql://localhost:3306/prodapt";
	String username="root";
	String pass="root";
	con = (Connection) DriverManager.getConnection(url,username,pass);
	}
	catch(Exception e)
	{
	e.printStackTrace();
	}
	return con;
	}


	Scanner sc1 = new Scanner(System.in);



	public void car_washing() throws SQLException {
			System.out.println("***Please enter User details***");
			 Connection con = getconn();
			 String s1 = "insert into car_washing(name,address,bdate) values(?,?,?)";
			 PreparedStatement stmt = ((java.sql.Connection) con).prepareStatement(s1);

			             System.out.println("Enter User Name:");
			             String name =sc1.nextLine();
			             System.out.println("Enter User address:");
			             String address =sc1.nextLine();
			             System.out.println("Enter User date");
			             String soc = sc1.nextLine();
			            
			       stmt.setString(1,name);
			       stmt.setString(2,address);
			       stmt.setString(3,soc);
			       int a = stmt.executeUpdate();
			       System.out.println("***Slot booked***");
			       
		
	}

	public void electrician() throws SQLException {
		System.out.println("***Please enter your details***");
		 Connection con = getconn();
		 String s1 = "insert into electrician (name,address,bdate) values(?,?,?)";
		 PreparedStatement stmt = ((java.sql.Connection) con).prepareStatement(s1);

		             System.out.println("Enter ur Name:");
		             String name =sc1.nextLine();
		             System.out.println("Enter ur address:");
		             String address =sc1.nextLine();
		             System.out.println("Enter ur date");
		             String soc = sc1.nextLine();
		            
		       stmt.setString(1,name);
		       stmt.setString(2,address);
		       stmt.setString(3,soc);
		       int a = stmt.executeUpdate();
		       System.out.println("***Slot booked***");
		
	}

	public void Tv_repair() throws SQLException {
			System.out.println("***Please enter your details***");
			 Connection con = getconn();
			 String s1 = "insert into Tv_repair (name,address,bdate) values(?,?,?)";
			 PreparedStatement stmt = con.prepareStatement(s1);

			             System.out.println("Enter user Name:");
			             String name =sc1.nextLine();
			             System.out.println("Enter user address:");
			             String address =sc1.nextLine();
			             System.out.println("Enter user date");
			             String soc = sc1.nextLine();
			            
			       stmt.setString(1,name);
			       stmt.setString(2,address);
			       stmt.setString(3,soc);
			       int a = stmt.executeUpdate();
			       System.out.println("***Slot booked***");
			
		}
		
	}

