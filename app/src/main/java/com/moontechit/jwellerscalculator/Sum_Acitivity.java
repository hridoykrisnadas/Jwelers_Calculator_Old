package com.moontechit.jwellerscalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Sum_Acitivity extends AppCompatActivity {
    EditText vori1, vori2, ana1, ana2, rothi1, rothi2, point1, point2;
    Button sumButton;
    TextView sumResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sum);

        vori1 = findViewById(R.id.Vori1);
        vori2 = findViewById(R.id.Vori2);
        ana1 = findViewById(R.id.Ana1);
        ana2 = findViewById(R.id.Ana2);
        rothi1 = findViewById(R.id.Rothi1);
        rothi2 = findViewById(R.id.Rothi2);
        point1 = findViewById(R.id.Point1);
        point2 = findViewById(R.id.Point2);
        sumButton = findViewById(R.id.SummationBtn);
        sumResult = findViewById(R.id.SummationResult);

        sumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                int inputVori1 = Integer.parseInt(vori1.getText().toString());
                int inputAna1 = Integer.parseInt(ana1.getText().toString());
                int inputRothi1 = Integer.parseInt(rothi1.getText().toString());
                int inputPoint1 = Integer.parseInt(point1.getText().toString());
                int inputVori2 = Integer.parseInt(vori2.getText().toString());
                int inputAna2 = Integer.parseInt(ana2.getText().toString());
                int inputRothi2 = Integer.parseInt(rothi2.getText().toString());
                int inputPoint2 = Integer.parseInt(point2.getText().toString());

                if (vori1.length() == 0) {
                    vori1.setError("Enter value!");
                } else if (ana1.length() == 0) {
                    ana1.setError("Enter value!");
                } else if (rothi1.length() == 0) {
                    rothi1.setError("Enter value!");
                } else if (point1.length() == 0) {
                    point1.setError("Enter value!");
                } else if (vori2.length() == 0) {
                    vori2.setError("Enter value!");
                } else if (ana2.length() == 0) {
                    ana2.setError("Enter value!");
                } else if (rothi2.length() == 0) {
                    rothi2.setError("Enter value!");
                } else if (point2.length() == 0) {
                    point2.setError("Enter value!");
                } else {

                    if (inputAna1 < 16 && inputAna1 >= 0 && inputAna2 < 16 & inputAna2 >= 0 && inputRothi1 >= 0 && inputRothi1 < 6 && inputRothi1 >= 0 && inputRothi2 >= 0 && inputRothi2 < 6 && inputPoint1 >= 0 && inputPoint1 < 10 && inputPoint2 >= 0 && inputPoint2 < 10) {

                        int p = inputPoint1 + inputPoint2;
                        int r = inputRothi1 + inputRothi2;
                        int a = inputAna1 + inputAna2;
                        int v = inputVori1 + inputVori2;

                        if (p >= 10) {
                            r = r + 1;
                            p = p - 10;
                        }
                        if (r >= 6) {
                            a = a + 1;
                            r = r - 6;
                        }
                        if (a >= 16) {
                            v = v + 1;
                            a = a - 16;
                        }

                        sumResult.setText("ভরি: " + v + "\nআনা: " + a + "\nরথি: " + r + "\nপয়েন্ট: " + p);
                        sumResult.setVisibility(View.VISIBLE);


                    } else {
                        sumResult.setText("Please Enter a valid value");
                        sumResult.setVisibility(View.VISIBLE);
                    }

                }


            }
        });


    }
}