package main.animals;

public class Dog extends Mammal {

    public Dog(String name, double poids, String HairColor) {
        super(name, poids, HairColor);
    }

    @Override
    public String toString() {
        return "Dog : " + super.toString();
    }

    @Override
    public String scream() {
        return "Woof";
    }

}
