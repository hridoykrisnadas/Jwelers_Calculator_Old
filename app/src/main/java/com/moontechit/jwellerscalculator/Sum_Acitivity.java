package com.moontechit.jwellerscalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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

                int inputVori1 = 0;
                int inputAna1 = 0;
                int inputRothi1 = 0;
                int inputPoint1 = 0;
                int inputVori2 = 0;
                int inputAna2 = 0;
                int inputRothi2 = 0;
                int inputPoint2 = 0;

                inputVori1 = Integer.parseInt(vori1.getText().toString());
                inputAna1 = Integer.parseInt(ana1.getText().toString());
                inputRothi1 = Integer.parseInt(rothi1.getText().toString());
                inputPoint1 = Integer.parseInt(point1.getText().toString());
                inputVori2 = Integer.parseInt(vori2.getText().toString());
                inputAna2 = Integer.parseInt(ana2.getText().toString());
                inputRothi2 = Integer.parseInt(rothi2.getText().toString());
                inputPoint2 = Integer.parseInt(point2.getText().toString());

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


                } else {
                    sumResult.setText("Please Enter a valid value");
                    sumResult.setVisibility(View.VISIBLE);
                }

            }
        });


    }
}