package main.animals;

public class Swans extends Bird {


    public Swans(String name, double poids, String HairColor) {
        super(name, poids,  HairColor);
    }

    @Override
    public String toString() { return "Swans : " + super.getName(); }

    @Override
    public String scream() { return "cry"; }
}
