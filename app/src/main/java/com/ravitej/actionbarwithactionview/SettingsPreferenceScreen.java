package com.ravitej.actionbarwithactionview;

import android.os.Bundle;
import android.support.v7.preference.PreferenceFragmentCompat;

/**
 * Created by No One on 6/9/2017.
 */

public class SettingsPreferenceScreen extends PreferenceFragmentCompat {
    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
//        setPreferencesFromResource(R.xml.preferences, null);
        addPreferencesFromResource(R.xml.preferences);
    }


}
