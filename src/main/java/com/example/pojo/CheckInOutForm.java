package com.example.pojo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 出入店登记表
 * Created by Crystal on 2017/2/10.
 */
@Entity(name = "checkInOutForm")
public class CheckInOutForm implements Serializable{

    private long fid;
    /**
     * 姓名
     */
    private String name;
    /**
     * 是否是会员
     */
    private boolean isVip;
    /**
     * 会员卡号 7位
     */
    private String vipNumber;
    /**
     * 入住时间
     */
    private Date checkInTime;
    /**
     * 离开时间
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
    /**
     * 是否已离店
     */
    private boolean isLeft;

    public CheckInOutForm() {
    }

    public CheckInOutForm(long fid, String name, boolean isVip, String vipNumber,
                          Date checkInTime, Date checkOutTime, String hostelNumber, int roomNo, boolean isLeft) {
        this.fid = fid;
        this.name = name;
        this.isVip = isVip;
        this.vipNumber = vipNumber;
        this.checkInTime = checkInTime;
        this.checkOutTime = checkOutTime;
        this.hostelNumber = hostelNumber;
        this.roomNo = roomNo;
        this.isLeft = isLeft;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fid")
    public long getFid() {
        return fid;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    @Column(name = "isVip")
    public boolean isVip() {
        return isVip;
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

    @Column(name = "isLeft")
    public boolean isLeft() {
        return isLeft;
    }

    public void setFid(long fid) {
        this.fid = fid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVip(boolean vip) {
        isVip = vip;
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

    public void setLeft(boolean left) {
        isLeft = left;
    }
}
