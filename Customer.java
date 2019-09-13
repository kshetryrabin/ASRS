package com.miniproject;

import java.sql.Time;

import java.util.Date;

public class Customer {
    private int bookingId;
    private String customerName;
    private String phoneNumber;
    private String departPlace;
    private String arrivalPlace;
    private Date bookingDate;
    private Date departDate;
    private Time departTime;
    private int noOfSeats;

// getters and setters
    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setDepartPlace(String departPlace) {
        this.departPlace = departPlace;
    }

    public String getDepartPlace() {
        return departPlace;
    }

    public void setArrivalPlace(String arrivalPlace) {
        this.arrivalPlace = arrivalPlace;
    }

    public String getArrivalPlace() {
        return arrivalPlace;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setDepartDate(Date departDate) {
        this.departDate = departDate;
    }

    public Date getDepartDate() {
        return departDate;
    }

    public void setDepartTime(Time departTime) {
        this.departTime = departTime;
    }

    public Time getDepartTime() {
        return departTime;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

//constructor

    public Customer(int bookingId, String customerName, String phoneNumber, String departPlace, String arrivalPlace,
                    Date bookingDate, Date departDate, Time departTime, int noOfSeats) {
        this.bookingId = bookingId;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.departPlace = departPlace;
        this.arrivalPlace = arrivalPlace;
        this.bookingDate = bookingDate;
        this.departDate = departDate;
        this.departTime = departTime;
        this.noOfSeats = noOfSeats;
    }

}
