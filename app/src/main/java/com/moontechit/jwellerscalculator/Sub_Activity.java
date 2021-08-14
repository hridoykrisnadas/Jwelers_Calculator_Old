package com.moontechit.jwellerscalculator;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class Sub_Activity extends AppCompatActivity {
    private static final String TAG = "tag";
    EditText vori1, vori2, ana1, ana2, rothi1, rothi2, point1, point2;
    Button subButton;
    TextView subResult;
    int pr, rr, ar, vr;
    AlertDialog.Builder alertDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        vori1 = findViewById(R.id.Vori1);
        vori2 = findViewById(R.id.Vori2);
        ana1 = findViewById(R.id.Ana1);
        ana2 = findViewById(R.id.Ana2);
        rothi1 = findViewById(R.id.Rothi1);
        rothi2 = findViewById(R.id.Rothi2);
        point1 = findViewById(R.id.Point1);
        point2 = findViewById(R.id.Point2);
        subButton = findViewById(R.id.subButtonId);
        subResult = findViewById(R.id.subResult);

        subButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (vori1.length() == 0) {
                    vori1.setText("0");
                }
                if (ana1.length() == 0) {
                    ana1.setText("0");
                }
                if (rothi1.length() == 0) {
                    rothi1.setText("0");
                }
                if (point1.length() == 0) {
                    point1.setText("0");
                }
                if (vori2.length() == 0) {
                    vori2.setText("0");
                }
                if (ana2.length() == 0) {
                    ana2.setText("0");
                }
                if (rothi2.length() == 0) {
                    rothi2.setText("0");
                }
                if (point2.length() == 0) {
                    point2.setText("0");
                }


                int v1 = Integer.parseInt(vori1.getText().toString());
                int a1 = Integer.parseInt(ana1.getText().toString());
                int r1 = Integer.parseInt(rothi1.getText().toString());
                int p1 = Integer.parseInt(point1.getText().toString());
                int v2 = Integer.parseInt(vori2.getText().toString());
                int a2 = Integer.parseInt(ana2.getText().toString());
                int r2 = Integer.parseInt(rothi2.getText().toString());
                int p2 = Integer.parseInt(point2.getText().toString());

                if (a1 < 16 && a1 >= 0 && a2 < 16 & a2 >= 0 && r1 >= 0 && r1 < 6 && r2 >= 0 && r2 < 6 && p1 >= 0 && p1 < 10 && p2 >= 0 && p2 < 10) {

                    if (p1 < p2) {
                        r2 = r2 + 1;
                        pr = (p1 + 10) - p2;
                    } else {
                        pr = p1 - p2;
                    }
                    if (r2 == 6) {
                        a2 = a2 + 1;
                        rr = r1;
                    } else if (r1 < r2) {
                        a2 = a2 + 1;
                        rr = (r1 + 6) - r2;
                    } else {
                        rr = r1 - r2;
                    }
                    if (a2 == 16) {
                        v2 = v2 + 1;
                        ar = a1;
                    } else if (a1 < a2) {
                        v2 = v2 + 1;
                        ar = (a1 + 16) - a2;
                    } else {
                        ar = a1 - a2;
                    }
                    if (v1 < v2) {
                        try {

                            alertDialog = new AlertDialog.Builder(Sub_Activity.this);

                            alertDialog.setTitle("Error!");
                            alertDialog.setMessage("Please Enter The Valid Value");
                            alertDialog.setCancelable(false);
                            alertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {

                                }
                            });
                            AlertDialog alert = alertDialog.create();


                            alert.show();
                            vori1.setText("");
                            vori2.setText("");

                            /*ana1.setText("");
                            ana2.setText("");
                            rothi1.setText("");
                            rothi2.setText("");
                            point1.setText("");
                            point2.setText("");*/

                        } catch (Exception e) {
                            Log.d(Sub_Activity.TAG, "Show Dialog: " + e.getMessage());
                        }
                    } else {
                        vr = v1 - v2;
                    }

                    String result = vr + " ভরি\n" + ar + " আনা\n" + rr + " রথি\n" + pr + " পয়েন্ট";
                    subResult.setText(result);
                    subResult.setVisibility(View.VISIBLE);


                } else {
                    subResult.setText("Please Enter a valid value");
                    subResult.setVisibility(View.VISIBLE);
                }

            }

        });

    }
}