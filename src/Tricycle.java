
public class Tricycle extends Vehicle{
    private String brand;

    public Tricycle(String name, int numberOfWheels, Difficulty difficulty, String brand) {
        super(name, numberOfWheels, difficulty);
        this.brand = brand;
    }

    @Override
    public double getPrice() {
        return getNumWheels() * 1000 + 1000;
    }

    @Override
    public String toString() {
        return getName() + " " + brand + "(Tricycle)";
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) return true;
        if(!(obj instanceof Tricycle)) return false;
        Tricycle tricycle = (Tricycle) obj;
        return brand.equals(tricycle.brand);
    }
}
