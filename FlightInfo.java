package com.miniproject;

import java.util.Date;

public class FlightInfo {
    private int flightNo;
    private String depart;
    private String upto;
    private Date doj;
    private String travelTime;
    private Double fare;
    private int seatsAvailable;

    public void setFlightNo(int flightNo) {
        this.flightNo = flightNo;
    }

    public int getFlightNo() {
        return flightNo;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public String getDepart() {
        return depart;
    }

    public void setUpto(String upto) {
        this.upto = upto;
    }

    public String getUpto() {
        return upto;
    }

    public void setDoj(Date doj) {
        this.doj = doj;
    }

    public Date getDoj() {
        return doj;
    }

    public void setTravelTime(String travelTime) {
        this.travelTime = travelTime;
    }

    public String getTravelTime() {
        return travelTime;
    }

    public void setFare(Double fare) {
        this.fare = fare;
    }

    public Double getFare() {
        return fare;
    }

    public void setSeatsAvailable(int seatsAvailable) {
        this.seatsAvailable = seatsAvailable;
    }

    public int getSeatsAvailable() {
        return seatsAvailable;
    }

    public FlightInfo(int flightNo, String depart, String upto, Date doj, String travelTime, Double fare,
                      int seatsAvailable) {
        this.flightNo = flightNo;
        this.depart = depart;
        this.upto = upto;
        this.doj = doj;
        this.travelTime = travelTime;
        this.fare = fare;
        this.seatsAvailable = seatsAvailable;
    }
    public FlightInfo(){
        }
}
