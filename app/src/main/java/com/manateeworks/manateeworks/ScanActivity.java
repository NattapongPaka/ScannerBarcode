package com.manateeworks.manateeworks;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by nattapongpaka on 3/21/2017 AD.
 */

public class ScanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.promosScanBarcodeContainer, ScanBarcodeManateeFragment.newInstance(), ScanBarcodeManateeFragment.class.getSimpleName())
                    .commit();
        }
    }
}
