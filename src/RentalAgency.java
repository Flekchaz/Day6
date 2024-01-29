import java.util.ArrayList;

public class RentalAgency {

    //Create a RentalAgency class that can manage a fleet of vehicles.
    //Implement methods to add a vehicle, rent a vehicle, and display available vehicles.
    //Use polymorphism to allow different types of vehicles to be rented.
    ArrayList<Vehicle> vehicles = new ArrayList<>();

    public RentalAgency(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void rentVehicle(String licencePlate) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getLicencePlate().equals(licencePlate) && vehicle.isAvailable()) {
                vehicle.rent();
                System.out.println("Vehicle available, here is the licence plate of it : "
                                                  + vehicle.getLicencePlate());
                return;
            } else {
                System.out.println("No vehicle available for this moment regarding this licence plate: ");
            }
        }

    }

    public void displayVehicles() {
        System.out.println("Here is a list of the fleet of vehicles disposed");
        System.out.println("\n");
        for (Vehicle vehicle : vehicles) {
            if (vehicle.isAvailable()) {
                vehicle.displayInfo();
                System.out.println("------------------------------------------");
            }
        }
    }
}
