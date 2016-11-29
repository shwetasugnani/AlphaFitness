package com.alpha.alphafitness;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class RecordWorkout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record_workout);
        Configuration config = getResources().getConfiguration();

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        /**
         * Check the device orientation and act accordingly
         */
        if (config.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            /**
             * Landscape mode of the device
             */
            HorizontalFragment h_fragment = new HorizontalFragment();
           fragmentTransaction.replace(R.id.fragment_container, h_fragment);

        }else{
            /**
             * Portrait mode of the device
             */
            VerticalFragment v_fragment = new VerticalFragment();
            fragmentTransaction.replace(R.id.fragment_container, v_fragment);
        }
        fragmentTransaction.commit();
    }


    }

