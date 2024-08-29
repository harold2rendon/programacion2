package co.edu.uniquindio.poo.taller2;

public class Car {
    private String engine;
    private String transmission;
    private int wheels;
    private String color;
    private boolean airConditioning;

    Car(String engine, String transmission, int wheels, String color, boolean airConditioning) {
        this.engine = engine;
        this.transmission = transmission;
        this.wheels = wheels;
        this.color = color;
        this.airConditioning = airConditioning;
    }

    public String getEngine() {
        return engine;
    }

    public String getTransmission() {
        return transmission;
    }

    public int getWheels() {
        return wheels;
    }

    public String getColor() {
        return color;
    }

    public boolean hasAirConditioning() {
        return airConditioning;
    }

    @Override
    public String toString() {
        return "Car [engine=" + engine + ", transmission=" + transmission + ", wheels=" + wheels 
            + ", color=" + color + ", airConditioning=" + airConditioning + "]";
    }
}

