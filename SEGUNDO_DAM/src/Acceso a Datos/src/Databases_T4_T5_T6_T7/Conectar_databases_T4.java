package Databases_T4_T5_T6_T7;

import java.sql.*;

public class Conectar_databases_T4 {
	public static void main(String[] args) {
	
		String OrigenDatabase = "jdbc:mysql://localhost:3306/accesodatos";
		String usuario = "root";
		String contraseña = "admin";
	
	try {
		Connection miConexion = DriverManager.getConnection(OrigenDatabase, usuario, contraseña);
		String mensaje = "Se ha efectuado la conexion de la base de datos";
		System.out.println(mensaje);
		Statement ObjtState = miConexion.createStatement();
		ResultSet resultado = ObjtState.executeQuery("select* from datos_personales");
		while(resultado.next()) {
			System.out.println(resultado.getString("ID_DATOS_PERSONALES") + " " + resultado.getString("NOMBRE"));
		}
		
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}


