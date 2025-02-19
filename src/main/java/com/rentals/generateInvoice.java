package com.rentals;

public class generateInvoice {
    private final Customer customer;

    public generateInvoice(Customer customer) {
        this.customer = customer;
    }

    public String generateInvoice() {
        double totalAmount = 0;
        StringBuilder result = new StringBuilder("Invoice for " + customer.getName() + "\n");

        for (Rental rental : customer.getRentals()) {
            double rentalAmount = customer.calculateRentalAmount(rental);
            result.append("\t").append(rental.getCarVehicle().getDescription()).append("\t").append(rentalAmount).append("\n");
            totalAmount += rentalAmount;
        }

        result.append("Total amount: ").append(totalAmount);
        return result.toString();
    }
}