package com.example.mtrlab.tutorial1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //define text view object
    TextView txtView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Set the textview within the layout for class object
        txtView2= findViewById(R.id.textView2);

        //This set the value of Msg2 as the text string
        txtView2.setText(R.string.Msg2);

        Log.i("LifeCycle","OnCreate() Invoked!!!");

    }
    public void onStart()
    {
        super.onStart();
        Log.i("LifeCycle","OnStart() Invoked !!!");
    }
    public void OnRestart()
    {
        super.onRestart();
        Log.i("LifeCycle","OnReStart() Invoked !!!");
    }

    public void OnStop()
    {
        super.onStop();
        Log.i("LifeCycle","OnStop() Invoked !!!");
    }

    public void onResume()
    {
        super.onResume();
        Log.i("LifeCycle","OnResume() Invoked!!!");
    }

}
