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
}