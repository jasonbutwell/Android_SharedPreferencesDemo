package com.jasonbutwell.sharedpreferencesdemo;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
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
}
