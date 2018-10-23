package main.animals;

public class Pigeons extends Bird{

    public Pigeons(String name, double poids, String HairColor) {
        super(name, poids, HairColor);
    }

    @Override
    public String toString() { return "Pigeons : " + super.getName(); }

    @Override
    public String scream() { return "coo"; }
}
