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
@TableName("app_account")
public class AppAccount extends Model<AppAccount> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Long id;
	private Integer userid;
	private Integer groupid;
	private String caption;
	private String fileurl;
	@TableField("create_time")
	private Date createTime;
	@TableField("last_build_time")
	private Date lastBuildTime;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public Integer getGroupid() {
		return groupid;
	}

	public void setGroupid(Integer groupid) {
		this.groupid = groupid;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public String getFileurl() {
		return fileurl;
	}

	public void setFileurl(String fileurl) {
		this.fileurl = fileurl;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getLastBuildTime() {
		return lastBuildTime;
	}

	public void setLastBuildTime(Date lastBuildTime) {
		this.lastBuildTime = lastBuildTime;
	}

	public static final String ID = "id";

	public static final String USERID = "userid";

	public static final String GROUPID = "groupid";

	public static final String CAPTION = "caption";

	public static final String FILEURL = "fileurl";

	public static final String CREATE_TIME = "create_time";

	public static final String LAST_BUILD_TIME = "last_build_time";

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "AppAccount{" +
			"id=" + id +
			", userid=" + userid +
			", groupid=" + groupid +
			", caption=" + caption +
			", fileurl=" + fileurl +
			", createTime=" + createTime +
			", lastBuildTime=" + lastBuildTime +
			"}";
	}
}
