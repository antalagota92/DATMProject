package com.example.student.firstapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.R.attr.button;


public class FirstApp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_app);

        final TextView locationField = (TextView) findViewById(R.id.locationField);
        Button refreshLocationButton = (Button) findViewById(R.id.refreshLocationButton);

        refreshLocationButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                locationField.setText("Hurray! You pushed the button");
            }
        });

    }
}
