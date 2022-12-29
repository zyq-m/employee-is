/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.callback.employeeis.components;

import java.sql.SQLException;
import java.sql.ResultSet;

/**
 *
 * @author HAZIQ
 */
public class Department extends Server {
  private String name;
  private int code;

  public Department() {
    super();
  }
  
  public void setName(String name) {
    name = name;
  }
  
  public String getName() {
    return name;
  }
  
  public void setCode(int code) {
    code = code;
  }
  
  public int getCode() {
    return code;
  }
  
  public void addDepartment(String name) throws SQLException {
    setStatement("INSERT INTO department(departName) VALUES(?)");
    getStatement().setString(1, name);
    
//    getStatement().executeUpdate();
  }
  
  public void updateDepartment(String name, int code) throws SQLException {
    setStatement("UPDATE department SET departName = ? WHERE "
            + "departCode = ?");
    getStatement().setString(1, name);
    getStatement().setInt(2, code);
    
    getStatement().executeUpdate();
  }
  
  public String getDepartmentName(int code) throws SQLException {
    setStatement("SELECT * FROM department WHERE departCode = ?");
    getStatement().setInt(1, code);
    
    ResultSet result = getQueryResult();
    
    if (result.next()) {
      return result.getString(1);
    }
    
    return null;
  }
}
