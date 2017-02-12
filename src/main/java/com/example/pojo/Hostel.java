package com.example.pojo;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 客栈pojo
 * Created by Crystal on 2017/2/8.
 */
@Entity(name = "hostel")
public class Hostel implements Serializable {
    /**
     *客栈名
     */
    private String name;
    /**
     *客栈识别码 7位
     */
    private String hostelNumber;
    /**
     *房间总数
     */
    private int roomNumber;
    /**
     *现有总资产
     */
    private long totalFund;

    public Hostel() {
    }

    public Hostel(String name, String hostelNumber, int roomNumber, long totalFund) {
        this.name = name;
        this.hostelNumber = hostelNumber;
        this.roomNumber = roomNumber;
        this.totalFund = totalFund;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "hostelnumber")
    public String getHostelNumber() {
        return hostelNumber;
    }

    @Column(name = "roomNumber")
    public int getRoomNumber() {
        return roomNumber;
    }

    @Column(name = "totalFund")
    public long getTotalFund() {
        return totalFund;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHostelNumber(String hostelNumber) {
        this.hostelNumber = hostelNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setTotalFund(long totalFund) {
        this.totalFund = totalFund;
    }
}
