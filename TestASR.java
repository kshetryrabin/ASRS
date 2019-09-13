package com.miniproject;

import java.sql.Connection;

import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.Scanner;

public class TestASR {
    public static void main(String[] args) {
        AsrDAO dao=new AsrDAO();
        Connection con=DBUtility.establishConnection();
        int sid=0;
        
        System.out.println("*****WELCOME TO DIVYAM AIRLINES*****");
        System.out.println("Enter your choice: ");
        System.out.println("1: Management Team  2: Customer");
        Scanner scan =new Scanner(System.in);
        int c1=scan.nextInt();
        if(c1==1){
          //  System.out.println("...Management Portal Welcomes You...");
            System.out.println("Enter Username: ");
            String uname=scan.next();
            System.out.println("Enter Password: ");
            String pass=scan.next();
            if((uname=="shubham") & (pass=="rabin")){
                System.out.println("....Welcome to the Management Portal....");
                

                System.out.println("Enter your Choice:");
                System.out.println("1: Add  2: Delete  3: Modify");
                int c2=scan.nextInt();
                if(c2==1){
                    dao.add();
                }
                    else if(c2==2){
                    //dao.delete();
                    }
                else if (c2==3){
                   // dao.modify();
                    }
                else
                System.err.println("Invalid Choice!!!!");
                }
                
                
            }
        else if(c1==2){
            System.out.println("....Welcome To Customer's Portal....");
            System.out.println("Enter your choice:");
            System.out.println("1: Search  2: Cancel  3: Reshedule");
            int c3=scan.nextInt();
            if(c3==1){
                }
            else if(c3==2){
                }
            else if(c3==3){
                }
            else
            System.out.println("Invalid Choice!!!!");
            }
        else
        System.err.println("Sorry!! Please choose properly!!!");
        //System.exit(1);
        
        
        
    
   }
}
