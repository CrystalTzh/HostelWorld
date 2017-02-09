package com.example.pojo;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 顾客 用户
 * Created by Crystal on 2017/2/5.
 */
@Entity(name = "customer")
public class Customer implements Serializable{
    /**
     * id 主键
     */
    private long cid;
    /**
     * 姓名
     */
    private String name;
    /**
     * 性别：1：男 0：女
     */
    private int sex;
    /**
     * 会员卡号 7位 也即登录账号
     */
    private String vipNumber;
    /**
     * 登录密码
     */
    private String password;
    /**
     * 银行卡号 19位
     */
    private String bankCard;
    /**
     * 积分
     */
    private long points;
    /**
     * 累计消费金额
     */
    private long totalSalesAmount;

    public Customer() {
    }
    public Customer(long cid, String name, int sex, String vipNumber, String password,
                    String bankCard, long points, long totalSalesAmount) {
        this.cid = cid;
        this.name = name;
        this.sex = sex;
        this.vipNumber = vipNumber;
        this.password = password;
        this.bankCard = bankCard;
        this.points = points;
        this.totalSalesAmount = totalSalesAmount;
    }

    @Id
    @Column(name = "cid")
    @GeneratedValue(strategy=GenerationType.AUTO)
    public long getCid() {
        return cid;
    }

    public void setCid(long cid) {
        this.cid = cid;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "sex")
    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    @Column(name = "vipNumber")
    public String getVipNumber() {
        return vipNumber;
    }

    public void setVipNumber(String vipNumber) {
        this.vipNumber = vipNumber;
    }

    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name = "bankCard")
    public String getBankCard() {
        return bankCard;
    }

    public void setBankCard(String bankCard) {
        this.bankCard = bankCard;
    }

    @Column(name = "points")
    public long getPoints() {
        return points;
    }

    public void setPoints(long points) {
        this.points = points;
    }

    @Column(name = "totalSalesAmount")
    public long getTotalSalesAmount() {
        return totalSalesAmount;
    }

    public void setTotalSalesAmount(long totalSalesAmount) {
        this.totalSalesAmount = totalSalesAmount;
    }
}
