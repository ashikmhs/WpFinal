package com.example.wp_final;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class CelsiusToFahrenheitFragment extends Fragment {


    TextView studentIdTV,resultTV;
    EditText temperatureET;
    Button calculateBTN;






    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_celsius_to_fahrenheit, container, false);
        String studentId = getArguments().getString("id");


        studentIdTV = view.findViewById(R.id.studentIdTV);
        resultTV = view.findViewById(R.id.resultTV);
        temperatureET = view.findViewById(R.id.temperatureET);
        calculateBTN = view.findViewById(R.id.calculateBTN);

        studentIdTV.setText(studentId);


        calculateBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String temp = temperatureET.getText().toString();
                int C = Integer.parseInt(temp);

                double F = ((C*9)/5)+32;
                resultTV.setText(String.valueOf(F));

            }
        });

        return view;
    }
}