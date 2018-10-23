package main.persons;
import main.animals.Animals;

import java.time.LocalTime;
import java.util.List;

public class AnimalKeeper extends Employee {




    public AnimalKeeper() {
    }

    public AnimalKeeper(String name, List<String> materials, Double salary, LocalTime startTime, LocalTime endTime, int f) {
        super(name, materials, salary, startTime, endTime, f);

    }


    public void addAnimalToCage(Animals a) {
        //the same method as above minus the user input
        //which needs to be done somewhere else
        this.getCage().putAnimal(a,this.getFamily());
    }

    public void outAnimalsfromCage(int f) {
        //the same method as above minus the user input
        //which needs to be done somewhere else
        this.getCage().outAnimals(f);
    }

    public void feed(Animals animal, String food) {
        Family F = new Family();
        if (food != null && !food.equals("child") && F.accept(animal,this.getFamily()) ) {
            animal.eat(food);
        }

    }
}
