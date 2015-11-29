package ianstrasser.gooberapp;

import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;

public class FlossActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floss);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
