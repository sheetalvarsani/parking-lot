# **Parking Lot Management System**

## **Overview**
The Parking Lot Management System is a Java-based simulation of a parking lot. It allows for the management of parking spaces and vehicles, supporting different types of vehicles and parking spot configurations. This system handles dynamic parking allocation, status display, and vehicle removal in a user-friendly manner.


## **Features**
- **Dynamic Parking Allocation**:
  - Supports parking for motorcycles, cars, and vans.
  - Allocates consecutive parking spots for larger vehicles (e.g., vans).
- **Parking Spot Types**:
  - Two spot types: `COMPACT` and `LARGE`, catering to vehicles of different sizes.
- **Status Display**:
  - Provides a detailed view of parking spot occupancy and type (`COMPACT` or `LARGE`).
- **Efficient Spot Management**:
  - Counts available spots and checks if the lot is full or empty.
  - Handles parking and removing vehicles.



## **Getting Started**

### **Prerequisites**
- Java Development Kit (JDK) 8 or higher.
- Any Java-compatible IDE (e.g., IntelliJ IDEA, Eclipse).

### **Installation**

1. Clone this repository to your local machine:

   ```bash
   git clone https://github.com/sheetalvarsani/parking-lot-management-system.git
   ```

2. Open the project in your preferred IDE.

3. Build the project to resolve dependencies and compile the code.


### **Usage**
- Navigate to the `Main` class to run the application.
- Configure the parking lot by specifying the number of compact and large spots in the `ParkingLot` initialization.
- Add vehicles (Motorcycle, Car, Van) and test parking, removal, and status display.
