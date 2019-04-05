package org.weixin.weixin.domain.voice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.weixin.weixin.domain.InMessage;

import com.fasterxml.jackson.annotation.JsonProperty;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "xml")
public class VoiceInMessage extends InMessage {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@XmlElement(name = "Format")
	@JsonProperty("Format")
	private String  Format;
	
	@XmlElement(name = "MediaId")
	@JsonProperty("MediaId")
	private String  MediaId;
	
	public VoiceInMessage() {
		super.setMsgType("voice");
	}

	public String getFormat() {
		return Format;
	}

	public void setFormat(String format) {
		Format = format;
	}

	public String getMediaId() {
		return MediaId;
	}

	public void setMediaId(String mediaId) {
		MediaId = mediaId;
	}

	@Override
	public String toString() {
		return "VoiceInMessage [Format=" + Format + ", MediaId=" + MediaId + ", getToUserName()=" + getToUserName()
				+ ", getFromUserName()=" + getFromUserName() + ", getCreateTime()=" + getCreateTime()
				+ ", getMsgType()=" + getMsgType() + ", getMsgId()=" + getMsgId() + "]";
	}
	
	
}
