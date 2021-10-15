package aulasIS.aulasIS.maven;
import jaxb.*;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        /*PetJAXB pet = new PetJAXB();
        pet.marshall();
        pet.unmarshall();
        */

        pet pet1 = new pet("A001","alpha","Male",5,"02/10/1999");
        pet pet2 = new pet("A002","beta","Male",3,"02/03/2000");
        pet_owner owner1 = new pet_owner("C001","Tiago","02/10/1999","964501210","Coimbra");
        owner1.getPetList().getPetList().add(pet1);
        owner1.getPetList().getPetList().add(pet2);

        pet pet3 = new pet("A003","Bobi","Female",2,"05/10/2009");
        pet pet4 = new pet("A004","Pepe","Male",3,"02/03/2020");
        pet_owner owner2 = new pet_owner("C002","Miguel","06/10/1999","91734809","Coimbra");
        owner2.getPetList().getPetList().add(pet3);
        owner2.getPetList().getPetList().add(pet4);

        pet pet5 = new pet("A005","Raio","Male",2,"05/10/2013");
        pet pet6 = new pet("A006","Vulcão","Male",2,"05/10/2013");
        pet_owner owner3 = new pet_owner("C003","João","10/12/2003","964501210","Coimbra");
        owner3.getPetList().getPetList().add(pet5);
        owner3.getPetList().getPetList().add(pet6);

        pet pet7 = new pet("A007","Jeca","Female",4,"07/6/2020");
        pet pet8 = new pet("A008","Molly","Female",7,"07/10/2018");
        pet_owner owner4 = new pet_owner("C004","Maria","10/12/2003","964501210","Coimbra");
        owner4.getPetList().getPetList().add(pet7);
        owner4.getPetList().getPetList().add(pet8);

        pet pet9 = new pet("A009","Daniel","Male",2,"05/10/2013");
        pet pet10 = new pet("A010","Mary","Female",2,"05/10/2013");
        pet_owner owner5 = new pet_owner("C005","Rui","10/12/2003","964501210","Coimbra");
        owner5.getPetList().getPetList().add(pet9);
        owner5.getPetList().getPetList().add(pet10);

        pet pet11 = new pet("A011","Dora","Female",4,"07/6/2020");
        pet pet12 = new pet("A012","Eve","Female",7,"07/10/2018");
        pet_owner owner6 = new pet_owner("C006","Maria","10/12/2003","964501210","Coimbra");
        owner6.getPetList().getPetList().add(pet11);
        owner6.getPetList().getPetList().add(pet12);

        pet pet13 = new pet("A013","Evan","Male",2,"05/10/2013");
        pet pet14 = new pet("A014","Maeli","Female",2,"05/10/2013");
        pet_owner owner7 = new pet_owner("C007","Beta","10/12/2003","964501210","Coimbra");
        owner7.getPetList().getPetList().add(pet13);
        owner7.getPetList().getPetList().add(pet14);

        pet pet15 = new pet("A015","Catarina ","Female",4,"07/6/2020");
        pet pet16 = new pet("A016","Joana","Female",7,"07/10/2018");
        pet_owner owner8 = new pet_owner("C008","Alex","10/12/2003","964501210","Coimbra");
        owner8.getPetList().getPetList().add(pet15);
        owner8.getPetList().getPetList().add(pet16);

        pet pet17 = new pet("A017","Kokas ","Male",4,"07/6/2020");
        pet pet18 = new pet("A018","Elvis","Male",7,"07/10/2018");
        pet_owner owner9 = new pet_owner("C009","Jorge","10/12/2003","964501210","Coimbra");
        owner9.getPetList().getPetList().add(pet17);
        owner9.getPetList().getPetList().add(pet18);

        pet pet19 = new pet("A019","Hulk ","Male",8,"07/6/2020");
        pet pet20 = new pet("A020","Ant","Male",2,"07/10/2018");
        pet_owner owner10 = new pet_owner("C010","Elistar","10/12/2003","964501210","Coimbra");
        owner10.getPetList().getPetList().add(pet19);
        owner10.getPetList().getPetList().add(pet20);

        pet pet21 = new pet("A021","Tenet","Male",2,"07/6/2020");
        pet pet22 = new pet("A022","Lotus","Male",3,"07/10/2018");
        pet_owner owner11 = new pet_owner("C011","Norman","10/12/2003","964501210","Coimbra");
        owner11.getPetList().getPetList().add(pet21);
        owner11.getPetList().getPetList().add(pet22);

        pet pet23 = new pet("A023","Alba","Female",2,"07/6/2020");
        pet pet24 = new pet("A024","Boris","Male",3,"07/10/2018");
        pet_owner owner12 = new pet_owner("C012","Gerson","10/12/2003","964501210","Coimbra");
        owner12.getPetList().getPetList().add(pet23);
        owner12.getPetList().getPetList().add(pet24);


        pet_owners owners = new pet_owners();
        owners.getOwnerList().add(owner1);
        owners.getOwnerList().add(owner2);
        owners.getOwnerList().add(owner3);
        owners.getOwnerList().add(owner4);
        owners.getOwnerList().add(owner5);
        owners.getOwnerList().add(owner6);
        owners.getOwnerList().add(owner7);
        owners.getOwnerList().add(owner8);
        owners.getOwnerList().add(owner9);
        owners.getOwnerList().add(owner10);
        owners.getOwnerList().add(owner11);
        owners.getOwnerList().add(owner12);


        PetOwnerJAXB ownerJAXB = new PetOwnerJAXB();
        long startTime = System.nanoTime();
        ownerJAXB.marshall(owners);
        long endTime = System.nanoTime();
        System.out.println("XML serialization: " + (endTime - startTime)/1000000 + " milliseconds");

        ownerJAXB.unmarshall();

        PetOwnerMPack ownerMPack = new PetOwnerMPack();
        startTime = System.nanoTime();
        ownerMPack.marshall(owners);
        endTime = System.nanoTime();
        System.out.println("MessagePack serialization: " + (endTime - startTime)/1000000 + " milliseconds");
    }

    public static pet_owners dataCreate(int num){
        String[] names = {"Tiago", "Miguel", "João", "Artur", "Joaquim", "Lucas", "Ricardo", "André", "Marco", "Sara", "Catarina", "Mariana",
        "Maria", "Laura", "Bruna", "Júlia", "Carolina", "Matilde","Joana", "Rita" };
        String[] surnames = {"Silva", "Santos", "Ferreira", "Pereira", "Oliveira", "Costa", "Rodrigues", "Martins", "Sousa", "Fernandes",
                "Gonçalves", "Gomes", "Lopes", "Marques", "Alves", "Almeida", "Ribeiro", "Pinto", "Carvalho", "Teixeira"};

        String[] petnames = {"Bobi", "Jojo", "Laica", "Stuart", "Cookie", "Cenoura", "Brócolo", "Cebola", "Bacalhau", "Tommy"};
        pet_owners owners = new pet_owners();

        for (int i = 0; i < num; i++) {
            pet_owner owner;
            int randomName = ThreadLocalRandom.current().nextInt(0, 20);
            int randomSurname = ThreadLocalRandom.current().nextInt(0, 20);
            owner = new pet_owner(String.valueOf(i+1),names[randomName],"02/10/1999",String.format("%09d", ThreadLocalRandom.current().nextInt(900000000, 999999999)),
                    "Coimbra");

            int petNum = ThreadLocalRandom.current().nextInt(1, 3);

            owners.getOwnerList().add(owner);
        }

        return owners;
    }
}
