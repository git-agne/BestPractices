package prova.java.creational_patterns.factory_method;

public class Main {
    public static void main(String[] args) {
        Vehicle v = VehicleFactory.getVehicle(6);
        //Poi si può spostare VehicleFactory in un'interfaccia e fare anche un Singleton
    }
}

class VehicleFactory
{
    public static Vehicle getVehicle(int numOfWheel) {
        switch(numOfWheel) {
            case 2:
                return new Motorbike();
            case 4:
                return new Car();
            case 6:
                return new Truck();
            default:
                throw new RuntimeException("Failed");
        }
    }
}
