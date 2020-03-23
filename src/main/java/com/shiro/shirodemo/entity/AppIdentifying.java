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
@TableName("app_identifying")
public class AppIdentifying extends Model<AppIdentifying> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
	private Integer userid;
	private String password;
	private String email;
	private String randomtext;
	@TableField("last_send_time")
	private Date lastSendTime;
	private Integer status;
	private String phone;


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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRandomtext() {
		return randomtext;
	}

	public void setRandomtext(String randomtext) {
		this.randomtext = randomtext;
	}

	public Date getLastSendTime() {
		return lastSendTime;
	}

	public void setLastSendTime(Date lastSendTime) {
		this.lastSendTime = lastSendTime;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public static final String ID = "id";

	public static final String USERID = "userid";

	public static final String PASSWORD = "password";

	public static final String EMAIL = "email";

	public static final String RANDOMTEXT = "randomtext";

	public static final String LAST_SEND_TIME = "last_send_time";

	public static final String STATUS = "status";

	public static final String PHONE = "phone";

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "AppIdentifying{" +
			"id=" + id +
			", userid=" + userid +
			", password=" + password +
			", email=" + email +
			", randomtext=" + randomtext +
			", lastSendTime=" + lastSendTime +
			", status=" + status +
			", phone=" + phone +
			"}";
	}
}
