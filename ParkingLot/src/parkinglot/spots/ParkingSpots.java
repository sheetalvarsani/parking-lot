package parkinglot.spots;

import parkinglot.vehicles.*;

public class ParkingSpots {
    private final VehicleSize spotSize;
    private Vehicle currentVehicle;

    public ParkingSpots(VehicleSize spotSize) {
        this.spotSize = spotSize;
    }

    public boolean canFitVehicle(Vehicle vehicle) {
        return switch (vehicle.getSize()) {
            case MOTORCYCLE -> true;
            case COMPACT -> spotSize == VehicleSize.COMPACT || spotSize == VehicleSize.LARGE;
            case LARGE -> spotSize == VehicleSize.LARGE;
        };
    }

    public boolean park(Vehicle vehicle) {
        if (!canFitVehicle(vehicle)) {
            return false;
        }
        currentVehicle = vehicle;
        return true;
    }

    public void leave() {
        currentVehicle = null;
    }

    public boolean isAvailable() {
        return currentVehicle == null;
    }

    public Vehicle getCurrentVehicle() {
        return currentVehicle;
    }

    public String getSpotType() {
        return spotSize.toString();
    }
}
