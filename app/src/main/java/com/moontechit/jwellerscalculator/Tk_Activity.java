package com.moontechit.jwellerscalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Tk_Activity extends AppCompatActivity {
    EditText price, vori, ana, rothi, point;
    Button calculation;
    TextView result;

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

        calculation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int Price = 0;
                int Vori = 0;
                int Ana = 0;
                int Rothi = 0;
                int Point = 0;

                Price = Integer.parseInt(price.getText().toString());
                Vori = Integer.parseInt(vori.getText().toString());
                Ana = Integer.parseInt(ana.getText().toString());
                Rothi = Integer.parseInt(rothi.getText().toString());
                Point = Integer.parseInt(point.getText().toString());

             /*   v = price
                a = price/16
                r = a/6
                p = r/10

                result = (vori*v)+(a*ana)+(r*rothi)+(p*point)*/

                float v = Price;
                float a = v / 16;
                float r = a / 6;
                float p = r / 10;

                float RESULT = (Vori * v) + (Ana * a) + (Rothi * r) + (Point * p);
                result.setText("Answer is: " + RESULT);
                result.setVisibility(View.VISIBLE);
            }
        });
    }
}