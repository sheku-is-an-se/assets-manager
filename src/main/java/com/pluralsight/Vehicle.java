package com.pluralsight;

import java.time.LocalDate;

public class Vehicle extends Asset {
    String makeModel;
    int year;
    int odometer;

    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }
    @Override
    public double getValue(){
        LocalDate today = LocalDate.now();
        int currentYear = today.getYear();
        int age = currentYear - this.year;
        double original = getOriginalCost();
        double value;
        if (age <= 3) {
            value = original - (age * 0.03 * original);
        } else if (age <= 6) {
            value = original - (age * 0.06 * original);
        } else if (age <= 10) {
            value = original - (age * 0.08 * original);
        } else {
            value = 1000.0;
        }

        if (this.odometer > 100000) {
            boolean isHondaOrToyota =
                    this.makeModel.contains("Honda") || this.makeModel.contains("Toyota");

            if (!isHondaOrToyota) {
                value = value * 0.75;  // reduce 25%
            }
        }
        return value;
    }
}
