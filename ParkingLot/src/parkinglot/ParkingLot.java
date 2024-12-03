package parkinglot;

import parkinglot.spots.*;
import parkinglot.vehicles.*;
import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private List<ParkingSpots> spots;

    public ParkingLot(int compactSpots, int largeSpots) {
        spots = new ArrayList<>();
        for (int i = 0; i < compactSpots; i++) {
            spots.add(new ParkingSpots(VehicleSize.COMPACT));
        }
        for (int i = 0; i < largeSpots; i++) {
            spots.add(new ParkingSpots(VehicleSize.LARGE));
        }
    }

    public void displayStatus() {
        System.out.println("\nParking Lot Status:");
        for (int i = 0; i < spots.size(); i++) {
            ParkingSpots spot = spots.get(i);
            String status = spot.isAvailable() ? "Available" : "Occupied by " + spot.getCurrentVehicle().getClass().getSimpleName();
            System.out.println("Spot " + (i + 1) + " (" + spot.getSpotType() + "): " + status);
        }
    }

    public int countAvailableSpots() {
        int count = 0;
        for (ParkingSpots spot : spots) {
            if (spot.isAvailable()) {
                count++;
            }
        }
        return count;
    }

    public boolean parkVehicle(Vehicle vehicle) {
        int spotsNeeded = vehicle.getSpotsNeeded();
        int consecutiveSpots = 0;

        for (int i = 0; i < spots.size(); i++) {
            ParkingSpots spot = spots.get(i);

            if (spot.isAvailable() && spot.canFitVehicle(vehicle)) {
                consecutiveSpots++;
            } else {
                consecutiveSpots = 0;
            }

            if (consecutiveSpots == spotsNeeded) {
                for (int j = i - spotsNeeded + 1; j <= i; j++) {
                    spots.get(j).park(vehicle);
                }
                return true;
            }
        }
        return false;
    }


    public boolean removeVehicle(Vehicle vehicle) {
        boolean removed = false;
        for (ParkingSpots spot : spots) {
            if (spot.getCurrentVehicle() == vehicle) {
                spot.leave();
                removed = true;
            }
        }
        return removed;
    }

    public boolean isFull() {
        for (ParkingSpots spot : spots) {
            if (spot.isAvailable()) {
                return false;
            }
        }
        return true;
    }

    public boolean isEmpty() {
        for (ParkingSpots spot : spots) {
            if (!spot.isAvailable()) {
                return false;
            }
        }
        return true;
    }


}