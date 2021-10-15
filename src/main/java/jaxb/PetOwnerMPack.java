package jaxb;
import org.msgpack.MessagePack;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.util.Arrays;

public class PetOwnerMPack {

    public void marshall(pet_owners owners){
        try {
            File tempFile = new File("src\\main\\data\\Pet_OwnersPACK.bin");

            MessagePack messagePack = new MessagePack();
            byte[] packed = messagePack.write(owners);

            try (FileOutputStream outputStream = new FileOutputStream(tempFile)) {
                outputStream.write(packed);
            }
            packed = Files.readAllBytes(tempFile.toPath());
            pet_owners dst = messagePack.read(packed, pet_owners.class);

        }catch(Exception e){

            System.out.println(""+e.getMessage());
        }
    }
}
