package com.jasonbutwell.sharedpreferencesdemo;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Storing and Retrieving a value from a Shared Preferences object

        SharedPreferences sharedPreferences = this.getSharedPreferences("com.jasonbutwell.sharedpreferencesdemo", Context.MODE_PRIVATE);

        // Set the value and store it

        sharedPreferences.edit().putString("username","jason").apply();

        // retrieve the value and specify a default too. Which in this case will be a blank string.

        String userName = sharedPreferences.getString("username", "");

        // Send the String that we just retrieved to the logs, to show that we obtained it successfully.

        Log.i("username", userName);

        TextView tv = (TextView) findViewById(R.id.TextView);
        tv.setText("Hello " + userName );
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

        // Check to see if the first Options menu item was selected.

        if (id == R.id.action_settings1) {
            Log.i("select","Item 1 selected");
            return true;
        }

        // CHeck to see if the second Options menu item was selected.

        if (id == R.id.action_settings2) {
            Log.i("select","Item 2 selected");
            return true;
        }

        // CHeck to see if the third Options menu item was selected.

        if (id == R.id.action_settings3) {
            Log.i("select","Item 3 selected");
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
