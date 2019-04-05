package org.weixin.weixin.domain.link;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.weixin.weixin.domain.InMessage;

import com.fasterxml.jackson.annotation.JsonProperty;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "xml")
public class LinkInMessage extends InMessage {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@XmlElement(name = "Title")
	@JsonProperty("Title")
	private String  Title;
	
	@XmlElement(name = "Description")
	@JsonProperty("Description")
	private String  Description;
	
	@XmlElement(name = "Url")
	@JsonProperty("Url")
	private String  Url;
	
	public LinkInMessage() {
		super.setMsgType("link");
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getUrl() {
		return Url;
	}

	public void setUrl(String url) {
		Url = url;
	}

	@Override
	public String toString() {
		return "LinkInMessage [Title=" + Title + ", Description=" + Description + ", Url=" + Url + ", getToUserName()="
				+ getToUserName() + ", getFromUserName()=" + getFromUserName() + ", getCreateTime()=" + getCreateTime()
				+ ", getMsgType()=" + getMsgType() + ", getMsgId()=" + getMsgId() + "]";
	}
	
	
	
}
