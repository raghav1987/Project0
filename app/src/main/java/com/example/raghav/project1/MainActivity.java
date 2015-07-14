package com.example.raghav.project1;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void startProject(View v) {
        switch (v.getId()) {
            case R.id.button2:
                Toast.makeText(MainActivity.this, "This is gonna start my spotify streamer!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button3:
                Toast.makeText(MainActivity.this, "This is gonna start my scores app!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button4:
                Toast.makeText(MainActivity.this, "This is gonna start my library app!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button5:
                Toast.makeText(MainActivity.this, "This is gonna start my bigger app!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button6:
                Toast.makeText(MainActivity.this, "This is gonna start my bacon reader app!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button7:
                Toast.makeText(MainActivity.this, "This is gonna start my capstone projecto!", Toast.LENGTH_SHORT).show();
                break;
        }

    }
}
