package co.edu.uniquindio.poo.taller2;

public class Main {
    public static void main(String[] args) {
        CarFactory carFactory = new DefaultCarFactory();
        
        CarBuilder sedanBuilder = carFactory.createCarBuilder();
        Car sedan = sedanBuilder.setEngine("V6")
        .setTransmission("Automatica")
        .setWheels(4)
        .setColor("rojo")
        .setAirConditioning(true)
        .build();
        
        CarBuilder sportsCarBuilder = carFactory.createCarBuilder();
        Car sportsCar = sportsCarBuilder
        .setEngine("V8")
        .setTransmission("Manual")
        .setWheels(4)
        .setColor("azul")
        .setAirConditioning(false)
        .build();

        System.out.println(sedan);
        System.out.println(sportsCar);
    }
}
