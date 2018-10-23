package main.persons;

import main.animals.Animals;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;



public abstract class Employee {

    private String name;

    private List<String> materials = new ArrayList<>();

    private Double salary;

    private LocalTime startTime;
    private LocalTime endTime;

    private int family; // 1 (Mammal & Bird) or 2 (Reptile)
    private static Cage cage = new Cage(100); // Cage that contains 100 animals

    private Employee manager;

    public Employee() {

    }

    public Employee(String name, List<String> materials, Double salary, LocalTime startTime, LocalTime endTime, int f) {
        this.name = name;
        this.materials = materials;
        this.salary = salary;
        this.startTime = startTime;
        this.endTime = endTime;
        this.family = f;
    }

    public String getName() { return name; }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getMaterials(){
        return materials;
    }

    public  void setMaterials(List<String> materials){
        this.materials = materials;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }


    public LocalTime getEndTimedTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }


    public int getFamily() {
        return family;
    }

    public void setFamily(int family) {
        this.family = family;
    }

    public Cage getCage() {
        return cage;
    }

    public void setCage(Cage cage) {
        Employee.cage = cage;
    }

    public boolean accept(Animals animal){return true;};

    public void feed(Animals animal, String food){};

    public  void clean(){};

}
