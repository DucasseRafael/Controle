package com.rentals;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.assertj.core.api.Assertions.assertThat;

class CustomerTest {
    @Test
    void GettersWorkCorrectelly() {
        Customer customer = new Customer("Yann");
        assertThat(customer.getName()).isEqualTo("Yann");
    }

    @Test
    void ShouldGenerateAnInvoiceCorrectelly() {
        CarVehicle velo = new CarVehicle("Velo electrique", 1, 100.0);
        CarVehicle fourgonnette = new CarVehicle("Fourgonnette professionnelle", 5, 100.0);
        Customer customer = new Customer("Yann Carpentier");
        customer.addRental(new Rental(velo, LocalDate.of(2022, 10, 1), 2));
        customer.addRental(new Rental(fourgonnette, LocalDate.of(2022, 11, 15), 4));
        String invoice = customer.generateInvoice();
        assertThat(invoice).contains("Invoice for Yann Carpentier");
        assertThat(invoice).contains("Velo electrique\t50.0");
        assertThat(invoice).contains("Fourgonnette professionnelle\t500.0");
        assertThat(invoice).contains("Total amount: 550.0");
    }
}