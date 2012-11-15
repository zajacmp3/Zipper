package com.zajacmp3.zipper;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.zajacmp3.mysqlconnector.Mysqlconnector;

public class Filehandler {

	/**
	 * @param args
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		if(args.length < 3){
			System.out.println("To few arguments... Why I am writing this in english?");
		}
		else{
			if(args[2].equalsIgnoreCase("zip")){
				try {
					Zipper.zipper(args);
				} catch (IOException e) {
					System.out.println("Error sending data to zipper");
					e.printStackTrace();
				}
			}
			else if(args[2].equalsIgnoreCase("unzip")){
				Unzipper unzipper = new Unzipper();
				try {
					unzipper.unzip(args);
				} catch (IOException e) {
					System.out.println("Error sending data to unzipper");
					e.printStackTrace();
				}
			}
			else{
				System.out.println("Unknown option is wrong - use 'zip' or 'unzip'");
			}
		}
		Mysqlconnector mysql = new Mysqlconnector();
		String url = "jdbc:sqlite:D:\\testdb.db";
		String usr = "mzajac2";
		String pass = "206366";
		String cmd = "select * from dziennikarz";
		ResultSet resultset = mysql.mysqlconnector(url, usr, pass, cmd);
	}

}