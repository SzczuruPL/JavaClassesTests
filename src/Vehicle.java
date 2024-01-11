


public abstract class Vehicle {
    protected String name;
    protected int numWheels;
    protected Difficulty difficulty;

    public enum Difficulty {
        EASY, MEDIUM, HARD
    }

    public Vehicle(String name, int numWheels, Difficulty difficulty) {
        this.name = name;
        this.numWheels = numWheels;
        this.difficulty = difficulty;
    }

    public abstract double getPrice();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }
}

