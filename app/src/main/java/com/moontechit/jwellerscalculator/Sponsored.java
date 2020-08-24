package com.moontechit.jwellerscalculator;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

public class Sponsored extends AppCompatActivity {

    ImageView fbBijoy, callBijoy, fbHridoy, mailHridoy, webHridoy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sponsored);

        fbBijoy = findViewById(R.id.fbBijoyID);
        callBijoy = findViewById(R.id.callBijoyID);
        fbHridoy = findViewById(R.id.fbHridoyID);
        mailHridoy = findViewById(R.id.mailHridoyID);
        webHridoy = findViewById(R.id.webHridoyID);

        fbBijoy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("http://www.facebook.com/bijoykrishna.das.581/");

                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        callBijoy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent call = new Intent(Intent.ACTION_CALL);
                call.setData(Uri.parse("tel: +8801858462867"));

                if (ActivityCompat.checkSelfPermission(Sponsored.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    return;
                }
                startActivity(call);
            }

        });

        fbHridoy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("http://www.facebook.com/hridoykrisnadas/");

                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        mailHridoy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("mailto:hridoykrisnadas@gmail.com");

                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);

            }
        });

        webHridoy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Sponsored.this, Web_View.class);
                startActivity(intent);
            }
        });

    }
}