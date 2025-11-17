package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 歌手信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2025-03-12 23:22:19
 */
@TableName("geshouxinxi")
public class GeshouxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public GeshouxinxiEntity() {
		
	}
	
	public GeshouxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
    @TableId(type = IdType.AUTO)
	private Long id;
	/**
	 * 歌手姓名
	 */
					
	private String geshouxingming;
	
	/**
	 * 艺名
	 */
					
	private String yiming;
	
	/**
	 * 国籍
	 */
					
	private String guoji;
	
	/**
	 * 出生日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date chushengriqi;
	
	/**
	 * 出生地
	 */
					
	private String chushengdi;
	
	/**
	 * 音乐流派
	 */
					
	private String yinleliupai;
	
	/**
	 * 经纪公司
	 */
					
	private String jingjigongsi;
	
	/**
	 * 出道时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date chudaoshijian;
	
	/**
	 * 代表作品
	 */
					
	private String daibiaozuopin;
	
	/**
	 * 获奖记录
	 */
					
	private String huojiangjilu;
	
	/**
	 * 作品链接
	 */
					
	private String zuopinlianjie;
	
	/**
	 * 头像
	 */
					
	private String touxiang;
	
	/**
	 * 评论数
	 */
					
	private Integer discussnum;
	
	/**
	 * 评分
	 */
					
	private Double totalscore;
	
	/**
	 * 收藏数
	 */
					
	private Integer storeupnum;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：歌手姓名
	 */
	public void setGeshouxingming(String geshouxingming) {
		this.geshouxingming = geshouxingming;
	}
	/**
	 * 获取：歌手姓名
	 */
	public String getGeshouxingming() {
		return geshouxingming;
	}
	/**
	 * 设置：艺名
	 */
	public void setYiming(String yiming) {
		this.yiming = yiming;
	}
	/**
	 * 获取：艺名
	 */
	public String getYiming() {
		return yiming;
	}
	/**
	 * 设置：国籍
	 */
	public void setGuoji(String guoji) {
		this.guoji = guoji;
	}
	/**
	 * 获取：国籍
	 */
	public String getGuoji() {
		return guoji;
	}
	/**
	 * 设置：出生日期
	 */
	public void setChushengriqi(Date chushengriqi) {
		this.chushengriqi = chushengriqi;
	}
	/**
	 * 获取：出生日期
	 */
	public Date getChushengriqi() {
		return chushengriqi;
	}
	/**
	 * 设置：出生地
	 */
	public void setChushengdi(String chushengdi) {
		this.chushengdi = chushengdi;
	}
	/**
	 * 获取：出生地
	 */
	public String getChushengdi() {
		return chushengdi;
	}
	/**
	 * 设置：音乐流派
	 */
	public void setYinleliupai(String yinleliupai) {
		this.yinleliupai = yinleliupai;
	}
	/**
	 * 获取：音乐流派
	 */
	public String getYinleliupai() {
		return yinleliupai;
	}
	/**
	 * 设置：经纪公司
	 */
	public void setJingjigongsi(String jingjigongsi) {
		this.jingjigongsi = jingjigongsi;
	}
	/**
	 * 获取：经纪公司
	 */
	public String getJingjigongsi() {
		return jingjigongsi;
	}
	/**
	 * 设置：出道时间
	 */
	public void setChudaoshijian(Date chudaoshijian) {
		this.chudaoshijian = chudaoshijian;
	}
	/**
	 * 获取：出道时间
	 */
	public Date getChudaoshijian() {
		return chudaoshijian;
	}
	/**
	 * 设置：代表作品
	 */
	public void setDaibiaozuopin(String daibiaozuopin) {
		this.daibiaozuopin = daibiaozuopin;
	}
	/**
	 * 获取：代表作品
	 */
	public String getDaibiaozuopin() {
		return daibiaozuopin;
	}
	/**
	 * 设置：获奖记录
	 */
	public void setHuojiangjilu(String huojiangjilu) {
		this.huojiangjilu = huojiangjilu;
	}
	/**
	 * 获取：获奖记录
	 */
	public String getHuojiangjilu() {
		return huojiangjilu;
	}
	/**
	 * 设置：作品链接
	 */
	public void setZuopinlianjie(String zuopinlianjie) {
		this.zuopinlianjie = zuopinlianjie;
	}
	/**
	 * 获取：作品链接
	 */
	public String getZuopinlianjie() {
		return zuopinlianjie;
	}
	/**
	 * 设置：头像
	 */
	public void setTouxiang(String touxiang) {
		this.touxiang = touxiang;
	}
	/**
	 * 获取：头像
	 */
	public String getTouxiang() {
		return touxiang;
	}
	/**
	 * 设置：评论数
	 */
	public void setDiscussnum(Integer discussnum) {
		this.discussnum = discussnum;
	}
	/**
	 * 获取：评论数
	 */
	public Integer getDiscussnum() {
		return discussnum;
	}
	/**
	 * 设置：评分
	 */
	public void setTotalscore(Double totalscore) {
		this.totalscore = totalscore;
	}
	/**
	 * 获取：评分
	 */
	public Double getTotalscore() {
		return totalscore;
	}
	/**
	 * 设置：收藏数
	 */
	public void setStoreupnum(Integer storeupnum) {
		this.storeupnum = storeupnum;
	}
	/**
	 * 获取：收藏数
	 */
	public Integer getStoreupnum() {
		return storeupnum;
	}

}
