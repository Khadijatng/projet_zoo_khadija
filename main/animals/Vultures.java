package main.animals;

public class Vultures extends Bird {

    public Vultures(String name, double poids, String HairColor) {
        super(name, poids, HairColor);
    }

    @Override
    public String toString() { return "Vultures : " + super.getName(); }

    @Override
    public String scream() { return "scream"; }
}
