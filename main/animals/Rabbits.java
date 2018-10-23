package main.animals;

public class Rabbits extends Mammal {

    public Rabbits(String name, double poids, String HairColor) {
        super(name, poids, HairColor);
    }

    @Override
    public String toString() { return "Rabbits : " + super.getName(); }

    @Override
    public String scream() { return "squeak"; }
}
