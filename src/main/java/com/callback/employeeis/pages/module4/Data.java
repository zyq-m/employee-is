/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.callback.employeeis.pages.module4;

/**
 *
 * @author Admin
 */
class Data {
    
    private String DepartmentName,DepartmentCode;
    
    public Data (String DepartmentName,String DepartmentCode)
    {
        this.DepartmentName=DepartmentName;
        this.DepartmentCode=DepartmentCode;
    }
    
    public String getName(){
        return DepartmentName;
    }
    
    public String getCode(){
        return DepartmentCode;
    }
}
