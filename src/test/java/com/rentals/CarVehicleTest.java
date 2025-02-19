package com.rentals;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class CarVehicleTest {
    @Test
    void getterWorksCorrectelly() {
        CarVehicle vehicle = new CarVehicle("Super vélo à selle confortable", 1, 100.0);
        assertThat(vehicle.getDescription()).isEqualTo("Super vélo à selle confortable");
        assertThat(vehicle.getType()).isEqualTo(1);
    }
    @Test
    void calculatePricePerDayWorkCorrectellyForTypesCarsVehiclesCorrects() {
        CarVehicle vehicle1 = new CarVehicle("Super vélo à selle confortable", 1, 100.0);
        CarVehicle vehicle2 = new CarVehicle("Voiture sportive", 2, 100.0);
        CarVehicle vehicle3 = new CarVehicle("Voiture familiale", 3, 100.0);
        CarVehicle vehicle4 = new CarVehicle("Camping car 6 places", 4, 100.0);
        CarVehicle vehicle5 = new CarVehicle("Fourgonnette professionnelle", 5, 100.0);

        assertThat(vehicle1.getPricePerDay()).isEqualTo(25.0);
        assertThat(vehicle2.getPricePerDay()).isEqualTo(75.0);
        assertThat(vehicle3.getPricePerDay()).isEqualTo(100.0);
        assertThat(vehicle4.getPricePerDay()).isEqualTo(200.0);
        assertThat(vehicle5.getPricePerDay()).isEqualTo(125.0);
    }
}