package com.example.xyzreader.remote;

import android.util.Log;

import java.net.MalformedURLException;
import java.net.URL;

class Config {
    public static final URL BASE_URL;
    private static final String TAG = Config.class.toString();
//for testing https://raw.githubusercontent.com/TNTest/xyzreader/master/data.json
    static {
        URL url = null;
        try {
            url = new URL("https://go.udacity.com/xyz-reader-json" );
        } catch (MalformedURLException ignored) {
            // TODO: throw a real error
            Log.e(TAG, "Please check your internet connection.");
        }

        BASE_URL = url;
    }
}
