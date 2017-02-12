package com.example.pojo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Crystal on 2017/2/10.
 */
@Entity(name = "checkInRecord")
public class CheckInRecord implements Serializable {

    private long checkInId;
    /**
     * 姓名
     */
    private String name;
    /**
     * 会员卡号
     */
    private String vipNumber;
    /**
     * 实际入住时间
     */
    private Date checkInTime;
    /**
     * 实际离开时间
     */
    private Date checkOutTime;
    /**
     *客栈识别码 7位
     */
    private String hostelNumber;
    /**
     * 房间号
     */
    private int roomNo;

    public CheckInRecord() {
    }

    public CheckInRecord(long checkInId, String name, String vipNumber,
                         Date checkInTime, Date checkOutTime, String hostelNumber, int roomNo) {
        this.checkInId = checkInId;
        this.name = name;
        this.vipNumber = vipNumber;
        this.checkInTime = checkInTime;
        this.checkOutTime = checkOutTime;
        this.hostelNumber = hostelNumber;
        this.roomNo = roomNo;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "checkInId")
    public long getCheckInId() {
        return checkInId;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    @Column(name = "vipNumber")
    public String getVipNumber() {
        return vipNumber;
    }

    @Column(name = "checkInTime")
    public Date getCheckInTime() {
        return checkInTime;
    }

    @Column(name = "checkOutTime")
    public Date getCheckOutTime() {
        return checkOutTime;
    }

    @Column(name = "hostelNumber")
    public String getHostelNumber() {
        return hostelNumber;
    }

    @Column(name = "roomNo")
    public int getRoomNo() {
        return roomNo;
    }

    public void setCheckInId(long checkInId) {
        this.checkInId = checkInId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVipNumber(String vipNumber) {
        this.vipNumber = vipNumber;
    }

    public void setCheckInTime(Date checkInTime) {
        this.checkInTime = checkInTime;
    }

    public void setCheckOutTime(Date checkOutTime) {
        this.checkOutTime = checkOutTime;
    }

    public void setHostelNumber(String hostelNumber) {
        this.hostelNumber = hostelNumber;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }
}
