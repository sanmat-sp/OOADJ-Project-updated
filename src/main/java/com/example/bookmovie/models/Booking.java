package com.example.bookmovie.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.mapping.List;

@Entity
@Table(name="Booking")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bookingId;
    @Column(name="showId")
    private Integer showId;
    @Column(name="date")
    private Date date;
    @Column(name="colNo")
    private String colNo;
    @Column(name="seatNo")
    private Integer seatNo;
    @Column(name="price")
    private Double price;
    @Column(name="userEmail")
    private String userEmail;
    
    public Booking() {
    }

    public Booking(Integer bookingId, Integer showId, Date date, String colNo, Integer seatNo, Double price,
            String userEmail) {
        this.bookingId = bookingId;
        this.showId = showId;
        this.date = date;
        this.colNo = colNo;
        this.seatNo = seatNo;
        this.price = price;
        this.userEmail = userEmail;
    }

    public Integer getBookingId() {
        return bookingId;
    }

    public void setBookingId(Integer bookingId) {
        this.bookingId = bookingId;
    }

    public Integer getShowId() {
        return showId;
    }

    public void setShowId(Integer showId) {
        this.showId = showId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getColNo() {
        return colNo;
    }

    public void setColNo(String colNo) {
        this.colNo = colNo;
    }

    public Integer getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(Integer seatNo) {
        this.seatNo = seatNo;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    
    
}
