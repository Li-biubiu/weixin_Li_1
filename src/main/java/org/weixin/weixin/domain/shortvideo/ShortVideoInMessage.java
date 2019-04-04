package org.weixin.weixin.domain.shortvideo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.weixin.weixin.domain.InMessage;

import com.fasterxml.jackson.annotation.JsonProperty;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "xml")
public class ShortVideoInMessage extends InMessage {
	
	@XmlElement(name = "MediaId")
	@JsonProperty("MediaId")
	private String   MediaId;
	
	@XmlElement(name = "ThumbMediaId")
	@JsonProperty("ThumbMediaId")
	private String   ThumbMediaId;
	
	public ShortVideoInMessage() {
		super.setMsgType("shortvideo");
	}

}
