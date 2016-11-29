package com.alpha.alphafitness;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.HashMap;


public class ProfileScreen extends AppCompatActivity {

    public HashMap<Integer, Integer> calories = new HashMap<Integer, Integer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_screen);
        Bundle b = getIntent().getExtras();
        String duration = b.getString("durationP") + " Mins";
        String distance = b.getString("distanceP") + " KM";
        float distanceN = Float.parseFloat(b.getString("distanceP"));
        initializeHashMap(calories);
        int numberOfCal = calculateCalories(distanceN);
        TextView distanceValue = (TextView) findViewById(R.id.distanceValue);
        TextView durationValue = (TextView) findViewById(R.id.timeValue);
        TextView workoutValue = (TextView) findViewById(R.id.workoutValue);
        TextView caloriesBurnValue = (TextView) findViewById(R.id.caloriesBurnValue);
        distanceValue.setText(distance);
        durationValue.setText(duration);
        workoutValue.setText("1 times");
        caloriesBurnValue.setText(numberOfCal + " cal");

    }

    public int calculateCalories(float distance){

        float miles = distance * (float)0.621371;
        int caloriesN = Math.round(miles*2000);
        Log.d("val", String.format("%s", miles));
        Log.d("val", String.format("%s", caloriesN));
        int caloriesNu = (int) caloriesN/1000;
        caloriesN = caloriesNu * 1000;
        Log.d("val", String.format("%s", caloriesN));
        int value = calories.get(caloriesN);

        Log.d("val", String.format("%s", value));
        return value;

    }

    public void initializeHashMap(HashMap<Integer, Integer> hashMap){
        hashMap.put(0, 12);
        hashMap.put(1000, 38);
        hashMap.put(2000, 76);
        hashMap.put(3000, 114);
        hashMap.put(4000, 152);
        hashMap.put(5000, 190);
        hashMap.put(6000, 228);
        hashMap.put(7000, 266);
        hashMap.put(8000, 304);
        hashMap.put(9000, 342);
        hashMap.put(10000, 380);
        hashMap.put(11000, 418);
        hashMap.put(12000, 456);
        hashMap.put(13000, 494);
        hashMap.put(14000, 532);
        hashMap.put(15000, 570);
        hashMap.put(16000, 608);
        hashMap.put(17000, 646);
        hashMap.put(18000, 684);
        hashMap.put(19000, 722);
        hashMap.put(20000, 760);
    }
}
