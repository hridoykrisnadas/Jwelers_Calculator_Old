package com.moontechit.jwellerscalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {
    ViewFlipper viewflipper;
    Button tkButton, sumButton, sponsored;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int[] images = {R.drawable.s1, R.drawable.s2, R.drawable.s3, R.drawable.s4, R.drawable.s5};
        viewflipper = findViewById(R.id.viewFlipper);
        for (int image : images) {
            flipperimages(image);
        }


        tkButton = findViewById(R.id.TkButtonId);
        sumButton = findViewById(R.id.SumButtonId);
        sponsored = findViewById(R.id.SponsoredButtonID);

        tkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Tk_Activity.class);
                startActivity(intent);
            }
        });

        sumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Sum_Acitivity.class);
                startActivity(intent);
            }
        });

        sponsored.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Sponsored.class);
                startActivity(intent);
            }
        });
    }

    public void flipperimages(int images) {
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(images);

        viewflipper.addView(imageView);
        viewflipper.setFlipInterval(3000);
        viewflipper.setAutoStart(true);

        viewflipper.setInAnimation(this, android.R.anim.fade_in);
        viewflipper.setOutAnimation(this, android.R.anim.fade_out);
    }
}