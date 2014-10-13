package com.qikemi.packages.test.bean;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public class Message {

	@XStreamAlias("fromUserName")
	private String FromUserName;
	@XStreamAlias("createTime")
	private String CreateTime;
	@XStreamAlias("type")
	private String MsgType;
	
	public Message() {
		super();
	}
	
	public Message(String fromUserName, String createTime, String msgType) {
		super();
		FromUserName = fromUserName;
		CreateTime = createTime;
		MsgType = msgType;
	}
	
	public String getFromUserName() {
		return FromUserName;
	}
	public void setFromUserName(String fromUserName) {
		FromUserName = fromUserName;
	}
	public String getCreateTime() {
		return CreateTime;
	}
	public void setCreateTime(String createTime) {
		CreateTime = createTime;
	}
	public String getMsgType() {
		return MsgType;
	}
	public void setMsgType(String msgType) {
		MsgType = msgType;
	}
	
}
