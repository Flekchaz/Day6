public class Bike extends Vehicle{
    public Bike(String make, String model, int rentalPrice, String licencePlate) {
        super(make, model, rentalPrice, licencePlate);
    }

    @Override
    public void displayInfo() {
        System.out.println("This is a bike");
        super.displayInfo();
    }

    @Override
    public void rent() {
        super.rent();
    }

    @Override
    public void returnedVehicle() {
        super.returnedVehicle();
    }
}
