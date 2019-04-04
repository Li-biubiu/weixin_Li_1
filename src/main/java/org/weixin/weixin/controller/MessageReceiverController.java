package org.weixin.weixin.controller;

import java.io.StringReader;

import javax.xml.bind.JAXB;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.weixin.weixin.domain.InMessage;
import org.weixin.weixin.service.MessageTypeMapper;

//控制器: 负责接收用户的请求参数、调用业务层逻辑代码、返回视图/结果给客服端（浏览器）
//Controller  基于JSP的控制器
//RestController  符合RestFul风格的WEB服务的控制器
//Restful不同的请求方法调用不同的处理处理程序，只包含数据，不包含视图 (HTML,JSP)


@RestController
@RequestMapping("/ljh_1/weixin/receiver")
public class MessageReceiverController {
	
	//日志记录器
	private static final Logger LOG = LoggerFactory.getLogger(MessageReceiverController.class);
	
	
	@GetMapping //只处理GET请求
	public String echo( 
			@RequestParam("signature")String signature,// 
			@RequestParam("timestamp")String timestamp,//
			@RequestParam("nonce")String nonce,//
			@RequestParam("echostr")String echostr
			)  
    { 
		//正常来讲，需要把timpstamp和nonce放入一个数据，并进行排序
		//接着把排序后的两个元素拼接成一个新的String
		//使用SHA-1算法对新的String进行加密
		//最后把加密的结果跟singnature进行比较，如果相同返回验证通过
		
		//原路返回echostr的值，返回以后微信公众号平台就能够认为：服务器对接成功
		return echostr;
	}
	
	
	@PostMapping
	//@RequestBody注解表示把请求内容获取出来，并且转换为String传入给xml参数。
	public String onMessage(
			@RequestParam("signature")String signature,// 
			@RequestParam("timestamp")String timestamp,//
			@RequestParam("nonce")String nonce,//
			@RequestBody String xml) {
		//收到消息
		//{}占位符,第一个{}会把第二个参数的值自动填入
		//LOG.trace必须要求日志记录器的配置为trace级别才能输出
		LOG.trace("收到的消息原文: \n{}\n--------------------", xml);
		
		
//		if (xml.contains("<MsgType><![CDATA[text]]></MsgType>")) {	
//		} else if(xml.contains("<MsgType><![CDATA[image]]></MsgType>")) {	
//		} else if(xml.contains("<MsgType><![CDATA[voice]]></MsgType>")) {	
//		} else if(xml.contains("<MsgType><![CDATA[video]]></MsgType>")) {	
//		} else if(xml.contains("<MsgType><![CDATA[loaction]]></MsgType>")) {
//		}
		
		// 截取消息类型
		String type = xml.substring(0);
		Class<InMessage> cla = MessageTypeMapper.getClass(type);
		
		// 使用JAXB完成XML转换为JAVA对象的操作
		InMessage inMessage = JAXB.unmarshal(new StringReader(xml), cla);
		
		
		
		return "success";
	}
	
}


















