package main.animals;

public class Giraffes extends Mammal {

    public Giraffes(String name, double poids, String HairColor) {
        super(name, poids, HairColor);
    }

    @Override
    public String toString() {
        return "Giraffes : " + super.getName();
    }

    @Override
    public String scream() {
        return "bleat";
    }
}
