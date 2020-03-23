package com.shiro.shirodemo.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author jwy
 * @since 2020-03-23
 */
@TableName("app_user_sign")
public class AppUserSign extends Model<AppUserSign> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
	private Integer userid;
	@TableField("sign_time")
	private Date signTime;
	@TableField("sustain_day")
	private Integer sustainDay;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public Date getSignTime() {
		return signTime;
	}

	public void setSignTime(Date signTime) {
		this.signTime = signTime;
	}

	public Integer getSustainDay() {
		return sustainDay;
	}

	public void setSustainDay(Integer sustainDay) {
		this.sustainDay = sustainDay;
	}

	public static final String ID = "id";

	public static final String USERID = "userid";

	public static final String SIGN_TIME = "sign_time";

	public static final String SUSTAIN_DAY = "sustain_day";

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "AppUserSign{" +
			"id=" + id +
			", userid=" + userid +
			", signTime=" + signTime +
			", sustainDay=" + sustainDay +
			"}";
	}
}
