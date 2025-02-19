package com.rentals;
import java.util.ArrayList;
import java.util.List;
public class Customer {
    private final com.rentals.generateInvoice generateInvoice = new generateInvoice(this);
    private String name;
    private List<Rental> rentals;

    public Customer(String name) {
        this.name = name;
        this.rentals = new ArrayList<>();
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public String getName() {
        return name;
    }

    public List<Rental> getRentals() {
        return rentals;
    }

    public String generateInvoice() {

        return generateInvoice.generateInvoice();
    }

    public double calculateRentalAmount(Rental rental) {
        double dailyRate = rental.getCarVehicle().getPricePerDay();
        int duration = rental.getDurationInDays();

        return dailyRate * duration;
    }
}
