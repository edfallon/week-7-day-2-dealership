package vehicles;

import com.sun.xml.internal.ws.api.pipe.Engine;

public class Car extends Vehicle {

    public Car(int capacity, double price, String colour, Engine engine) {
        super(capacity, price, colour);
    }
}
