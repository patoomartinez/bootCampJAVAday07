package com.bootcamp.martinez.patricio.BootCampJavaDay07.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionJDBCs {
	static String login = "root";
	static String password = "38914551";
	static String url = "jdbc:mysql://localhost:3306/bootCampJava";

	static Connection connection = null;

	private ConexionJDBCs() {

	}

	public static Connection getConnection() {
		if (connection == null) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				connection = DriverManager.getConnection(url, login, password);
				if (connection != null) {
					System.out.println("Conexión OK");
				}
			} catch (ClassNotFoundException | SQLException e) {
				System.out.println(e);
			}
		}
		return connection;
	}

	public static void desconectar() {
		try {
			connection.close();
		} catch (SQLException ex) {
			System.out.println(ex);
		}
		connection = null;
	}

}
