/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.callback.employeeis.components;

import com.callback.employeeis.pages.AddDepartment;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
      System.out.println("test");
    } catch (SQLException ex) {
      // handle any errors
      System.out.println("SQLException: " + ex.getMessage());
      System.out.println("SQLState: " + ex.getSQLState());
      System.out.println("VendorError: " + ex.getErrorCode());
    }
  }
  
  public static void setStatement(String query) throws SQLException {
    pstmt = conn.prepareStatement(query);
  }
  
  public PreparedStatement getStatement() {
    return pstmt;
  }
  
  public ResultSet getQueryResult() throws SQLException {
    return pstmt.executeQuery();
  }
}
