package com.rentals;

import org.assertj.core.api.AbstractStringAssert;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.assertj.core.api.Assertions.assertThat;

class CustomerTest {

    @Test
    void GettersWorkCorrectelly() {
        final Customer customer = new Customer("Yann");
        assertThat(customer.getName()).isEqualTo("Yann");
    }

    @Test
    void ShouldGenerateAnInvoiceCorrectelly() {
        final CarVehicle velo = new CarVehicle("Velo electrique", 1, 100.0);
        final CarVehicle fourgonnette = new CarVehicle("Fourgonnette professionnelle", 5, 100.0);
        final Customer customer = new Customer("Yann Carpentier");
        customer.addRental(new Rental(velo, LocalDate.of(2022, 10, 1), 2));
        customer.addRental(new Rental(fourgonnette, LocalDate.of(2022, 11, 15), 4));
        final String invoice = customer.generateInvoice();

        AbstractStringAssert<?> assertThatString = assertThat(invoice);
        assertThatString.contains("Invoice for Yann Carpentier");
        assertThatString.contains("Velo electrique\t50.0");
        assertThatString.contains("Fourgonnette professionnelle\t500.0");
        assertThatString.contains("Total amount: 550.0");
    }
}