package co.edu.uniquindio.poo.taller2;

class DefaultCarFactory implements CarFactory {
    @Override
    public CarBuilder createCarBuilder() {
        return new CarBuilder();
    }
}

