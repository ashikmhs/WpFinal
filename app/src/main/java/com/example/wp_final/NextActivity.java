package com.example.wp_final;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class NextActivity extends AppCompatActivity {

    Fragment fragment;
    String studentId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        Intent intent = new Intent();
        studentId = intent.getStringExtra("studentId");

        Bundle bundle = new Bundle();
        bundle.putString("id", studentId);
        BMIFragment bmi = new BMIFragment();
        bmi.setArguments(bundle);

    }

    public void bmi(View view) {


        Bundle bundle = new Bundle();
        bundle.putString("id", studentId);
        BMIFragment bmi = new BMIFragment();
        bmi.setArguments(bundle);


        fragment = new BMIFragment();

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fragmentID,fragment);
        ft.commit();
    }

    public void fahrenheitToCelsius(View view) {


        Bundle bundle = new Bundle();
        bundle.putString("id", studentId);
        FahrenheitToCelsiusFragment F = new FahrenheitToCelsiusFragment();
        F.setArguments(bundle);

        fragment = new CelsiusToFahrenheitFragment();

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fragmentID,fragment);
        ft.commit();

    }

    public void celsiusToFahrenheit(View view) {


        Bundle bundle = new Bundle();
        bundle.putString("id", studentId);
        CelsiusToFahrenheitFragment C = new CelsiusToFahrenheitFragment();
        C.setArguments(bundle);

        fragment = new FahrenheitToCelsiusFragment();

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fragmentID,fragment);
        ft.commit();

    }
}