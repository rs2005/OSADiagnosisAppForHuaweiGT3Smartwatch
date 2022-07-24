package com.example.osadiagnosisappforhuaweigt3smartwatch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ManualSetWait extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manual_set_wait);
    }

    public void loadManualSetPage (View argView)
    {
        Intent i = new Intent(this, ManualSet.class);
        startActivity(i);
    }

    public void loadDashboardPage (View argView)
    {
        Intent i = new Intent(this, Dashboard.class);
        startActivity(i);
    }
}