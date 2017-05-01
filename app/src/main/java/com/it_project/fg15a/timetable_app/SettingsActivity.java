package com.it_project.fg15a.timetable_app;


import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.preference.Preference;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatDelegate;

// PreferenceActivity just temporary because there were some issues with the PreferenceFragment
// TODO: get ActionBar somehow to work
public class SettingsActivity extends PreferenceActivity
        implements Preference.OnPreferenceChangeListener {

    private AppCompatDelegate mDelegate;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActionBar actionBar = getDelegate().getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        // deprecated but only function to get layout of activity at this time
        addPreferencesFromResource(R.xml.activity_settings);
    }

    @Override
    public boolean onPreferenceChange(Preference preference, Object value) {
        return false;
    }

    private AppCompatDelegate getDelegate() {
        if(mDelegate == null) {
            mDelegate = AppCompatDelegate.create(this, null);
        }
        return mDelegate;
    }

}
