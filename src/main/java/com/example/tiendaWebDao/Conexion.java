package com.example.tiendaWebDao;
import java.sql.*;

public class Conexion {
	static String bd = "ecommerce";
	static String user = "edwinporras";
	static String pass = "tve0enjhutqa";
	static String url = "jdbc:mysql://localhost:8889/"+bd;
	
	Connection connection=null;
	
	public Conexion(){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url,user,pass);
		} catch (Exception e) {
			System.out.print("ERROR CONEXION "+ e);
		}
	}
	
	public Connection getConnection() {
		return connection;
	}
	
	public void desconectar() {
		connection=null;
	}
}
