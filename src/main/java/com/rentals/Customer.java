package com.rentals;
import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Rental> rentals;

    /** Constructor Class Customer
     * @param customerName
     */
    public Customer(final String customerName) {
        super();
        this.name = customerName;
        this.rentals = new ArrayList<>();
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    /** Getter name
     * @return name of the customer
     */
    public String getName() {
        return name;
    }

    /** getter list of rentals
     * @return list of rentals of the customers
     */
    public List<Rental> getRentals() {
        return rentals;
    }

    /** Method who create the invoice based by the customers and his rentals
     * @return a string who contains the amount the customer have to pay
     */
    public String generateInvoice() {
        double totalAmount = (double) 0;
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
