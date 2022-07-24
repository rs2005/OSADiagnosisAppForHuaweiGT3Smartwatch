package com.example.osadiagnosisappforhuaweigt3smartwatch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void loadDiagnosisOptionsPage (View argView)
    {
        Intent i = new Intent(this, DiagnosisOptions.class);
        startActivity(i);
    }

    public void loadAboutOSAPage (View argView)
    {
        Intent i = new Intent(this, AboutOSA.class);
        startActivity(i);
    }
}