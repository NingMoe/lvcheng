package com.lvoutcity.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BasePageView<M extends BasePageView<M>> extends Model<M> implements IBean {

	public void setRouteId(java.lang.String routeId) {
		set("route_id", routeId);
	}

	public java.lang.String getRouteId() {
		return get("route_id");
	}

	public void setDateTime(java.util.Date dateTime) {
		set("date_time", dateTime);
	}

	public java.util.Date getDateTime() {
		return get("date_time");
	}

	public void setCount(java.lang.Integer count) {
		set("count", count);
	}

	public java.lang.Integer getCount() {
		return get("count");
	}

}