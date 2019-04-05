package org.weixin.weixin.domain.location;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.weixin.weixin.domain.InMessage;

import com.fasterxml.jackson.annotation.JsonProperty;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "xml")
public class LocationInMessage extends InMessage {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@XmlElement(name = "Location_X")
	@JsonProperty("Location_X")
	private String  Location_X;
	
	@XmlElement(name = "Location_Y")
	@JsonProperty("Location_Y")
	private String  Location_Y;
	
	@XmlElement(name = "Scale")
	@JsonProperty("Scale")
	private String  Scale;
	
	@XmlElement(name = "Label")
	@JsonProperty("Label")
	private String  Label;
	
	public LocationInMessage() {
		super.setMsgType("location");
	}

	public String getLocation_X() {
		return Location_X;
	}

	public void setLocation_X(String location_X) {
		Location_X = location_X;
	}

	public String getLocation_Y() {
		return Location_Y;
	}

	public void setLocation_Y(String location_Y) {
		Location_Y = location_Y;
	}

	public String getScale() {
		return Scale;
	}

	public void setScale(String scale) {
		Scale = scale;
	}

	public String getLabel() {
		return Label;
	}

	public void setLabel(String label) {
		Label = label;
	}

	@Override
	public String toString() {
		return "LocationInMessage [Location_X=" + Location_X + ", Location_Y=" + Location_Y + ", Scale=" + Scale
				+ ", Label=" + Label + ", getToUserName()=" + getToUserName() + ", getFromUserName()="
				+ getFromUserName() + ", getCreateTime()=" + getCreateTime() + ", getMsgType()=" + getMsgType()
				+ ", getMsgId()=" + getMsgId() + "]";
	}
	
	
}
