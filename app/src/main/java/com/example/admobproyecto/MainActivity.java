package com.example.admobproyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        MobileAds.initialize(this, "ca-app-pub-3940256099942544~3347511713");
        final AdView myAd = findViewById(R.id.adView);
        myAd.loadAd(new AdRequest.Builder().addTestDevice("2E5C1BFE36D4707CC54D028594C19D17").build());
    }
}
