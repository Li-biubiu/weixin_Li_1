package org.weixin.weixin.domain.event;

import javax.xml.bind.annotation.XmlElement;

import org.weixin.weixin.domain.InMessage;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EventInMessage extends InMessage{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@XmlElement(name = "Event")
	@JsonProperty("Event")
	private String   event;
	
	@XmlElement(name = "EventKet")
	@JsonProperty("EventKet")
	private String   eventKet;

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public String getEventKet() {
		return eventKet;
	}

	public void setEventKet(String eventKet) {
		this.eventKet = eventKet;
	}

	@Override
	public String toString() {
		return "EventInMessage [event=" + event + ", eventKet=" + eventKet + ", getToUserName()=" + getToUserName()
				+ ", getFromUserName()=" + getFromUserName() + ", getCreateTime()=" + getCreateTime()
				+ ", getMsgType()=" + getMsgType() + ", getMsgId()=" + getMsgId() + "]";
	}
	
	
	
}
