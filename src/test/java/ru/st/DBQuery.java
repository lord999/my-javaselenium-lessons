package ru.st;

import java.sql.*;

public class DBQuery {

	public static String getMaxID() {
		
		  String DBUrl = "jdbc:mysql://localhost:3306/php4dvd";
		  String DBUser = "root";
		  String DBPassword = "";
		  String FilmID = "";
		
		  try{
			
		    Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(DBUrl, DBUser, DBPassword);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT MAX(id) FROM movies");
			while (rs.next()){
			FilmID = rs.getString(1);
			}
			
		  }
		  catch(SQLException ex){
			  System.err.println("SQL Exeption: " + ex.getMessage());
		  }
		  
		  catch(java.lang.ClassNotFoundException e){
			  System.err.print("Class Not Found Exeption: ");
			  System.err.println(e.getMessage());
		  }
		return FilmID;
	}
	
}