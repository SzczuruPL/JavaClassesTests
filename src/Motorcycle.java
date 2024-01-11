

public class Motorcycle extends Vehicle{
    private String brand;

    public Motorcycle(String name, int numberOfWheels, Difficulty difficulty, String brand) {
        super(name, numberOfWheels, difficulty);
        this.brand = brand;
    }

    @Override
    public double getPrice() {
        return getNumWheels() * 1000 + 3000;
    }

    @Override
    public String toString() {
        return getName() + " " + brand + "(Motorcycle)";
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) return true;
        if(!(obj instanceof Motorcycle)) return false;
        Motorcycle motorcycle = (Motorcycle) obj;
        return brand.equals(motorcycle.brand);
    }
}
