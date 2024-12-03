import parkinglot.vehicles.*;

import parkinglot.spots.*;

public class Main {
    public static void main(String[] args) {
        Vehicle motorcycle = new Motorcycle();
        Vehicle car = new Car();
        Vehicle van = new Van();

        System.out.println("Motorcycle needs spots: " + motorcycle.getSpotsNeeded());
        System.out.println("Car needs spots: " + car.getSpotsNeeded());
        System.out.println("Van needs spots: " + van.getSpotsNeeded());

        ParkingSpots compactSpot = new ParkingSpots(VehicleSize.COMPACT);

        System.out.println("Car can park in compact spot: " + compactSpot.canFitVehicle(car));
        System.out.println("Motorcycle can park in compact spot: " + compactSpot.canFitVehicle(motorcycle));
        System.out.println("Van can park in compact spot: " + compactSpot.canFitVehicle(van));

    }
}
