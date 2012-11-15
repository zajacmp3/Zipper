package com.zajacmp3.mysqlconnector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Mysqlconnector {
	
	public ResultSet mysqlconnector(String url, String usr, String pass, String cmd) throws ClassNotFoundException, SQLException{
		
		Statement stmt;
		
		//Rejestracja sterownika JDBC dla mysql
		Class.forName("org.sqlite.JDBC");
		//Rejestracja polaczenia na mocy ktorego wykonujemy pozniej komendy
		Connection con = DriverManager.getConnection(url, usr, pass);
		stmt = con.createStatement();
		
		return stmt.executeQuery(cmd);
		
	}

}
