package jaxb;
import java.io.File;
import java.util.Arrays;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class PetOwnerJAXB {
	
public void marshall(pet_owners owners) {
		
		try {
			JAXBContext jc = JAXBContext.newInstance(pet_owners.class);
			Marshaller ms = jc.createMarshaller();
			ms.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
			ms.marshal(owners, new File("src\\main\\data\\Pet_Owners.xml"));
			ms.marshal(owners,System.out);
			/*ms.marshal(Tiago,System.out);
			ms.marshal(Miguel, System.out);
			ms.marshal(Tiago, new File("src\\main\\data\\Pet_Owners.xml"));
			ms.marshal(Miguel, new File("src\\main\\data\\Pet_Owners.xml"));*/


		}catch(Exception e){
			
			System.out.println(""+e.getMessage());
		}
	}
	
	public void unmarshall() {
		
		try {
			JAXBContext jc = JAXBContext.newInstance(pet_owners.class);
			Unmarshaller ums = jc.createUnmarshaller();
			pet cat = (pet)ums.unmarshal(new File("src\\main\\data\\Pet_Owners.xml"));
			
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
