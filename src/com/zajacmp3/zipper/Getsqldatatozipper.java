package com.zajacmp3.zipper;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.zajacmp3.mysqlconnector.Sqliteconnector;

public class Getsqldatatozipper {
	public void getSqldata() throws ClassNotFoundException, SQLException, IOException{
		String url = "jdbc:sqlite:D:\\testdb.db";
		String usr = "";
		String pass = "";
		String cmd = "select * from dziennikarz";
		Sqliteconnector sqlitecon = new Sqliteconnector(url, pass, usr, cmd);
		Statement stmt = sqlitecon.getStatement(sqlitecon);
		
		if(cmd.startsWith("select")){
			ResultSet result = stmt.executeQuery(cmd);
			int columnnumber = result.getMetaData().getColumnCount();
			File plik = new File("temp.txt");
			FileOutputStream fout = new FileOutputStream(plik);
			@SuppressWarnings("resource")
			BufferedOutputStream bout = new BufferedOutputStream(fout);
			while(result.next()){
				for(int temp = 1 ; temp<=columnnumber ; temp++){
					byte[] buffor = result.getString(temp).getBytes();
					bout.write(buffor);
					bout.write(32);					
				}
				bout.write(13);
			}
			String[] args = {plik.getAbsolutePath(),};
		}
		else{
			stmt.executeUpdate(cmd);
		}
	}
	
}
