package com.mashensoft.srdj.app.common;

public class ResponseObject {
	/**
	 * 响应的状态码
	 */
	private String resCode = "100";
	/**
	 * 响应内容描述
	 */
	private String resDesc = "成功";
	/**
	 * 响应内容
	 */
	private Object resData;

	public String getResCode() {
		return resCode;
	}

	public void setResCode(String resCode) {
		this.resCode = resCode;
	}

	public String getResDesc() {
		return resDesc;
	}

	public void setResDesc(String resDesc) {
		this.resDesc = resDesc;
	}

	public Object getResData() {
		return resData;
	}

	public void setResData(Object resData) {
		this.resData = resData;
	}

}
