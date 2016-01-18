package com.activity.homework_android_activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //requestCode we use for receiving results.
    static final private int GET_CODE = 0;
    static final private int GET_CODE2 = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called from button with id btnDate
     * @param view
     */
    public void getDate(View view){

        Intent intent = new Intent(MainActivity.this, Activity1.class);                    //Called activity

        startActivityForResult(intent, GET_CODE);

    }

    /**
     * Called from button with id btnDay
     * @param view
     */
    public void getDay(View view){

        Intent intent = new Intent(MainActivity.this, //Context
                Activity2.class);                    //Called activity

        startActivityForResult(intent, GET_CODE2);

    }


    /**
     * This method is called when the called activity has finished, with the
     * RESULT it supplied.
     *
     * @param requestCode The original request code as given to startActivity().
     * @param resultCode From sending activity as per setResult().
     * @param data From sending activity as per setResult().
     */
    @Override
    protected void onActivityResult(int requestCode, int resultCode,
                                    Intent data) {

        if (resultCode != RESULT_CANCELED) {

            if (requestCode == GET_CODE) {

                TextView textView = (TextView) findViewById(R.id.tvDate);
                textView.setText(data.getAction());
            }else if (requestCode == GET_CODE2){

                TextView textView = (TextView) findViewById(R.id.tvDay);
                textView.setText(data.getAction());

            }else {
                finish();

            }


        }
    }


}
