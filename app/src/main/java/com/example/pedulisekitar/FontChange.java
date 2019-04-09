package com.example.pedulisekitar;

import android.app.Application;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

public class FontChange extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("font/houndtim.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build());

    }
}
