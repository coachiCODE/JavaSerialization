package jaxb;
import org.msgpack.annotation.Message;

import javax.xml.bind.annotation.*;
import java.util.UUID;
import java.util.List;
@Message
@XmlRootElement(name="Pet-Owner")
@XmlType(propOrder = {"uniqueID","name","birth_date","phone_number","address","petList"})
public class pet_owner {

	private pets petList;
	private String uniqueID = UUID.randomUUID().toString();
	private String name;
	private String birth_date;
	private String phone_number;
	private String address;
	
	@XmlElement
	public String getUniqueID() {
		return uniqueID;
	}
	public void setUniqueID(String uniqueID) {
		this.uniqueID = uniqueID;
	}

	@XmlElement(name="Pets")
	public pets getPetList() {
		return petList;
	}

	@XmlElement
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@XmlElement
	public String getBirth_date() {
		return birth_date;
	}
	public void setBirth_date(String birth_date) {
		this.birth_date = birth_date;
	}
	
	@XmlElement
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	
	@XmlElement
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public pet_owner(String uniqueID, String name, String birth_date, String phone_number, String address) {
		super();
		this.uniqueID = uniqueID;
		this.name = name;
		this.birth_date = birth_date;
		this.phone_number = phone_number;
		this.address = address;
		this.petList = new pets();
	}
	
	public pet_owner() {
		super();
	}

}
