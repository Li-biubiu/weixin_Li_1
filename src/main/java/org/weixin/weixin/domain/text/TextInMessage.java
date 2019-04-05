package org.weixin.weixin.domain.text;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.weixin.weixin.domain.InMessage;

import com.fasterxml.jackson.annotation.JsonProperty;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "xml")
public class TextInMessage extends InMessage {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@XmlElement(name = "Content")
	@JsonProperty("Content")
	private String   Content;
	
	public TextInMessage() {
		super.setMsgType("text");
	}

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}

	// 如果想要打印一些含义的信息出来，必须要重写此回复，否则只能打印一个内存地址
	@Override
	public String toString() {
		return "TextInMessage [Content=" + Content + ", getToUserName()=" + getToUserName() + ", getFromUserName()="
				+ getFromUserName() + ", getCreateTime()=" + getCreateTime() + ", getMsgType()=" + getMsgType()
				+ ", getMsgId()=" + getMsgId() + "]";
	}
	
	
	
}
