public class Motorcycle extends Vehicle implements Rentable {
    public Motorcycle(String vehicleId, String model, double baseRentalRate) {
        super(vehicleId, model, baseRentalRate);
    }

    @Override
    public void rent(Customer customer, int days) {
        if (isAvailableForRental()) {
            setAvailable(false);
            System.out.println(getModel() + " motorcycle rented to " + customer.getName() + " for " + days + " days.");
        } else {
            System.out.println(getModel() + " motorcycle  not available for rent.");
        }
    }
//OverridE .//
    @Override
    public void returnVehicle() {
        setAvailable(true);
        System.out.println(getModel() + " motorcycle returned.");
    }

    @Override
    public double calculateRentalCost(int days) {
        return (days * getBaseRentalRate()) * 0.9; // 10% discount for motorcycles
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }
}


