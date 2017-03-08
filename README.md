# BarChart AnimationView

## Used dependencies
compile 'com.github.PhilJay:MPAndroidChart:v2.0.9'

![screenshot_2017-03-08-12-28-59-095_com example admin barchart 1](https://cloud.githubusercontent.com/assets/13817569/23693730/e7b01768-03fb-11e7-9980-f30bf9602dc7.png)

#MainActivity java
 private ArrayList<BarDataSet> getDataSet() {
        ArrayList<BarDataSet> dataSets = null;

        ArrayList<BarEntry> valueSet1 = new ArrayList<>();
        BarEntry v1e1 = new BarEntry(110.000f, 0);
        valueSet1.add(v1e1);
        
        BarDataSet barDataSet1 = new BarDataSet(valueSet1, "Brand 1");
        barDataSet1.setColors(Common.COLORFUL_COLOR);

        dataSets = new ArrayList<>();
        dataSets.add(barDataSet1);
        return dataSets;
    }
  
###getXAxisValues Method

 private ArrayList<String> getXAxisValues() {
        ArrayList<String> xAxis = new ArrayList<>();
        xAxis.add("Android Animatio BarChart");        
        return xAxis;
     }
  
