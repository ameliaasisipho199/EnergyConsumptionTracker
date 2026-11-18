package com.example.energyconsumptiontracker;

public class ElectricityCalculator {

    // Calculate daily electricity consumption in kWh
    public double calculateDailyConsumption(double powerRating,
                                            double dailyUsageHours) {

        return (powerRating * dailyUsageHours) / 1000;
    }

    // Calculate monthly electricity consumption in kWh
    public double calculateMonthlyConsumption(double dailyConsumption) {

        return dailyConsumption * 30;
    }

    // Calculate estimated monthly electricity cost
    public double calculateMonthlyCost(double monthlyConsumption,
                                       double electricityTariff) {

        return monthlyConsumption * electricityTariff;
    }
}