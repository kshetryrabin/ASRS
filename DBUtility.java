package com.miniproject;

import java.sql.Connection;
import java.sql.DriverManager;
//add derbyclient.jar in this project for making successful connection
//with the derby databse
public class DBUtility {
    public static Connection establishConnection(){
        Connection con=null;
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            String url="jdbc:derby://localhost:1527/javadb";
            String un="admin";
            String pw="admin";
             con= DriverManager.getConnection(url,un,pw);
        }catch(Exception e){
            System.out.println(e);
            }
        return con;
        }
    }

