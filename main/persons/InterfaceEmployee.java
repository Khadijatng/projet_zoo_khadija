package main.persons;

import main.animals.Animals;

public interface InterfaceEmployee {

    boolean accept(Animals animal);

    void feed(Animals animal, String food);

    void clean();
}
