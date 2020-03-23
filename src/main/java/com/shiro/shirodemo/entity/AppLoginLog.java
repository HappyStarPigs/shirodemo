package com.shiro.shirodemo.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
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
@TableName("app_login_log")
public class AppLoginLog extends Model<AppLoginLog> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
	private Integer appsuerid;
	private Date loginTime;
	private String loginIp;
	private Integer logintotal;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAppsuerid() {
		return appsuerid;
	}

	public void setAppsuerid(Integer appsuerid) {
		this.appsuerid = appsuerid;
	}

	public Date getLoginTime() {
		return loginTime;
	}

	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}

	public String getLoginIp() {
		return loginIp;
	}

	public void setLoginIp(String loginIp) {
		this.loginIp = loginIp;
	}

	public Integer getLogintotal() {
		return logintotal;
	}

	public void setLogintotal(Integer logintotal) {
		this.logintotal = logintotal;
	}

	public static final String ID = "id";

	public static final String APPSUERID = "appsuerid";

	public static final String LOGINTIME = "loginTime";

	public static final String LOGINIP = "loginIp";

	public static final String LOGINTOTAL = "logintotal";

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "AppLoginLog{" +
			"id=" + id +
			", appsuerid=" + appsuerid +
			", loginTime=" + loginTime +
			", loginIp=" + loginIp +
			", logintotal=" + logintotal +
			"}";
	}
}
