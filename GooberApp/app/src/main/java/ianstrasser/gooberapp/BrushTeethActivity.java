package ianstrasser.gooberapp;

import android.os.Bundle;
import android.app.Activity;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BrushTeethActivity extends AppCompatActivity {

    private CountDownTimer countDownTimer;
    private boolean timerRunning = false;
    private TextView time;
    private Button timerButton;

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
        if (tag != null && ((Integer) tag).intValue() == backgroundId) {
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
        if (tag != null && ((Integer) tag).intValue() == backgroundId) {
            backgroundId = R.drawable.moon_grey;

        } else {
            backgroundId = R.drawable.moon_blue;
        }
        moon.setTag(backgroundId);
        moon.setBackgroundResource(backgroundId);
    }

    public void startBrushTimer(final View v) {

        if (countDownTimer == null)
        {
            time = (TextView) findViewById(R.id.brushTimer);
            timerButton  = (Button) findViewById(R.id.timerBtn);
            countDownTimer = new CountDownTimer(120000, 1000) {
                public void onTick(long millisUntilFinished) {
                    time.setText("seconds remaining: " + millisUntilFinished / 1000);
                    timerButton.setText("Restart");
                }
                public void onFinish() {
                    time.setText("done!");
                }
            };
        }

        //Countdown Function
        if(!timerRunning){
            countDownTimer.start();
            timerRunning = true;
        } else {
            countDownTimer.cancel();
            timerRunning = false;
        }
    }
}
