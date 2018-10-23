package main.persons;

import main.animals.Animals;

import java.time.LocalTime;
import java.util.List;

public class Vet<T extends Animals> extends Employee {

    public Vet(String name, List<String> materials, Double salary, LocalTime startTime, LocalTime endTime, int f) {
        super(name, materials, salary, startTime, endTime,f);
    }

    public void cure(T animal) {
        // TODO
        System.out.println("The animal " + animal.getClass().getSimpleName() + " is from the " + animal.getClass().getSuperclass().getSimpleName() + " family and and he be become healthy");
    }

    public void checkHealth(T animal) {
        // TODO
        System.out.println(this.getName() + "("  + this.getFamily() + ")" + " check the heallth of " + animal.getClass().getSimpleName() + " which is from the " + animal.getClass().getSuperclass().getSimpleName() + " family");

    }

}
