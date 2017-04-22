package com.runtai.gaodeditu_demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationListener;

public class MainActivity extends AppCompatActivity implements AMapLocationListener {

    private TextView location;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        location = (TextView) findViewById(R.id.location);
    }

    @Override
    public void onLocationChanged(AMapLocation aMapLocation) {
        location.setText(aMapLocation.getAddress());
    }
}
