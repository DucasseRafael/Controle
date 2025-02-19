package com.rentals;
import java.time.LocalDate;
public class Rental {
    private CarVehicle carVehicle;
    private LocalDate startDate;
    private int durationInDays;

    public Rental(CarVehicle carVehicle, LocalDate startDate, int durationInDays) {
        this.carVehicle = carVehicle;
        this.startDate = startDate;
        this.durationInDays = durationInDays;
    }

    public CarVehicle getCarVehicle() {
        return carVehicle;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public int getDurationInDays() {
        return durationInDays;
    }

    public double calculateRentalAmount() {
        double dailyRate = getCarVehicle().getPricePerDay();
        int duration = getDurationInDays();

        return dailyRate * duration;
    }
}