package com.example.osadiagnosisappforhuaweigt3smartwatch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DiagnosisAutoSet extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.diagnosis_auto_set);
    }

    public void loadAutoSetPage (View argView)
    {
        Intent i = new Intent(this, AutoSet.class);
        startActivity(i);
    }

    public void loadDashboardPage (View argView)
    {
        Intent i = new Intent(this, Dashboard.class);
        startActivity(i);
    }
}