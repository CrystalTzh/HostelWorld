package com.example.pojo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 预订记录pojo
 * Created by Crystal on 2017/2/10.
 */
@Entity(name = "reserveRecord")
public class ReserveRecord implements Serializable {

    private long reserveId;
    /**
     * 姓名
     */
    private String name;
    /**
     * 会员卡号
     */
    private String vipNumber;
    /**
     * 预订入住时间
     */
    private Date reserveInTime;
    /**
     *客栈识别码 7位
     */
    private String hostelNumber;
    /**
     * 房间号
     */
    private int roomNo;
    /**
     * 支付金额
     */
    private int price;

    public ReserveRecord() {
    }

    public ReserveRecord(long reserveId, String name, String vipNumber,
                         Date reserveInTime, String hostelNumber, int roomNo, int price) {
        this.reserveId = reserveId;
        this.name = name;
        this.vipNumber = vipNumber;
        this.reserveInTime = reserveInTime;
        this.hostelNumber = hostelNumber;
        this.roomNo = roomNo;
        this.price = price;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reserveId")
    public long getReserveId() {
        return reserveId;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    @Column(name = "vipNumber")
    public String getVipNumber() {
        return vipNumber;
    }

    @Column(name = "reserveInTime")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getReserveInTime() {
        return reserveInTime;
    }

    @Column(name = "hostelNumber")
    public String getHostelNumber() {
        return hostelNumber;
    }

    @Column(name = "roomNo")
    public int getRoomNo() {
        return roomNo;
    }

    @Column(name = "price")
    public int getPrice() {
        return price;
    }

    public void setReserveId(long reserveId) {
        this.reserveId = reserveId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVipNumber(String vipNumber) {
        this.vipNumber = vipNumber;
    }

    public void setReserveInTime(Date reserveInTime) {
        this.reserveInTime = reserveInTime;
    }

    public void setHostelNumber(String hostelNumber) {
        this.hostelNumber = hostelNumber;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
