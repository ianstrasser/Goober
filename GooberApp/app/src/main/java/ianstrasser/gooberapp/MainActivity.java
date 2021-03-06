package ianstrasser.gooberapp;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

public class MainActivity extends AppCompatActivity {
    Button btn;
    ClipData.Item about;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btn = (Button)findViewById(R.id.brushTeethBtn);
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(), BrushTeethActivity.class);
                startActivity(i);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement

        /*if(id == R.id.action_share) {
            Intent i = new Intent(getApplicationContext(), ShareActivity.class);
            startActivity(i);
        }*/

        if(id == R.id.action_feedback) {
            Intent i = new Intent(getApplicationContext(), FeedbackActivity.class);
            startActivity(i);
        }

        if (id == R.id.action_about) {
            Intent i = new Intent(getApplicationContext(), AboutActivity.class);
            startActivity(i);
        }

        if (id == R.id.action_settings) {
            Intent i = new Intent(getApplicationContext(), SettingsActivity.class);
            startActivity(i);
        }

        return super.onOptionsItemSelected(item);
    }
    public void sendMessage(View view){
        Intent intent = new Intent(MainActivity.this, BrushTeethActivity.class);
        startActivity(intent);
    }
    public void sendFloss(View view){
        Intent intent = new Intent(MainActivity.this, FlossActivity.class);
        startActivity(intent);
    }
    public void sendShower(View view){
        Intent intent = new Intent(MainActivity.this, ShowerActivity.class);
        startActivity(intent);
    }
    public void sendWashFace(View view){
        Intent intent = new Intent(MainActivity.this, WashFaceActivity.class);
        startActivity(intent);
    }
    public void sendLostTooth(View view){
        Intent intent = new Intent(MainActivity.this, LostToothActivity.class);
        startActivity(intent);
    }
    public void sendHomework(View view){
        Intent intent = new Intent(MainActivity.this, HomeworkActivity.class);
        startActivity(intent);
    }


}
