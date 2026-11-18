package com.example.energyconsumptiontracker;

public class Appliance {

    private String applianceName;
    private double powerRating;
    private double dailyUsageHours;
    private double electricityTariff;
    private String category;

    private double dailyConsumption;
    private double monthlyConsumption;
    private double monthlyCost;

    // Default constructor
    public Appliance() {
    }

    // Parameterised constructor
    public Appliance(String applianceName, double powerRating,
                     double dailyUsageHours, double electricityTariff,
                     String category) {

        this.applianceName = applianceName;
        this.powerRating = powerRating;
        this.dailyUsageHours = dailyUsageHours;
        this.electricityTariff = electricityTariff;
        this.category = category;
    }

    // Getters
    public String getApplianceName() {
        return applianceName;
    }

    public double getPowerRating() {
        return powerRating;
    }

    public double getDailyUsageHours() {
        return dailyUsageHours;
    }

    public double getElectricityTariff() {
        return electricityTariff;
    }

    public String getCategory() {
        return category;
    }

    public double getDailyConsumption() {
        return dailyConsumption;
    }

    public double getMonthlyConsumption() {
        return monthlyConsumption;
    }

    public double getMonthlyCost() {
        return monthlyCost;
    }

    // Setters
    public void setApplianceName(String applianceName) {
        this.applianceName = applianceName;
    }

    public void setPowerRating(double powerRating) {
        this.powerRating = powerRating;
    }

    public void setDailyUsageHours(double dailyUsageHours) {
        this.dailyUsageHours = dailyUsageHours;
    }

    public void setElectricityTariff(double electricityTariff) {
        this.electricityTariff = electricityTariff;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDailyConsumption(double dailyConsumption) {
        this.dailyConsumption = dailyConsumption;
    }

    public void setMonthlyConsumption(double monthlyConsumption) {
        this.monthlyConsumption = monthlyConsumption;
    }

    public void setMonthlyCost(double monthlyCost) {
        this.monthlyCost = monthlyCost;
    }
}