public class Car extends Vehicle{

    public Car(String make, String model, int rentalPrice, String licencePlate) {
        super(make, model, rentalPrice, licencePlate);
    }

    @Override
    public void displayInfo() {
        System.out.println("This is a car");
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
