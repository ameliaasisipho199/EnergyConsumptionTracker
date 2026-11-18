package com.example.energyconsumptiontracker;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class InputActivity extends AppCompatActivity {

    EditText etApplianceName;
    EditText etPowerRating;
    EditText etUsageHours;
    EditText etTariff;

    Spinner spinnerCategory;

    Button btnCalculateSave;
    Button btnClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_input);

        // Connect Java variables to XML components
        etApplianceName = findViewById(R.id.etApplianceName);
        etPowerRating = findViewById(R.id.etPowerRating);
        etUsageHours = findViewById(R.id.etUsageHours);
        etTariff = findViewById(R.id.etTariff);

        spinnerCategory = findViewById(R.id.spinnerCategory);

        btnCalculateSave = findViewById(R.id.btnCalculateSave);
        btnClear = findViewById(R.id.btnClear);

        // Appliance categories
        String[] categories = {
                "Kitchen",
                "Entertainment",
                "Lighting",
                "Heating",
                "Cooling"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_spinner_item,
                categories
        );

        adapter.setDropDownViewResource(
                android.R.layout.simple_spinner_dropdown_item
        );

        spinnerCategory.setAdapter(adapter);

        // Calculate button
        btnCalculateSave.setOnClickListener(v -> calculateResults());

        // Clear button
        btnClear.setOnClickListener(v -> clearFields());
    }

    private void calculateResults() {

        String applianceName = etApplianceName.getText().toString().trim();
        String powerText = etPowerRating.getText().toString().trim();
        String hoursText = etUsageHours.getText().toString().trim();
        String tariffText = etTariff.getText().toString().trim();

        if (applianceName.isEmpty() ||
                powerText.isEmpty() ||
                hoursText.isEmpty() ||
                tariffText.isEmpty()) {

            Toast.makeText(
                    this,
                    "Please complete all fields",
                    Toast.LENGTH_SHORT
            ).show();

            return;
        }

        double powerRating = Double.parseDouble(powerText);
        double usageHours = Double.parseDouble(hoursText);
        double tariff = Double.parseDouble(tariffText);

        String category = spinnerCategory.getSelectedItem().toString();

        // Create Appliance object
        Appliance appliance = new Appliance(
                applianceName,
                powerRating,
                usageHours,
                tariff,
                category
        );

        // Create calculator object
        ElectricityCalculator calculator =
                new ElectricityCalculator();

        // Perform calculations
        double dailyConsumption =
                calculator.calculateDailyConsumption(
                        powerRating,
                        usageHours
                );

        double monthlyConsumption =
                calculator.calculateMonthlyConsumption(
                        dailyConsumption
                );

        double monthlyCost =
                calculator.calculateMonthlyCost(
                        monthlyConsumption,
                        tariff
                );

        // Create recommendation object
        Recommendation recommendation =
                new Recommendation();

        String efficiency =
                recommendation.getEfficiencyCategory(
                        monthlyConsumption
                );

        String recommendationText =
                recommendation.getRecommendation(
                        monthlyConsumption
                );

        // Store calculated values in Appliance
        appliance.setDailyConsumption(dailyConsumption);
        appliance.setMonthlyConsumption(monthlyConsumption);
        appliance.setMonthlyCost(monthlyCost);

        // Open Results Activity
        Intent intent = new Intent(
                InputActivity.this,
                ResultsActivity.class
        );

        intent.putExtra("applianceName", appliance.getApplianceName());
        intent.putExtra("dailyConsumption", dailyConsumption);
        intent.putExtra("monthlyConsumption", monthlyConsumption);
        intent.putExtra("monthlyCost", monthlyCost);
        intent.putExtra("efficiency", efficiency);
        intent.putExtra("recommendation", recommendationText);

        startActivity(intent);
    }

    private void clearFields() {

        etApplianceName.setText("");
        etPowerRating.setText("");
        etUsageHours.setText("");
        etTariff.setText("");

        spinnerCategory.setSelection(0);
    }
}