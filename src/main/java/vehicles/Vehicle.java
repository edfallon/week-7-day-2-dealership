package vehicles;

public abstract class Vehicle {

    private int capacity;
    private double price;
    private String colour;

    public Vehicle(int capacity, double price, String colour) {
        this.capacity = capacity;
        this.price = price;
        this.colour = colour;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }
}
