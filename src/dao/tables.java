/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;

/**
 *
 * @author 91967
 */
public class tables {

    public static void main(String[] args) {
        try {
           
//            String userTable = "create table user(id int AUTO_INCREMENT primary key,name varchar(200),email varchar(200),mobileNumber varchar(10),address varchar(200),password varchar(200),securityQuestion varchar(200),answer varchar(200),status varchar(20),UNIQUE(email))";
           String userTable = "create table user(id int AUTO_INCREMENT primary key,name varchar(200),email varchar(200),mobileNumber varchar(10),address varchar(200),password varchar(200),securityQuestion varchar(200),answer varchar(200),status varchar(20),UNIQUE(email))";
          //  String adminDetails = "insert into user(name,email,mobileNumber,address,password,securityQuestion,answer,status) values('Admin','admin@gmail.com','1234567890','India',admin','Mango','ABC','true')";  //false original
          
          String adminDetails = "insert into user(name,email,mobileNumber,address,password,securityQuestion,answer,status) values('Admin','admin@gmail.com','9673969955','India',admin','fruit','ABC','true')";  //fals
            String categoryTable = "create table category(id int AUTO_iNCREMENT primary key,name varchar(200))";
            String productTable = "Create table Product (id int AUTO_INCREMENT primary key,name varchar(200),category varchar(200),price varchar(200))";
           String billTable = "create table bill(id int primary key,name varchar(200),mobileNumber varchar(200),email varchar(200),date varchar(50),total varchar(200),createdBy varchar(200))";
            
       //    DbOperations.setDataOrDelete(userTable, "user Tables creatred successfully");
            DbOperations.setDataOrDelete(userTable, "user Tables creatred successfully");
             DbOperations.setDataOrDelete(adminDetails, "Admin Details Added Succesfully");
            DbOperations.setDataOrDelete(categoryTable, " Category Table Created Succesfully");
            DbOperations.setDataOrDelete(productTable, " Product Table Created Succesfully");
           DbOperations.setDataOrDelete(billTable, " Bill Table Created Succesfully");

            

              
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
