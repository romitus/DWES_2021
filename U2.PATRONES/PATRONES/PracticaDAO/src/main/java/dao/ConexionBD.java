package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

	// Propiedades
	private static Connection conn = null;
	
	// Constructor
	private ConexionBD() {

		String url = "jdbc:mysql://localhost:3306/classicmodels";
		String driver = "org.mariadb.jdbc.Driver";
		String usuario = "root";
		String password = "secret";

		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, usuario, password);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	} // Fin constructor

	// Métodos
	public static Connection getConnection() {

		if (conn == null) {
			new ConexionBD();
		}

		return conn;
	} // Fin getConnection
}
