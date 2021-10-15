package jaxb;
import java.io.File;
import javax.xml.bind.*;
import javax.xml.bind.JAXBContext;

public class PetJAXB {
	
	public void marshall() {
		
		try {
			pet cat = new pet("A001","test1","Male",5,"02/10/1999");
			
			JAXBContext jc = JAXBContext.newInstance(pet.class);
			Marshaller ms = jc.createMarshaller();
			ms.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
			ms.marshal(cat,System.out);
			ms.marshal(cat, new File("src\\main\\data\\Pets.xml"));
			
		}catch(Exception e){
			
			System.out.println(""+e.getMessage());
		}
	}
	
	public void unmarshall() {
		
		try {
			JAXBContext jc = JAXBContext.newInstance(pet.class);
			Unmarshaller ums = jc.createUnmarshaller();
			pet cat = (pet)ums.unmarshal(new File("src\\main\\data\\Pets.xml"));
			
				System.out.println("Pets Information");
				System.out.println("Pet Id:" +cat.getUniqueID());
				System.out.println("Pet Name:" +cat.getName());
				System.out.println("Pet Gender:" +cat.getGender());
				System.out.println("Pet Weight:" +cat.getWeight());
				System.out.println("Pet Birth Date:" +cat.getBirth_date());


		}catch(Exception e){
			
			System.out.println(""+e.getMessage());
		}
	
	}
}
