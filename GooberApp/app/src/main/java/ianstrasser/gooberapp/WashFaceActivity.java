package ianstrasser.gooberapp;

import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;

public class WashFaceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wash_face);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
