package com.example.pojo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 会员卡pojo
 * Created by Crystal on 2017/2/6.
 */
@Entity(name = "vipCard")
public class VipCard implements Serializable{

    /**
     * 会员卡号 7位 主键
     */
    private String vipNumber;
    /**
     * 会员卡级别
     */
    private int level;
    /**
     * 会员资格状态
     */
    private VIPState vipState;
    /**
     * 会员卡余额
     */
    private long remaining;
    /**
     * 会员资格暂停开始时间
     */
    private Date pauseState_StartTime;
    /**
     * 会员资格恢复时间
     */
    private Date normalState_recoverTime;

    public VipCard(){}

    public VipCard(String vipNumber, int level, VIPState vipState, long remaining,
                   Date pauseState_StartTime, Date normalState_recoverTime) {
        this.vipNumber = vipNumber;
        this.level = level;
        this.vipState = vipState;
        this.remaining = remaining;
        this.pauseState_StartTime = pauseState_StartTime;
        this.normalState_recoverTime = normalState_recoverTime;
    }

    @Id
    @Column(name = "vipNumber")
    public String getVipNumber() {
        return vipNumber;
    }

    @Column(name = "level")
    public int getLevel() {
        return level;
    }

    @Column(name = "vipState")
    @Enumerated(EnumType.STRING)
    public VIPState getVipState() {
        return vipState;
    }

    @Column(name = "remaining")
    public long getRemaining() {
        return remaining;
    }

    @Column(name = "pauseState_StartTime")
    @Temporal(TemporalType.DATE)
    public Date getPauseState_StartTime() {
        return pauseState_StartTime;
    }

    @Column(name = "normalState_recoverTime")
    @Temporal(TemporalType.DATE)
    public Date getNormalState_recoverTime() {
        return normalState_recoverTime;
    }

    public void setVipNumber(String vipNumber) {
        this.vipNumber = vipNumber;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setVipState(VIPState vipState) {
        this.vipState = vipState;
    }

    public void setRemaining(long remaining) {
        this.remaining = remaining;
    }

    public void setPauseState_StartTime(Date pauseState_StartTime) {
        this.pauseState_StartTime = pauseState_StartTime;
    }

    public void setNormalState_recoverTime(Date normalState_recoverTime) {
        this.normalState_recoverTime = normalState_recoverTime;
    }
}
