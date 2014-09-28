package com.qikemi.packages.test;

import org.junit.Test;

import com.qikemi.packages.test.bean.Message;
import com.qikemi.packages.xmlandjson.Xml2JavaBean;

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
		System.out.println(message.getToUserName());
//		System.out.println(message.getContent());
		System.out.println(message.getCreateTime());
		System.out.println(message.getMsgType());
//		System.out.println(message.getMsgId());
		
	}
}
