package com.example.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 发布计划pojo
 * Created by Crystal on 2017/2/9.
 */

public class Plan implements Serializable{

    private long pid;
    private Date dayStartTime;
    private Date dayEndTime;
    private int price_one;
    private int price_two;
    private int price_three;
    private int roomLeft_one;
    private int roomLeft_two;
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


    public long getPid() {
        return pid;
    }

    public Date getDayStartTime() {
        return dayStartTime;
    }

    public Date getDayEndTime() {
        return dayEndTime;
    }

    public int getPrice_one() {
        return price_one;
    }

    public int getPrice_two() {
        return price_two;
    }

    public int getPrice_three() {
        return price_three;
    }

    public int getRoomLeft_one() {
        return roomLeft_one;
    }

    public int getRoomLeft_two() {
        return roomLeft_two;
    }

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
