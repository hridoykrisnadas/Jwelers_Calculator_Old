package com.moontechit.jwellerscalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Tk_Activity extends AppCompatActivity {
    EditText price, vori, ana, rothi, point;
    Button calculation;
    TextView result, definate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tk);

        price = findViewById(R.id.Price);
        vori = findViewById(R.id.Vori);
        ana = findViewById(R.id.Ana);
        rothi = findViewById(R.id.Rothi);
        point = findViewById(R.id.Point);
        calculation = findViewById(R.id.calculation);
        result = findViewById(R.id.result);
        definate = findViewById(R.id.definate);


        calculation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int inputPrice = 0;
                int inputVori = 0;
                int inputAna = 0;
                int inputRothi = 0;
                int inputPoint = 0;

                inputPrice = Integer.parseInt(price.getText().toString());
                inputVori = Integer.parseInt(vori.getText().toString());
                inputAna = Integer.parseInt(ana.getText().toString());
                inputRothi = Integer.parseInt(rothi.getText().toString());
                inputPoint = Integer.parseInt(point.getText().toString());

                if (inputPrice >= 0 && inputVori >= 0 && inputAna >= 0 && inputAna < 16 && inputRothi >= 0 && inputRothi < 6 && inputPoint >= 0 && inputPoint < 10) {

                    float v = inputPrice;
                    float a = v / 16;
                    float r = a / 6;
                    float p = r / 10;

                    float RESULT = (inputVori * v) + (inputAna * a) + (inputRothi * r) + (inputPoint * p);
                    result.setText("Answer is: " + RESULT);
                    result.animate();
                    result.setVisibility(View.VISIBLE);

                    definate.setText("১ ভরি: " + v + " টাকা \n" + "১ আনা: " + a + " টাকা \n" + "১ রথি: " + r + " টাকা \n" + "১ পয়েন্ট: " + p + " টাকা \n");
                    definate.setVisibility(View.VISIBLE);

                } else {
                    result.setText(" Please Enter a valid value");
                    result.animate();
                    result.setVisibility(View.VISIBLE);
                }


            }
        });
    }
}