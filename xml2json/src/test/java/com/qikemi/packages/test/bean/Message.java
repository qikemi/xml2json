package com.qikemi.packages.test.bean;

public class Message {

	private String FromUserName;
//	private String MsgId;
	private String CreateTime;
//	private String Content;
	private String ToUserName;
	private String MsgType;
	
	public Message() {
		super();
	}
	
	public Message(String fromUserName, String msgId, String createTime,
			String content, String toUserName, String msgType) {
		super();
		FromUserName = fromUserName;
//		MsgId = msgId;
		CreateTime = createTime;
//		Content = content;
		ToUserName = toUserName;
		MsgType = msgType;
	}
	
	public String getFromUserName() {
		return FromUserName;
	}
	public void setFromUserName(String fromUserName) {
		FromUserName = fromUserName;
	}
//	public String getMsgId() {
//		return MsgId;
//	}
//	public void setMsgId(String msgId) {
//		MsgId = msgId;
//	}
	public String getCreateTime() {
		return CreateTime;
	}
	public void setCreateTime(String createTime) {
		CreateTime = createTime;
	}
//	public String getContent() {
//		return Content;
//	}
//	public void setContent(String content) {
//		Content = content;
//	}
	public String getToUserName() {
		return ToUserName;
	}
	public void setToUserName(String toUserName) {
		ToUserName = toUserName;
	}
	public String getMsgType() {
		return MsgType;
	}
	public void setMsgType(String msgType) {
		MsgType = msgType;
	}
	
}
