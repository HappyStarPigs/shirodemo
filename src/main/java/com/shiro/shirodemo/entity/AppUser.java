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
@TableName("app_user")
public class AppUser extends Model<AppUser> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
	private String username;
	private String password;
	private String phonenumber;
	private String email;
	private String type;
	@TableField("head_portraits")
	private String headPortraits;
	private String nickname;
	@TableField("create_time")
	private Date createTime;
	@TableField("last_login_time")
	private Date lastLoginTime;
	private Integer status;
	private String signature;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getHeadPortraits() {
		return headPortraits;
	}

	public void setHeadPortraits(String headPortraits) {
		this.headPortraits = headPortraits;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public static final String ID = "id";

	public static final String USERNAME = "username";

	public static final String PASSWORD = "password";

	public static final String PHONENUMBER = "phonenumber";

	public static final String EMAIL = "email";

	public static final String TYPE = "type";

	public static final String HEAD_PORTRAITS = "head_portraits";

	public static final String NICKNAME = "nickname";

	public static final String CREATE_TIME = "create_time";

	public static final String LAST_LOGIN_TIME = "last_login_time";

	public static final String STATUS = "status";

	public static final String SIGNATURE = "signature";

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "AppUser{" +
			"id=" + id +
			", username=" + username +
			", password=" + password +
			", phonenumber=" + phonenumber +
			", email=" + email +
			", type=" + type +
			", headPortraits=" + headPortraits +
			", nickname=" + nickname +
			", createTime=" + createTime +
			", lastLoginTime=" + lastLoginTime +
			", status=" + status +
			", signature=" + signature +
			"}";
	}
}
