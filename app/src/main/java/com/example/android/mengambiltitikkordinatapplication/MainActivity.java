package com.example.android.mengambiltitikkordinatapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        textView = (TextView) findViewById(R.id.textView);
        Button button = (Button) findViewById(R.id.button_kardinat);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GPSTracker gps = new GPSTracker(MainActivity.this);
                double latitude = gps.getLatitude();
                double longitude = gps.getLongitude();
                textView.setText("Latitude:\n " + latitude + " \n Longitude:\n " + longitude);
            }
        });
    }
}