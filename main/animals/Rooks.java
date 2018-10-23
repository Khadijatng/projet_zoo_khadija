package main.animals;

public class Rooks extends Bird {

    public Rooks(String name, double poids, String HairColor) {
        super(name, poids, HairColor);
    }

    @Override
    public String toString() {
        return "Rooks : " + super.getName();
    }

    @Override
    public String scream() { return "caw"; }

}
