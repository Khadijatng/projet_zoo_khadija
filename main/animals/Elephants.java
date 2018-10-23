package main.animals;

public class Elephants extends Mammal {

    public Elephants(String name, double poids, String HairColor) {
        super(name, poids, HairColor);
    }

    @Override
    public String toString(){
        return "Elephants : " + super.getName();
    }

    @Override
    public String scream() {
        return "trumpet";
    }
}
