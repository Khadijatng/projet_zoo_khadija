package main.persons;

import main.animals.Animals;
import java.util.List;

public class Visitor {

    private String first_name;

    private String last_name;

    private int age;

    private double ticket_price;

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getTicket_price() {

        if(age < 12)
            return 0.0;
        else if(age <= 25)
            return 5.0;
        else
            return 10.0;
    }

    public void setTicket_price(double ticket_price) {
        this.ticket_price = ticket_price;
    }


    public void getList_animals_seen_by_visitor(Person P){

        List<Animals> L = P.getAnimals();
        for(int i = 0; i < L.size(); i++)
        {
            System.out.println(L.get(i).toString());
        }
    }
}
