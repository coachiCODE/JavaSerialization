package jaxb;

import org.msgpack.annotation.Message;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.LinkedList;
import java.util.List;

@Message
@XmlRootElement(name="Pet_Owners")
public class pet_owners {

    @XmlElement(name="Owner")
    private List<pet_owner> ownerList;

    public pet_owners() {
        this.ownerList = new LinkedList<>();
    }

    public List<pet_owner> getOwnerList() {
        return ownerList;
    }
}
