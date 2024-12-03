import parkinglot.ParkingLot;
import parkinglot.vehicles.*;

public class Main {
    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot(3, 4);

        Vehicle motorcycle = new Motorcycle();
        Vehicle car = new Car();
        Vehicle van = new Van();
        Vehicle motorcycle2 = new Motorcycle();
        Vehicle motorcycle3 = new Motorcycle();

        parkingLot.displayStatus();

        System.out.println("\nParking vehicles...");
        parkingLot.parkVehicle(motorcycle);
        parkingLot.parkVehicle(car);
        parkingLot.parkVehicle(van);
        parkingLot.parkVehicle(motorcycle2);
        parkingLot.parkVehicle(motorcycle3);


        parkingLot.displayStatus();

        System.out.println("\nRemoving car...");
        parkingLot.removeVehicle(car);

        parkingLot.displayStatus();
    }
}
