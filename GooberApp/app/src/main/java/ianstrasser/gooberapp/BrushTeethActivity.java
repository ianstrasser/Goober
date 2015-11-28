package ianstrasser.gooberapp;

import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class BrushTeethActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brush_teeth);
        //Toolbar myToolbar = (Toolbar) findViewById(R.id.toolbar);
        //setActionBar(myToolbar);

    }

    public void dayBrush(View v) {
        Button sun = (Button) findViewById(R.id.day_Brush);
        Object tag = sun.getTag();
        int backgroundId = R.drawable.sun_orange;
        if( tag != null && ((Integer)tag).intValue() == backgroundId) {
            backgroundId = R.drawable.sun_grey;
        } else {
            backgroundId = R.drawable.sun_orange;
        }
        sun.setTag(backgroundId);
        sun.setBackgroundResource(backgroundId);
    }

    public void nightBrush(View v) {
        Button moon = (Button) findViewById(R.id.night_Brush);
        Object tag = moon.getTag();
        int backgroundId = R.drawable.moon_blue;
        if( tag != null && ((Integer)tag).intValue() == backgroundId) {
            backgroundId = R.drawable.moon_grey;

        } else {
            backgroundId = R.drawable.moon_blue;
        }
        moon.setTag(backgroundId);
        moon.setBackgroundResource(backgroundId);
    }
}
