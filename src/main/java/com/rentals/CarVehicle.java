package com.rentals;

public class CarVehicle {
    private String carVehicleDescription;
    private int carVehicleType; // 1: vélo électrique, 2: voiture 3p. électrique, 3: voiture 5p. électrique, 4: camping car essence, 5: fourgonnette diesel
    private double carVehiclePricePerDay;

    public CarVehicle(String description, int type, double basePricePerDay) {
        this.carVehicleDescription = description;
        this.carVehicleType = type;
        setPricePerDay(basePricePerDay);
    }

    public String getDescription() {
        return carVehicleDescription;
    }

    public int getType() {
        return carVehicleType;
    }

    public double getPricePerDay() {
        return carVehiclePricePerDay;
    }

    private void setPricePerDay(double basePricePerDay) {
        switch(this.carVehicleType) {
            case 1: this.carVehiclePricePerDay = basePricePerDay*0.25; break;
            case 2: this.carVehiclePricePerDay = basePricePerDay*0.75; break;
            case 3: this.carVehiclePricePerDay = basePricePerDay*1.0; break;
            case 4: this.carVehiclePricePerDay = basePricePerDay*2.0;break;
            case 5: this.carVehiclePricePerDay = basePricePerDay*1.25;break;
            default: throw new RuntimeException("Illegal carVehicleType value");
        }
    }
}
