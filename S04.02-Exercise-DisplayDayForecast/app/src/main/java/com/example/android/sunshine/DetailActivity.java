package com.example.android.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DetailActivity extends AppCompatActivity {

    private static final String FORECAST_SHARE_HASHTAG = " #SunshineApp";
    private TextView textViewDetails ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        textViewDetails =(TextView )  findViewById(R.id.tv_weather_detail);

        // COMPLETED (2) Display the weather forecast that was passed from MainActivity
        Intent intent = getIntent();

        if (intent.hasExtra(Intent.EXTRA_TEXT)){

            textViewDetails.setText(intent.getStringExtra(Intent.EXTRA_TEXT));

        }


    }
}