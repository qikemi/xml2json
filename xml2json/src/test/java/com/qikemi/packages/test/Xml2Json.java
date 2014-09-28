package com.qikemi.packages.test;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;
import org.json.XML;

import com.alibaba.fastjson.JSON;
import com.qikemi.packages.test.bean.Message;

public class Xml2Json {

	// JSON格式缩进空格数
	public static int PRETTY_PRINT_INDENT_FACTOR = 4;
	
	public static void main(String[] args) {
		/**
		 * xml to java json  
		 */
		String TEST_XML_STRING = " <xml> <ToUserName><![CDATA[toUser]]></ToUserName> <FromUserName><![CDATA[fromUser]]></FromUserName> <CreateTime>1348831860</CreateTime> <MsgType><![CDATA[text]]></MsgType> <Content><![CDATA[this is a test]]></Content> <MsgId>1234567890123456</MsgId> </xml>";
		JSONObject xmlJSONObj = XML.toJSONObject(TEST_XML_STRING);
		
        String jsonPrettyPrintString = xmlJSONObj.toString(PRETTY_PRINT_INDENT_FACTOR);
		System.out.println(jsonPrettyPrintString);
		
		JSONObject sub = (JSONObject) xmlJSONObj.get("xml");
		System.out.println(sub.toString(PRETTY_PRINT_INDENT_FACTOR));
		
		/**
		 * json to java bean 
		 */
		// 反序列化 http://zyjustin9.iteye.com/blog/2020533
		Message message = JSON.parseObject(sub.toString(), Message.class);
		
		System.out.println(message.getFromUserName());
		System.out.println(message.getToUserName());
//		System.out.println(message.getContent());
		System.out.println(message.getCreateTime());
		System.out.println(message.getMsgType());
//		System.out.println(message.getMsgId());
		
		/**
		 * java bean to json 
		 */
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("xml", message);
		String javabean2json = com.alibaba.fastjson.JSONObject.toJSONString(map);
		System.out.println(javabean2json);
		
		/**
		 * java bean to xml 
		 */
		JSONObject o = new JSONObject(javabean2json.toString());
		String xml = XML.toString(o);
		System.out.println(xml);
		
	}
}
