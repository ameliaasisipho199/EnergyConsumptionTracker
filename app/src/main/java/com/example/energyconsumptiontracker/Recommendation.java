package com.example.energyconsumptiontracker;

public class Recommendation {

    // Determine energy efficiency category
    public String getEfficiencyCategory(double monthlyConsumption) {

        if (monthlyConsumption <= 50) {
            return "Excellent";
        } else if (monthlyConsumption <= 100) {
            return "Good";
        } else if (monthlyConsumption <= 200) {
            return "Moderate";
        } else {
            return "Poor";
        }
    }

    // Provide electricity-saving recommendation
    public String getRecommendation(double monthlyConsumption) {

        if (monthlyConsumption <= 50) {
            return "Excellent energy usage. Continue using energy-efficient appliances and switch off appliances when not in use.";

        } else if (monthlyConsumption <= 100) {
            return "Good energy usage. Consider reducing daily appliance usage and switching off appliances when not needed.";

        } else if (monthlyConsumption <= 200) {
            return "Moderate energy usage. Reduce appliance operating hours and consider using energy-efficient appliances.";

        } else {
            return "High energy usage. Significantly reduce appliance usage, avoid unnecessary standby power, and replace inefficient appliances.";
        }
    }
}