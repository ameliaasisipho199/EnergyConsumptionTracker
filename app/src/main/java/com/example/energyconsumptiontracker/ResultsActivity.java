package com.example.energyconsumptiontracker;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;

public class ResultsActivity extends AppCompatActivity {

    TextView tvApplianceName;
    TextView tvDailyConsumption;
    TextView tvMonthlyConsumption;
    TextView tvMonthlyCost;
    TextView tvEfficiencyRating;
    TextView tvRecommendation;

    Button btnCalculateAgain;
    Button btnExitResults;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_results);

        // Connect Java variables to XML components
        tvApplianceName = findViewById(R.id.tvApplianceName);
        tvDailyConsumption = findViewById(R.id.tvDailyConsumption);
        tvMonthlyConsumption = findViewById(R.id.tvMonthlyConsumption);
        tvMonthlyCost = findViewById(R.id.tvMonthlyCost);
        tvEfficiencyRating = findViewById(R.id.tvEfficiencyRating);
        tvRecommendation = findViewById(R.id.tvRecommendation);

        btnCalculateAgain = findViewById(R.id.btnCalculateAgain);
        btnExitResults = findViewById(R.id.btnExitResults);

        // Receive information from InputActivity
        String applianceName =
                getIntent().getStringExtra("applianceName");

        double dailyConsumption =
                getIntent().getDoubleExtra(
                        "dailyConsumption",
                        0
                );

        double monthlyConsumption =
                getIntent().getDoubleExtra(
                        "monthlyConsumption",
                        0
                );

        double monthlyCost =
                getIntent().getDoubleExtra(
                        "monthlyCost",
                        0
                );

        String efficiency =
                getIntent().getStringExtra("efficiency");

        String recommendation =
                getIntent().getStringExtra("recommendation");

        // Display results
        tvApplianceName.setText(
                "Appliance Name: " + applianceName
        );

        tvDailyConsumption.setText(
                String.format(
                        Locale.getDefault(),
                        "Daily Consumption: %.2f kWh",
                        dailyConsumption
                )
        );

        tvMonthlyConsumption.setText(
                String.format(
                        Locale.getDefault(),
                        "Monthly Consumption: %.2f kWh",
                        monthlyConsumption
                )
        );

        tvMonthlyCost.setText(
                String.format(
                        Locale.getDefault(),
                        "Monthly Cost: R%.2f",
                        monthlyCost
                )
        );

        tvEfficiencyRating.setText(
                "Energy Efficiency Rating: " + efficiency
        );

        tvRecommendation.setText(
                "Recommendation: " + recommendation
        );

        // Calculate Again
        btnCalculateAgain.setOnClickListener(v -> {

            finish();

        });

        // Exit
        btnExitResults.setOnClickListener(v -> {

            finishAffinity();

        });
    }
}