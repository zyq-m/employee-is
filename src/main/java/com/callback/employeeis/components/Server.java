/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.callback.employeeis.components;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HAZIQ
 */
public class Server {
  private static Connection conn;
  private static PreparedStatement pstmt;

  public Server() {
    try {
      conn =
         DriverManager.getConnection("jdbc:mysql://localhost/employee_is?" +
                                     "user=root&password=");
    } catch (SQLException ex) {
      // handle any errors
      System.out.println("SQLException: " + ex.getMessage());
      System.out.println("SQLState: " + ex.getSQLState());
      System.out.println("VendorError: " + ex.getErrorCode());
    } finally {
      try {
        conn.close();
      } catch (SQLException ex) {
        Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
  }
  
  public static void setStatement(String query) throws SQLException {
    pstmt = conn.prepareStatement(query);
  }
  
  public PreparedStatement getStatement() {
    return pstmt;
  }
  
  /**
   *
   * @return
   * @throws SQLException
   */
  public static ResultSet getQueryResult() throws SQLException {
    return pstmt.executeQuery();
  }
}
