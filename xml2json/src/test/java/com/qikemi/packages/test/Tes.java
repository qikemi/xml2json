package com.qikemi.packages.test;

import org.junit.Test;

import com.qikemi.packages.test.bean.Message;
import com.qikemi.packages.xmlJsonAndJavaBean.JavaBean2Json;
import com.qikemi.packages.xmlJsonAndJavaBean.JavaBean2Xml;
import com.qikemi.packages.xmlJsonAndJavaBean.Xml2JavaBean;

/**
 * 
 * Create Date: 2014年9月28日 下午8:28:30
 * Author XieXianbin<a.b@hotmail.com>
 * Source Repositories Address: <https://github.com/qikemi/open-wechat-sdk>
 */
public class Tes {

	@Test
	public void tes1(){
		String xml = " <xml> <ToUserName><![CDATA[toUser]]></ToUserName> <FromUserName><![CDATA[fromUser]]></FromUserName> <CreateTime>1348831860</CreateTime> <MsgType><![CDATA[text]]></MsgType> <Content><![CDATA[this is a test]]></Content> <MsgId>1234567890123456</MsgId> </xml>";
		Message message = (Message) Xml2JavaBean.convert2JavaBean(xml, Message.class);
		
		System.out.println(message.getFromUserName());
		System.out.println(message.getCreateTime());
		System.out.println(message.getMsgType());
	}
	
	@Test
	public void tes2s(){
		Message message = new Message("fromUserName", "createTime", "msgType");
		System.out.println(JavaBean2Xml.convert2Xml(message, "xml"));
		
	}
	
}
