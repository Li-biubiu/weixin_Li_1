package org.weixin.weixin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//控制器: 负责接收用户的请求参数、调用业务层逻辑代码、返回视图/结果给客服端（浏览器）
//Controller  基于JSP的控制器
//RestController  符合RestFul风格的WEB服务的控制器
//Restful不同的请求方法调用不同的处理处理程序，只包含数据，不包含视图 (HTML,JSP)


@RestController
@RequestMapping("/ljh_1/weixin/receiver")
public class MessageReceiverController {
	
	
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
}
