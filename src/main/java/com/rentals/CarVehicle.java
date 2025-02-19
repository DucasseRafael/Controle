package com.rentals;

public class CarVehicle {
    private static final double CONSTANT025 = 0.25;
    public static final double CONSTANT075 = 0.75;
    private static final double CONSTANT200 = 2.0;
    private static final double CONSTANT125 = 1.25;
    private String carVehicleDescription;
    private int carVehicleType; // 1: vélo électrique, 2: voiture 3p. électrique, 3: voiture 5p. électrique, 4: camping car essence, 5: fourgonnette diesel
    private double carVehiclePricePerDay;

    /** Constroctor Class CarVehicle
     * @param description
     * @param type
     * @param basePricePerDay
     */

    public CarVehicle(final String description, final int type, final double basePricePerDay) {
        super();
        this.carVehicleDescription = description;
        this.carVehicleType = type;
        this.setPricePerDay(basePricePerDay);
    }

    /** getter getDescription
     * @return vehicle description
     */
    public  String getDescription() {
        return this.carVehicleDescription;
    }

    /** getter getType
     * @return vehicle type
     */
    public  int getType() {
        return this.carVehicleType;
    }

    /** getter PricePerDay
     * @return car PricePerDay
     */
    public double getPricePerDay() {
        return this.carVehiclePricePerDay;
    }

    /** Set PricePerDay based on the basePricePerDay
     * @param basePricePerDay
     */
    private void setPricePerDay(final double basePricePerDay) {
        switch(this.carVehicleType) {
            case 1: this.carVehiclePricePerDay = basePricePerDay* CarVehicle.CONSTANT025; break;
            case 2: this.carVehiclePricePerDay = basePricePerDay* CarVehicle.CONSTANT075; break;
            case 3: this.carVehiclePricePerDay = basePricePerDay; break;
            case 4: this.carVehiclePricePerDay = basePricePerDay* CarVehicle.CONSTANT200;break;
            case 5: this.carVehiclePricePerDay = basePricePerDay* CarVehicle.CONSTANT125;break;
            default: throw new RuntimeException("Illegal carVehicleType value");
        }
    }
}
