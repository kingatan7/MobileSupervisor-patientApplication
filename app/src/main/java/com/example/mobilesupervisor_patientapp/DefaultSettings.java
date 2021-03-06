package com.example.mobilesupervisor_patientapp;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class DefaultSettings {
    private static SharedPreferences sharedPreferences;

    // create one method that will instantiate sharedPreferecdes
    private static void getSharedPreferencesInstance(Context context) {
        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
    }


    // editTextPreferece [sms number]
    public static String getUserSMSNumber(Context context) {
        getSharedPreferencesInstance(context);
        return sharedPreferences.getString("smsNumber", "");
    }

    // editTextPreferece [phone number]
    public static String getUserCallNumber(Context context) {
        getSharedPreferencesInstance(context);
        return sharedPreferences.getString("callNumber", "");
    }

    public static String getMinRange(Context context) {
        getSharedPreferencesInstance(context);
        return sharedPreferences.getString("minRange", "");
    }

    public static String getMaxRange(Context context) {
        getSharedPreferencesInstance(context);
        return sharedPreferences.getString("maxRange", "");
    }

    public static String getMACAddress(Context context) {
        getSharedPreferencesInstance(context);
        return sharedPreferences.getString("MACAddress", "");
    }

}
