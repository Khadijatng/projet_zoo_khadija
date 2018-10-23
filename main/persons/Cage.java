package main.persons;
import main.animals.Animals;

import java.util.ArrayList;
import java.util.List;

public class Cage {

    private List<Animals> animal = new ArrayList<>();
    private int placeNr;

    public Cage(int place) {
        this.placeNr = place;
    }

    public int getCageNr() {
        return this.placeNr;
    }

    public int getAnimalsNr(){
        return animal.size();
    }

    public void putAnimal(Animals a,int f) {
        Family F = new Family();
        if(animal.size() < placeNr && F.accept(a,f))
        {
            animal.add(a);

        }
        else
            System.out.println("Full cage !!!");
    }

    public void outAnimals(int f)
    {
        Family F = new Family();
        for(int i = 0; i < animal.size(); i++)
        {
            System.out.println( animal.get(i).toString());
            if(F.accept(animal.get(i),f))
            {
                System.out.println("OUT -- " + animal.get(i).toString());
                animal.remove(i);
                i = i -1;
            }
            else
            {
                System.out.println("NO -- " + animal.get(i).toString());
            }
        }
    }

    public void printAnimalsinCage(){
        System.out.println("List of Animals in Cage : ");
        for(int i = 0; i < animal.size(); i++)
            System.out.println(animal.get(i).toString());
    }

}
