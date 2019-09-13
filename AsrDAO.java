package com.miniproject;

import java.sql.Connection;

import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.Scanner;

public class AsrDAO {
    Connection con=DBUtility.establishConnection();
    Scanner scan=new Scanner(System.in);
    FlightInfo flightInfo=new FlightInfo();
    
    public void details(){
            String q1="select * from flight_info";
            try {
                PreparedStatement pstmt = con.prepareStatement(q1);
                ResultSet rs=pstmt.executeQuery();
                while(rs.next()){
                        flightInfo.setFlightNo(rs.getInt(1));
                        flightInfo.setDepart(rs.getString(2));
                        flightInfo.setUpto(rs.getString(3));
                        flightInfo.setDoj(rs.getDate(4));
                        flightInfo.setTravelTime(rs.getString(5));
                        flightInfo.setFare(rs.getDouble(6));
                        flightInfo.setSeatsAvailable(rs.getInt(7));
                    System.out.println("Flight No: "+flightInfo.getFlightNo()+" From: "+flightInfo.getDepart()+" Upto: "
                                       +flightInfo.getUpto()+" Date of Journey: "+flightInfo.getDoj()+" Travel Time: "+flightInfo.getTravelTime()
                                       +" Fare: "+flightInfo.getFare()+" No of Seats Available: "+flightInfo.getSeatsAvailable());
                    
                    }
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    
    public void add(){
     
        System.out.println("Enter flight No:");
        int a1=scan.nextInt();
        String q1="select * from flight_info where flightNo=?";
        try {
            PreparedStatement pstmt = con.prepareStatement(q1);
            pstmt.setInt(1, a1);
            ResultSet rs=pstmt.executeQuery();
            while(rs.next()){
                flightInfo.setFlightNo(rs.getInt(1));
                flightInfo.setDepart(rs.getString(2));
                flightInfo.setUpto(rs.getString(3));
                flightInfo.setDoj(rs.getDate(4));
                flightInfo.setTravelTime(rs.getString(5));
                flightInfo.setFare(rs.getDouble(6));
                flightInfo.setSeatsAvailable(rs.getInt(7));
                
                }
        } catch (SQLException e) {
            System.out.println(e);
        }

    }
}
