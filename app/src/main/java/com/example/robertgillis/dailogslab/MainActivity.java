package com.example.robertgillis.dailogslab;

import android.app.TimePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button mLSDButton;
    private Button mLLDButton;
    private Button mMLDButton;
    private Button mCDButton;
    private Button mTPDButton;
    private Button mDPDButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mLSDButton = (Button) findViewById(R.id.LSD_button);
        mLSDButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FireMissilesDialogFragment fireMissilesDialogFragment = new FireMissilesDialogFragment();
                fireMissilesDialogFragment.show(getSupportFragmentManager(), "missiles" );

            }
        });

        mLLDButton = (Button) findViewById(R.id.LLD_button);
        mLLDButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ListDialogFragment listDialogFragment = new ListDialogFragment();
                listDialogFragment.show(getSupportFragmentManager(), "colors");

            }
        });

        mMLDButton = (Button) findViewById(R.id.LMD_button);
        mMLDButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MultiListDialogFragment listDialogFragment = new MultiListDialogFragment();
                listDialogFragment.show(getSupportFragmentManager
                        (), "toppings");

            }
        });

        mCDButton = (Button) findViewById(R.id.CD_button);
        mCDButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CustomDialogFragment customDialogFragment = new CustomDialogFragment();
                customDialogFragment.show(getSupportFragmentManager(), "custom");

            }
        });

        mTPDButton = (Button) findViewById(R.id.TP_button);
        mTPDButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialogFragment timePickerDialogFragment = new TimePickerDialogFragment();
                timePickerDialogFragment.show(getSupportFragmentManager(), "time");
            }
        });

        mDPDButton = (Button) findViewById(R.id.DP_button);
        mDPDButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePickerDialogFragment datePickerDialogFragment = new DatePickerDialogFragment();
                datePickerDialogFragment.show(getSupportFragmentManager(), "date");
            }
        });
    }
}
