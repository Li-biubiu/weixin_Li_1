package org.weixin.weixin.domain.video;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.weixin.weixin.domain.InMessage;

import com.fasterxml.jackson.annotation.JsonProperty;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "xml")
public class VideoInMessage extends InMessage {
	
	@XmlElement(name = "ThumbMediaId")
	@JsonProperty("ThumbMediaId")
	private String  ThumbMediaId;
	
	@XmlElement(name = "MediaId")
	@JsonProperty("MediaId")
	private String  MediaId;
	
	public VideoInMessage() {
		super.setMsgType("video");
	}

	public String getThumbMediaId() {
		return ThumbMediaId;
	}

	public void setThumbMediaId(String thumbMediaId) {
		ThumbMediaId = thumbMediaId;
	}

	public String getMediaId() {
		return MediaId;
	}

	public void setMediaId(String mediaId) {
		MediaId = mediaId;
	}
	
	
}
