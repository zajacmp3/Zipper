package com.zajacmp3.mysqlconnector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Sqliteconnector extends Dbdata{
	private Connection connection;

	public Sqliteconnector(String url, String password, String user, String cmd) throws ClassNotFoundException, SQLException{
		super(url,password,user);
		Dbdata data = new Dbdata(url,password,user);
		Class.forName("org.sqlite.JDBC");
		connection = DriverManager.getConnection(getUrl(), getUser(), getPassword());
		Statement stmt = connection.createStatement();
	}
	public Connection getConnection(Sqliteconnector object) throws ClassNotFoundException, SQLException {
		Class.forName("org.sqlite.JDBC");
		connection = DriverManager.getConnection(getUrl(), getUser(), getPassword());
		return connection;
	}
	public Statement getStatement(Sqliteconnector object) throws ClassNotFoundException, SQLException{
		Statement stmt = this.getConnection(object).createStatement();
		return stmt;
	}
	public Dbdata getDbdata(){
		Dbdata data = new Dbdata();
		return data;
	}
	
	
/*	public ResultSet mysqlconnector(String url, String usr, String pass, String cmd) throws ClassNotFoundException, SQLException{
		
		Statement stmt;
		
		//Rejestracja sterownika JDBC dla mysql
		Class.forName("org.sqlite.JDBC");
		//Rejestracja polaczenia na mocy ktorego wykonujemy pozniej komendy
		Connection con = DriverManager.getConnection(url, usr, pass);
		stmt = con.createStatement();
		
		return stmt.executeQuery(cmd);
		
	}*/

}
