package ru.st;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.*;
import org.testng.annotations.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import java.sql.*;

import javax.sql.*;

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