package com.example.pojo;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 房间pojo
 * Created by Crystal on 2017/2/8.
 */
@Entity(name = "room")
public class Room implements Serializable{
    private long rid;
    private String hostelNumber;
    private int roomNo;
    private int roomType;
    private boolean isAvailable;

    public Room() {
    }

    public Room(long rid, String hostelNumber, int roomNo, int roomType, boolean isAvailable) {
        this.rid = rid;
        this.hostelNumber = hostelNumber;
        this.roomNo = roomNo;
        this.roomType = roomType;
        this.isAvailable = isAvailable;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rid")
    public long getRid() {
        return rid;
    }

    @Column(name = "hostelNumber")
    public String getHostelNumber() {
        return hostelNumber;
    }

    @Column(name = "roomNo")
    public int getRoomNo() {
        return roomNo;
    }

    @Column(name = "roomType")
    public int getRoomType() {
        return roomType;
    }

    @Column(name = "isAvailable")
    public boolean isAvailable() {
        return isAvailable;
    }

    public void setRid(long rid) {
        this.rid = rid;
    }

    public void setHostelNumber(String hostelNumber) {
        this.hostelNumber = hostelNumber;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    public void setRoomType(int roomType) {
        this.roomType = roomType;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
