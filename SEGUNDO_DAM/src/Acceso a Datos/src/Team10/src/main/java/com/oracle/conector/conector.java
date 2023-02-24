package com.oracle.conector;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class conector {

   private Connection connection;

   // Establece la conexion
   public void establishConnection() throws SQLException {
      try {
         Class.forName("oracle.jdbc.driver.OracleDriver");
         String url = "jdbc:oracle:thin:localhost:3306:biblioteca_manga";
         String username = "root";
         String password = "admin";

         connection = DriverManager.getConnection(url, username, password);
      } catch (ClassNotFoundException e) {
         throw new SQLException("No se puede encontrar el controlador Oracle JDBC.");
      }
   }

   // cierra la conexion
   public void closeConnection() throws SQLException {
      if (connection != null) {
         connection.close();
      }
   }

   // ejecuta sentencias en la base de datos
   public ResultSet executeQuery(String query) throws SQLException {
      Statement statement = connection.createStatement();
      return statement.executeQuery(query);
   }

   public int executeUpdate(String update) throws SQLException {
      Statement statement = connection.createStatement();
      return statement.executeUpdate(update);
   }
   
// elimima elementos de la bbdd
   public int deleteData(String deleteQuery) throws SQLException {
      return executeUpdate(deleteQuery);
   }
   
   // hace un select
   public ResultSet selectData(String selectQuery) throws SQLException {
      return executeQuery(selectQuery);
   }
   
   // hace un insert
   public int insertData(String insertQuery) throws SQLException {
      return executeUpdate(insertQuery);
   }
   
   
}