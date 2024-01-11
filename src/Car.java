import java.util.Objects;

public class Car extends Vehicle{
    private String brand;

    public Car(String name, int numberOfWheels, Difficulty difficulty, String brand) {
        super(name, numberOfWheels, difficulty);
        this.brand = brand;
    }

    @Override
    public double getPrice() {
        return getNumWheels() * 1000;
    }

    @Override
    public String toString(){
        return getName() + " " + brand + "(Car)";
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (!(obj instanceof Car)) return false;
        Car car = (Car) obj;
        return Objects.equals(brand, car.brand);
    }
}
