package com.moontechit.jwellerscalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

public class Splash_Screen extends AppCompatActivity {
    private static int splashTimeOut = 2000;
    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash__screen);

        image = findViewById(R.id.splashImageID);

        try {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }, splashTimeOut);
        } catch (Exception e) {
            Toast.makeText(this, "This Application Not Support your Device", Toast.LENGTH_SHORT).show();
        }

        Animation myanim = AnimationUtils.loadAnimation(this, R.anim.my_splash_animation);
        image.startAnimation(myanim);
    }
}