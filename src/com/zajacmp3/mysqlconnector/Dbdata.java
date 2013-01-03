package com.zajacmp3.mysqlconnector;

public class Dbdata {
	private String url;
	private String password;
	private String user;
	
	Dbdata(Dbdata data){
		url = data.url;
		password = data.password;
		user = data.user;
	}
	Dbdata(){
		url = null;
		password = null;
		user = null;
	}
	public Dbdata(String newurl, String newpassword, String newuser) {
		url = newurl;
		password = newpassword;
		user = newuser;
	}
	public void setData(String newurl){
		url = newurl;
	}
	public void setData(String newurl, String newpassword){
		url = newurl;
		password = newpassword;
	}
	public void setData(String newurl, String newpassword, String newuser){
		url = newurl;
		password = newpassword;
		user = newuser;
	}
	public String getUrl(){
		return url;
	}
	public String getPassword(){
		return password;
	}
	public String getUser(){
		return user;
	}
}
