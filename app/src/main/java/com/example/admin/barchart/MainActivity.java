package com.example.admin.barchart;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BarChart chart = (BarChart) findViewById(R.id.chart);

        BarData data = new BarData(getXAxisValues(), getDataSet());
        chart.setData(data);
        chart.setDescription("My Chart");
        chart.animateXY(3000, 3000);
      //  chart.invalidate();
    }

    private ArrayList<BarDataSet> getDataSet() {
        ArrayList<BarDataSet> dataSets = null;

        ArrayList<BarEntry> valueSet1 = new ArrayList<>();
        BarEntry v1e1 = new BarEntry(110.000f, 0);
        valueSet1.add(v1e1);
        BarEntry v1e2 = new BarEntry(40.000f, 1);
        valueSet1.add(v1e2);
        BarEntry v1e3 = new BarEntry(80.000f, 2);
        valueSet1.add(v1e3);
        BarEntry v1e4 = new BarEntry(30.000f, 3);
        valueSet1.add(v1e4);
        BarEntry v1e5 = new BarEntry(100.000f, 4);
        valueSet1.add(v1e5);
        BarEntry v1e6 = new BarEntry(20.000f, 5);
        valueSet1.add(v1e6);
        BarEntry v1e7 = new BarEntry(30.000f, 6);
        valueSet1.add(v1e7);
        BarEntry v1e8 = new BarEntry(60.000f, 7);
        valueSet1.add(v1e8);
        BarEntry v1e9 = new BarEntry(90.000f, 8);
        valueSet1.add(v1e9);
        BarEntry v1e10 = new BarEntry(110.000f, 9);
        valueSet1.add(v1e10);
        BarEntry v1e11 = new BarEntry(80.000f, 10);
        valueSet1.add(v1e11);
        BarEntry v1e12 = new BarEntry(40.000f, 11);
        valueSet1.add(v1e12);


        BarDataSet barDataSet1 = new BarDataSet(valueSet1, "Brand 1");
        barDataSet1.setColors(Common.COLORFUL_COLOR);

        dataSets = new ArrayList<>();
        dataSets.add(barDataSet1);
        return dataSets;
    }

    private ArrayList<String> getXAxisValues() {
        ArrayList<String> xAxis = new ArrayList<>();
        xAxis.add("औंध");
        xAxis.add("कर्वेनगर/वारजे");
        xAxis.add("घोले रोड");
        xAxis.add("कोथरूड");
        xAxis.add("भवानी पेठ");
        xAxis.add("हडपसर");
        xAxis.add("धनकवडी");
        xAxis.add("कोंढवा/वानवडी");
        xAxis.add("बिबवेवाडी");
        xAxis.add("सहकारनगर");
        xAxis.add("कसबा/विश्रामबागवाडा");
        xAxis.add("येरवडा/संगमवाडी");
        return xAxis;
    }
}