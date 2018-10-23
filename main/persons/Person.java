package main.persons;

import java.util.ArrayList;
import java.util.List;
import main.animals.Animals;

public class Person {

    private List<Animals> animals = new ArrayList<Animals>();

    public List<Animals> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animals> animals) {
        this.animals = animals;
    }

    public void addAnimal(Animals animal) {
        this.animals.add(animal);
    }

}
