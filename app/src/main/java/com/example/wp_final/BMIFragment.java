package com.example.wp_final;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.Math;

public class BMIFragment extends Fragment {

    int BMI;
    TextView studentIdTV;
    EditText heightET,weightET;
    Button calculateBTN;


    /*public BMIFragment(String studentId) {

        this.studentId = studentId;
    }*/



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_b_m_i, container, false);

        String studentId = getArguments().getString("id");

        studentIdTV = view.findViewById(R.id.studentIdTV);
        heightET = view.findViewById(R.id.heightET);
        weightET = view.findViewById(R.id.weightET);
        calculateBTN = view.findViewById(R.id.calculateBTN);

        studentIdTV.setText(studentId);

        calculateBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String weight = weightET.getText().toString();
                String height = heightET.getText().toString();

                int weight_in_kg = Integer.parseInt(weight);
                double height_in_meters = 0.0254*Double.parseDouble(height);

                BMI =  (int)((weight_in_kg)/Math.pow(height_in_meters,2));

                if (BMI > 25){
                    Toast.makeText(getActivity(), "Overweight and BMI is : "+BMI, Toast.LENGTH_SHORT).show();
                }
                else {

                    Toast.makeText(getActivity(), "Not Overweight and BMI is : "+BMI, Toast.LENGTH_SHORT).show();
                }
            }
        });

        return  view;
    }
}