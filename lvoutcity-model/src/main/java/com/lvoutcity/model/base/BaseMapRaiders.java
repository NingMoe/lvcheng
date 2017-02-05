package com.lvoutcity.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseMapRaiders<M extends BaseMapRaiders<M>> extends Model<M> implements IBean {

	public void setId(java.lang.String id) {
		set("id", id);
	}

	public java.lang.String getId() {
		return get("id");
	}

	public void setGuideId(java.lang.String guideId) {
		set("guide_id", guideId);
	}

	public java.lang.String getGuideId() {
		return get("guide_id");
	}

	public void setType(java.lang.String type) {
		set("type", type);
	}

	public java.lang.String getType() {
		return get("type");
	}

	public void setName(java.lang.String name) {
		set("name", name);
	}

	public java.lang.String getName() {
		return get("name");
	}

	public void setStatus(java.lang.String status) {
		set("status", status);
	}

	public java.lang.String getStatus() {
		return get("status");
	}

	public void setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
	}

	public java.util.Date getCreateTime() {
		return get("create_time");
	}

	public void setIsDelete(java.lang.String isDelete) {
		set("is_delete", isDelete);
	}

	public java.lang.String getIsDelete() {
		return get("is_delete");
	}

	public void setOrderBy(java.lang.String orderBy) {
		set("order_by", orderBy);
	}

	public java.lang.String getOrderBy() {
		return get("order_by");
	}

	public void setAttrId(java.lang.String attrId) {
		set("attr_id", attrId);
	}

	public java.lang.String getAttrId() {
		return get("attr_id");
	}

}