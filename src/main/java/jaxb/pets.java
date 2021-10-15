package jaxb;

import org.msgpack.annotation.Message;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.LinkedList;
import java.util.List;

@Message
public class pets {


    private List<pet> petList;

    public pets() {
        this.petList = new LinkedList<>();
    }

    @XmlElement(name="Pet")
    public List<pet> getPetList() {
        return petList;
    }
}
