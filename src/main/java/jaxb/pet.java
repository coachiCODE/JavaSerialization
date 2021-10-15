package jaxb;
import org.msgpack.annotation.Message;

import javax.xml.bind.annotation.*;
import java.util.UUID;
@Message
@XmlRootElement(name="Pets")
public class pet {
	
	private String uniqueID = UUID.randomUUID().toString();
	private String name;
	private String gender;
	private float weight;
	private String birth_date;
	
	@XmlElement
	public String getUniqueID() {
		return uniqueID;
	}
	public void setUniqueID(String uniqueID) {
		this.uniqueID = uniqueID;
	}
	
	@XmlElement
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@XmlElement
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@XmlElement
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	@XmlElement
	public String getBirth_date() {
		return birth_date;
	}
	public void setBirth_date(String birth_date) {
		this.birth_date = birth_date;
	}
	
	public pet(String uniqueID, String name, String gender, float weight, String birth_date) {
		super();
		this.uniqueID = uniqueID;
		this.name = name;
		this.gender = gender;
		this.weight = weight;
		this.birth_date = birth_date;
	}
	
	public pet() {
		super();
	}
}
