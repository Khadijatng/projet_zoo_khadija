package main.persons;

import java.time.LocalTime;
import java.util.List;

public class Cleaner extends Employee {


    public Cleaner(String name, List<String> materials, Double salary, LocalTime startTime, LocalTime endTime, int f) {
        super(name, materials, salary, startTime, endTime,f);
    }

    public void clean() {
        // TODO
        if(this.getCage().getAnimalsNr() == 0)
            System.out.println("Cleaner can clean the Cage !!!");
        else
            System.out.println("Cleaner cannot clean the Cage because is not empty");
    }
}
