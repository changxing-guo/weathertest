package com.example.weather.util;

import android.util.Log;

public class LogUtil {

    private static boolean DEBUG = true;

    public static void v(String TAG, String str) {
        if (!DEBUG) return;
        Log.v(TAG, str);
    }
    public static void d(String TAG, String str) {
        if (!DEBUG) return;
        Log.d(TAG, str);
    }
    public static void i(String TAG, String str) {
        if (!DEBUG) return;
        Log.i(TAG, str);
    }
    public static void w(String TAG, String str) {
        if (!DEBUG) return;
        Log.w(TAG, str);
    }
    public static void e(String TAG, String str) {
        if (!DEBUG) return;
        Log.e(TAG, str);
    }

}
