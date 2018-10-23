package main.animals;

public class Cat extends Mammal {

    public Cat(String name, double poids, String HairColor) {

        super(name, poids, HairColor);
    }

    @Override
    public String toString() {
        return "Cat : " + super.getName();
    }

    @Override
    public String scream() { return "Miaou"; }

}
