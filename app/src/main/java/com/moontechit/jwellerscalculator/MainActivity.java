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
    Button tkButton;


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
        tkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Tk_Activity.class);
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

        viewflipper.setOutAnimation(this, android.R.anim.slide_in_left);
        viewflipper.setInAnimation(this, android.R.anim.slide_out_right);
    }
}