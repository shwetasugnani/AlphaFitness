package com.alpha.alphafitness;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class HorizontalFragment extends Fragment {

    ArrayList<Entry> entries;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootview = inflater.inflate(R.layout.fragment_horizontal, container, false);
        LineChart chart = (LineChart) rootview.findViewById(R.id.linechart);
        entries = getEntries();
        LineDataSet dataset = new LineDataSet(entries, "# of Calories");
        dataset.setDrawCubic(true);
        dataset.setDrawFilled(true);
        dataset.setColors(ColorTemplate.COLORFUL_COLORS);
        ArrayList<String> labels = new ArrayList<String>();
        labels.add("0");
        labels.add("5");
        labels.add("10");
        labels.add("15");
        labels.add("20");
        labels.add("25");
        LineData data = new LineData(labels, dataset);

        chart.setData(data);
        return rootview;
    }

    public ArrayList<Entry> getEntries(){
        ArrayList<Entry> data = new ArrayList<Entry>();
        data.add(new Entry(39f, 0));
        data.add(new Entry(58f, 1));
        data.add(new Entry(76f, 2));
        data.add(new Entry(54f, 3));
        data.add(new Entry(76f, 4));
        data.add(new Entry(38f, 5));
        return data;
    }

}
