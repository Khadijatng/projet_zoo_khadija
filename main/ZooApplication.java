package main;

import main.animals.*;
import main.persons.*;
import javax.swing.*;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class ZooApplication {

    private static final String ZOO_NAME = "PARIDAIZA";

    public static void main(String[] args) {


        int i;

        System.out.println("************************");
        System.out.println("Welcome to " + ZOO_NAME);
        System.out.println("************************");


        Animals felix = new Cat("Felix", 5,"white");
        Animals rex = new Dog("Rex", 10,"Black");
        Animals gaia = new Dog("Gaia",15,"white");
        Animals loxodonta  = new Elephants("Loxodonta", 1000,"Gris");
        Animals  kordofan = new Giraffes("Kordofan",300, "G");
        Animals  oreo = new Rabbits("Oreo", 5,"White");

        Animals dragoon = new Pigeons("Dragoon",1,"Gris");
        Animals  corvidae = new Rooks("Corvidae", 1,"Black");
        Animals  black_necked = new Swans("Black-necked",5,"Black-white");
        Animals  white_backed = new Vultures("White-backed",5,"Gris-black-white");

        Animals cobra = new Snake("cobra", 1, "Black");

        Person toto = new Person();

        toto.addAnimal(rex);
        toto.addAnimal(gaia);
        toto.addAnimal(felix);
        toto.addAnimal(loxodonta);
        toto.addAnimal(kordofan);
        toto.addAnimal(dragoon);
        toto.addAnimal(oreo);
        toto.addAnimal(corvidae);
        toto.addAnimal(black_necked);
        toto.addAnimal(white_backed);
        toto.addAnimal(cobra);


        System.out.println("Animals of toto");
        for (i = 0; i < toto.getAnimals().size(); i++) {
            Animals animal = toto.getAnimals().get(i);
            switch (animal.getClass().getSimpleName()) {
                case "Cat":
                    System.out.println(animal.toString() + " /   Eat count: " + ((Cat)animal).getEatCount());
                    break;
                case "Dog":
                    System.out.println(animal.toString() + " /   Eat count: " + ((Dog)animal).getEatCount());
                    break;
                case "Snake":
                    System.out.println(animal.toString() + " /   Eat count: " + ((Snake)animal).getEatCount());
                    break;
                case "Elephants":
                    System.out.println(animal.toString() + " /   Eat count: " + ((Elephants)animal).getEatCount());
                    break;
                case "Giraffes":
                    System.out.println(animal.toString() + " /   Eat count: " + ((Giraffes)animal).getEatCount());
                    break;
                case "Pigeons":
                    System.out.println(animal.toString() + " /   Eat count: " + ((Pigeons)animal).getEatCount());
                    break;
                case "Rabbits":
                    System.out.println(animal.toString() + " /   Eat count: " + ((Rabbits)animal).getEatCount());
                    break;
                case "Rooks":
                    System.out.println(animal.toString() + " /   Eat count: " + ((Rooks)animal).getEatCount());
                    break;
                case "Swans":
                    System.out.println(animal.toString() + " /   Eat count: " + ((Swans)animal).getEatCount());
                    break;
                case "Vultures":
                    System.out.println(animal.toString() + " /   Eat count: " + ((Vultures)animal).getEatCount());
                    break;
            }

        }

        System.out.println("**********************************************************************************");


        List<String> L = new ArrayList<String>();

        L.add("civière");
        L.add("chenil");
        L.add("dressage");
        L.add("Cagnotte");
        L.add("Costume de protection");


        AnimalKeeper keeper_A = new AnimalKeeper();
        AnimalKeeper keeper_B = new AnimalKeeper();

        //keeper A and B informations
        keeper_A.setName("Titi");
        keeper_A.setSalary(1200.0);
        keeper_A.setStartTime(LocalTime.of(6, 00, 00));
        keeper_A.setEndTime(LocalTime.of(18,00,00));
        keeper_A.setMaterials(L);
        keeper_A.setFamily(1);

        L.add("example");


        keeper_B.setName("Toto");
        keeper_B.setSalary(1400.0);
        keeper_B.setStartTime(LocalTime.of(18, 00, 00));
        keeper_B.setEndTime(LocalTime.of(6,00,00));
        keeper_B.setMaterials(L);
        keeper_B.setFamily(2);

        //Animal dog = new Dog();
        //System.out.println(dog.getEatCount());
        //keeper.feed(dog, "steak");
        //System.out.println(dog.getEatCount());


        // keeper add the animal to cage
        keeper_A.addAnimalToCage(rex);
        keeper_A.addAnimalToCage(gaia);
        keeper_A.addAnimalToCage(felix);
        keeper_A.addAnimalToCage(loxodonta);
        keeper_A.addAnimalToCage(kordofan);
        keeper_A.addAnimalToCage(dragoon);
        keeper_A.addAnimalToCage(oreo);
        keeper_A.addAnimalToCage(corvidae);
        keeper_A.addAnimalToCage(black_necked);
        keeper_A.addAnimalToCage(white_backed);
        //keeper_A.addAnimalToCage(cobra); // we can not add cobra by keeper A
        keeper_B.addAnimalToCage(cobra);  // we use the keeper B to add snake beacuse it inclus on the Reptile family

        System.out.println("Number animals in Cage : " + keeper_A.getCage().getAnimalsNr());
        keeper_B.getCage().printAnimalsinCage(); // the Cage varaible is in mode static
        // keeper A
        System.out.println("Keeper " + keeper_A.getName() +" puts food for animals !!!");

        // cat food
        keeper_A.feed(felix, "milk");
        keeper_A.feed(felix,"fish");
        keeper_A.feed(felix, "milk");

        // dog food
        keeper_A.feed(rex, "steak");
        keeper_A.feed(gaia,"steak");


        // Elephants food

        keeper_A.feed(loxodonta,"small plants");
        keeper_A.feed(loxodonta,"fruit");
        keeper_A.feed(loxodonta," twigs");
        keeper_A.feed(loxodonta,"fruit");
        keeper_A.feed(loxodonta,"tree bark");
        keeper_A.feed(loxodonta,"roots");

        //Giraffes food

        keeper_A.feed(kordofan,"Acacia nilotica");
        keeper_A.feed(kordofan,"water");
        keeper_A.feed(kordofan,"Acacia nilotica");
        keeper_A.feed(kordofan,"Acacia nilotica");
        keeper_A.feed(kordofan,"water");


        // Rabbits food fresh hay, grass, and plenty of clean water

        keeper_A.feed(oreo,"fresh hay");
        keeper_A.feed(oreo,"grass");
        keeper_A.feed(oreo,"plenty clean water");
        keeper_A.feed(oreo,"Carrot");



        // Pigerons food

        keeper_A.feed(dragoon,"barley");
        keeper_A.feed(dragoon,"corn");
        keeper_A.feed(dragoon,"millet");
        keeper_A.feed(dragoon,"wheat");
        keeper_A.feed(dragoon,"water");

        // Rooks food

        keeper_A.feed(corvidae,"fruit");
        keeper_A.feed(corvidae,"small mammals");
        keeper_A.feed(corvidae,"acorns");
        keeper_A.feed(corvidae,"young");
        keeper_A.feed(corvidae,"small birds");
        keeper_A.feed(corvidae,"carrion");

        // Swans food

        keeper_A.feed(black_necked,"worms");
        keeper_A.feed(black_necked,"small fish");
        keeper_A.feed(black_necked,"frogs");

        // Vultures food

        keeper_A.feed(white_backed,"flesh of buffalo carcass");


        // Snake food

        keeper_A.feed(cobra,"fish");
        keeper_B.feed(cobra,"termites");
        keeper_B.feed(cobra,"worms");


        System.out.println("**********************************************************************************");

        System.out.println("Animals of toto");
        for (i = 0; i < toto.getAnimals().size(); i++) {
            Animals animal = toto.getAnimals().get(i);
            switch (animal.getClass().getSimpleName()) {
                case "Cat":
                    System.out.println(animal.toString() + " /   Eat count: " + ((Cat)animal).getEatCount());
                    break;
                case "Dog":
                    System.out.println(animal.toString() + " /   Eat count: " + ((Dog)animal).getEatCount());
                    break;
                case "Snake":
                    System.out.println(animal.toString() + " /   Eat count: " + ((Snake)animal).getEatCount());
                    break;
                case "Elephants":
                    System.out.println(animal.toString() + " /   Eat count: " + ((Elephants)animal).getEatCount());
                    break;
                case "Giraffes":
                    System.out.println(animal.toString() + " /   Eat count: " + ((Giraffes)animal).getEatCount());
                    break;
                case "Pigeons":
                    System.out.println(animal.toString() + " /   Eat count: " + ((Pigeons)animal).getEatCount());
                    break;
                case "Rabbits":
                    System.out.println(animal.toString() + " /   Eat count: " + ((Rabbits)animal).getEatCount());
                    break;
                case "Rooks":
                    System.out.println(animal.toString() + " /   Eat count: " + ((Rooks)animal).getEatCount());
                    break;
                case "Swans":
                    System.out.println(animal.toString() + " /   Eat count: " + ((Swans)animal).getEatCount());
                    break;
                case "Vultures":
                    System.out.println(animal.toString() + " /   Eat count: " + ((Vultures)animal).getEatCount());
                    break;
                case "default":
                    break;
            }

        }

        System.out.println("**********************************************************************************");

        List<String> L_c = new ArrayList<String>();

        L_c.add("Trousse de secours");
        L_c.add("Civière d'urgence");
        L_c.add("Brancard souple");
        L_c.add("sac morts");

        Employee c1 = new Cleaner("Christophe",L_c,1000.00,LocalTime.of(8, 00, 00),
                LocalTime.of(18, 00, 00),3);

        // To clean we want to out all animals from cage using keeper A and B
        System.out.println("Number animals in Cage : " + keeper_A.getCage().getAnimalsNr());
        keeper_A.getCage().outAnimals(keeper_A.getFamily());
        System.out.println("Number animals in Cage : " + keeper_A.getCage().getAnimalsNr());
        c1.clean();
        keeper_B.getCage().outAnimals(keeper_B.getFamily());
        System.out.println("Number animals in Cage : " + keeper_A.getCage().getAnimalsNr());
        c1.clean();


        System.out.println("**********************************************************************************");



        Visitor v1 =new Visitor();

        v1.setAge(24);
        v1.setFirst_name("Fadel");
        v1.setLast_name("ABDALLAH");
        System.out.println("Infomation about visitor " + v1.getFirst_name() +" " + v1.getLast_name());
        System.out.println("Age : " + v1.getAge());
        System.out.println("Ticket price : " + v1.getTicket_price());
        System.out.println("List animals seen :");
        v1.getList_animals_seen_by_visitor(toto);

        System.out.println("**********************************************************************************");

        List<String> L_vet = new ArrayList<String>();

        L_vet.add("Trousse de secours");
        L_vet.add("Civière d'urgence");
        L_vet.add("Brancard souple");
        L_vet.add("sac morts");


        System.out.println("The Vets : ");
        Vet<Mammal> Vet_Mammal = new Vet<Mammal>("Fred",L_vet,1500.68,LocalTime.of(8, 00, 00),
                LocalTime.of(18, 00, 00),1);
        Vet<Reptile> Vet_Reptile = new Vet<Reptile>("Alex",L_vet,1500.68,LocalTime.of(8, 00, 00),
                LocalTime.of(18, 00, 00),1);
        Vet<Bird> Vet_Bird = new Vet<Bird>("Sara",L_vet,1500.68,LocalTime.of(8, 00, 00),
                LocalTime.of(18, 00, 00),2);

        System.out.println(Vet_Mammal.getName() + " -> Mammal");
        System.out.println(Vet_Reptile.getName() + " -> Reptile");
        System.out.println(Vet_Bird.getName() + " -> Bird");


        Vet_Mammal.checkHealth((Mammal) rex);
        Vet_Mammal.cure((Mammal) rex);
        System.out.println("");
        Vet_Reptile.checkHealth((Reptile) cobra);
        Vet_Reptile.cure((Reptile) cobra);
        System.out.println("**********************************************************************************");



        /*


        System
        List_of_Animal L[] = List_of_Animal.values();

       if(L[0].inList(rex))
           System.out.println(rex.toString());

        if(L.inList(loxodonta))
            System.out.println(loxodonta.toString());

     */
        // Vet V = new Vet();
    }
}
