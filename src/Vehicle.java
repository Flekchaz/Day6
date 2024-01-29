public class Vehicle {

    private String make;
    private String model;
    private int rentalPrice;

    private String licencePlate;

    private boolean isAvailable;

    public Vehicle(String make, String model, int rentalPrice, String licencePlate) {
        this.make = make;
        this.model = model;
        this.rentalPrice = rentalPrice;
        this.licencePlate = licencePlate;
        isAvailable = true;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRentalPrice() {
        return rentalPrice;
    }

    public void setRentalPrice(int rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    public String getLicencePlate() {
        return licencePlate;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
    public void rent() {
        isAvailable = false;
    }

    public void returnedVehicle() {
        isAvailable = true;
    }
    public void setLicencePlate(String licencePlate) {
        this.licencePlate = licencePlate;
    }

    public void displayInfo() {
        System.out.println("Type of the vehicle: "+getMake());
        System.out.println("Model of this vehicle: "+getModel());
    }
}
