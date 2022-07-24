package com.example.osadiagnosisappforhuaweigt3smartwatch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ManualSet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manual_set);
    }

    public void loadDashboardPage (View argView)
    {
        Intent i = new Intent(this, Dashboard.class);
        startActivity(i);
    }

    public void loadDiagnosisOptionsPage (View argView)
    {
        Intent i = new Intent(this, DiagnosisOptions.class);
        startActivity(i);
    }

    public void loadManualSetWaitPage (View argView)
    {
        Intent i = new Intent(this, ManualSetWait.class);
        startActivity(i);
    }
}