package org.weixin.weixin.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;

@XmlAccessorType(XmlAccessType.FIELD) // jaxb从字段获取配置信息
@XmlRootElement(name = "xml")	// jxab读取xml时根元素名称
public class InMessage {
	
	// 由于微信发送给我们的消息字段是首字母大写的，而java字段字母大写不符合javaBean的规范
	// 如果使用jaxb，需要使用@XmlElement注解xml里面元素名称和java字段之间的关系
	// 如果使用Jackson，则需要使用@JackProperty注解指定java字段序列化和反序列化的字段名称映射
	
	@XmlElement(name = "ToUserName")
	@JsonProperty("ToUserName")
	private String toUserName;
	
	@XmlElement(name = "fromUserName")
	@JsonProperty("fromUserName")
	private String fromUserName;
	
	@XmlElement(name = "createTime")
	@JsonProperty("createTime")
	private	long   createTime;
	
	@XmlElement(name = "msgType")
	@JsonProperty("msgType")
	private String msgType;
	
	@XmlElement(name = "msgId")
	@JsonProperty("msgId")
	private Long   msgId;

	public String getToUserName() {
		return toUserName;
	}

	public void setToUserName(String toUserName) {
		this.toUserName = toUserName;
	}

	public String getFromUserName() {
		return fromUserName;
	}

	public void setFromUserName(String fromUserName) {
		this.fromUserName = fromUserName;
	}

	public long getCreateTime() {
		return createTime;
	}

	public void setCreateTime(long createTime) {
		this.createTime = createTime;
	}

	public String getMsgType() {
		return msgType;
	}

	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}

	public long getMsgId() {
		return msgId;
	}

	public void setMsgId(long msgId) {
		this.msgId = msgId;
	}
	
	
}
