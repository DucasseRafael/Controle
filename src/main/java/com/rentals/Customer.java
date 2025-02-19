package com.rentals;
import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Rental> rentals;

    public Customer(final String customerName) {
        super();
        this.name = customerName;
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
        double totalAmount = 0;
        StringBuilder result = new StringBuilder("Invoice for " + getName() + "\n");

        for (Rental rental : rentals) {
            double rentalAmount = rental.calculateRentalAmount();
            result.append("\t").append(rental.getCarVehicle().getDescription()).append("\t").append(rentalAmount).append("\n");
            totalAmount += rentalAmount;
        }

        result.append("Total amount: ").append(totalAmount);
        return result.toString();
    }

}
