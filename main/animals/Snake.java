package main.animals;

public class Snake extends Reptile {

    public Snake(String name, double poids, String Poisonous) {
        super(name, poids, Poisonous);
    }

    @Override
    public String toString() {
        return "Snake : " + super.getName();
    }

    @Override
    public String scream() {
        return "hiss";
    }
}
