package com.example.pojo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 发布计划pojo
 * Created by Crystal on 2017/2/9.
 */
@Entity(name = "plan")
public class Plan implements Serializable{

    /**
     * id 主键
     */
    private long pid;
    /**
     * 每天开始营业的时间 hh:mm:ss
     */
    private Date dayStartTime;
    /**
     * 每天结束营业的时间
     */
    private Date dayEndTime;
    /**
     * 单人间的价格 一晚
     */
    private int price_one;
    /**
     * 双人间的价格
     */
    private int price_two;
    /**
     * 三人间的价格
     */
    private int price_three;
    /**
     * 单人间剩余数量
     */
    private int roomLeft_one;
    /**
     * 双人间剩余数量
     */
    private int roomLeft_two;
    /**
     * 三人间剩余数量
     */
    private int roomLeft_Three;

    public Plan() {
    }

    public Plan(long pid, Date dayStartTime, Date dayEndTime, int price_one, int price_two, int price_three,
                int roomLeft_one, int roomLeft_two, int roomLeft_Three) {
        this.pid = pid;
        this.dayStartTime = dayStartTime;
        this.dayEndTime = dayEndTime;
        this.price_one = price_one;
        this.price_two = price_two;
        this.price_three = price_three;
        this.roomLeft_one = roomLeft_one;
        this.roomLeft_two = roomLeft_two;
        this.roomLeft_Three = roomLeft_Three;
    }


    @Id
    @Column(name = "pid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getPid() {
        return pid;
    }

    @Column(name = "dayStartTime")
    @Temporal(TemporalType.TIME)
    public Date getDayStartTime() {
        return dayStartTime;
    }

    @Column(name = "dayEndTime")
    @Temporal(TemporalType.TIME)
    public Date getDayEndTime() {
        return dayEndTime;
    }

    @Column(name = "price_one")
    public int getPrice_one() {
        return price_one;
    }

    @Column(name = "price_two")
    public int getPrice_two() {
        return price_two;
    }

    @Column(name = "price_three")
    public int getPrice_three() {
        return price_three;
    }

    @Column(name = "roomLeft_one")
    public int getRoomLeft_one() {
        return roomLeft_one;
    }

    @Column(name = "roomLeft_two")
    public int getRoomLeft_two() {
        return roomLeft_two;
    }

    @Column(name = "roomLeft_three")
    public int getRoomLeft_Three() {
        return roomLeft_Three;
    }

    public void setPid(long pid) {
        this.pid = pid;
    }

    public void setDayStartTime(Date dayStartTime) {
        this.dayStartTime = dayStartTime;
    }

    public void setDayEndTime(Date dayEndTime) {
        this.dayEndTime = dayEndTime;
    }

    public void setPrice_one(int price_one) {
        this.price_one = price_one;
    }

    public void setPrice_two(int price_two) {
        this.price_two = price_two;
    }

    public void setPrice_three(int price_three) {
        this.price_three = price_three;
    }

    public void setRoomLeft_one(int roomLeft_one) {
        this.roomLeft_one = roomLeft_one;
    }

    public void setRoomLeft_two(int roomLeft_two) {
        this.roomLeft_two = roomLeft_two;
    }

    public void setRoomLeft_Three(int roomLeft_Three) {
        this.roomLeft_Three = roomLeft_Three;
    }
}
