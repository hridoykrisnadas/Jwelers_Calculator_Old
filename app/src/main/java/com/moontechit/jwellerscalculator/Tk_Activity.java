package com.moontechit.jwellerscalculator;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
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

                if (price.length() == 0) {
                    price.setText("0");
                }
                if (vori.length() == 0) {
                    vori.setText("0");
                }
                if (ana.length() == 0) {
                    ana.setText("0");
                }
                if (rothi.length() == 0) {
                    rothi.setText("0");
                }
                if (point.length() == 0) {
                    point.setText("0");
                }

                int inputPrice = Integer.parseInt(price.getText().toString());
                int inputVori = Integer.parseInt(vori.getText().toString());
                int inputAna = Integer.parseInt(ana.getText().toString());
                int inputRothi = Integer.parseInt(rothi.getText().toString());
                int inputPoint = Integer.parseInt(point.getText().toString());

                if (inputPrice >= 0 && inputVori >= 0 && inputAna >= 0 && inputAna < 16 && inputRothi >= 0 && inputRothi < 6 && inputPoint >= 0 && inputPoint < 10) {

                    float v = inputPrice;
                    float a = v / 16;
                    float r = a / 6;
                    float p = r / 10;

                    float RESULT = (inputVori * v) + (inputAna * a) + (inputRothi * r) + (inputPoint * p);
                    result.setText("মোট টাকা: " + RESULT);
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