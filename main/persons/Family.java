package main.persons;

import main.animals.Animals;

public class Family {

    public enum M_B{Mammal, Bird}
    public enum R{Reptile}

    public boolean accept(Animals animal,int f) {
        // AnimaKeeper can only deal with certain animal families.

        switch (f){
            case 1:
                for (M_B A : M_B.values()) {
                    //System.out.println(A.toString() + " " + animal.getClass().getSuperclass().getSimpleName());
                    if (A.toString().equals(animal.getClass().getSuperclass().getSimpleName()))
                        return true;
                }
                break;
            case 2:
                for (R A : R.values()) {
                    if(A.toString().equals(animal.getClass().getSuperclass().getSimpleName()))
                        return  true;

                }
                break;
        }

        return false;
    }

}
