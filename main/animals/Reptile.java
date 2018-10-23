package main.animals;

public abstract class Reptile implements Animals {

    private String name;
    private double poids;
    private int eatCount;
    private int drinkCount;

    //Add other attributes

    private String Poisonous; //le poison chez les reptils : une différence avec les mamifères et les oiseaux

    // constructor
    public Reptile(String name, double poids, String Poisonous){
        this.name = name;
        this.poids = poids;
        this.Poisonous = Poisonous;
        this.eatCount = 0;
        this.drinkCount = 0;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    public int getEatCount() {

        return eatCount;
    }

    public void setEatCount(int eatCount) {

        this.eatCount = eatCount;
    }


    public int getDrinkCount() {

        return drinkCount;
    }

    public void setDrinkCount(int drinkCount) {

        this.drinkCount = drinkCount;
    }


    public String getPoisonous() {
        return Poisonous;
    }

    public void setPoisonous(String poisonous) {
        Poisonous = poisonous;
    }

    public String toString() {

        return getName();
    }

    public void eat(String food) {

        this.eatCount++;
    }

    public  void drink(){
        this.drinkCount++;
    }

    public abstract String scream();
}
