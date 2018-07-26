package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers2);

        ArrayList<String> list = new ArrayList<String>();
        list.add(0, "One");
        list.add(1, "Two");
        list.add(2, "Three");
        list.add(3, "Four");
        list.add(4, "Five");
        list.add(5, "Six");
        list.add(6, "Seven");
        list.add(7, "Eight");
        list.add(8, "Nine");
        list.add(9, "Ten");

        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);


//        int index = 0;
//
//        while (index <= 9) {
//
//            TextView wordView = new TextView(this);
//            wordView.setText(list.get(index));
//            rootView.addView(wordView);
//            index++;
//        }
        for (int index = 0; index < 10; index++) {
            TextView wordView = new TextView(this);
            wordView.setText(list.get(index));
            rootView.addView(wordView);
        }

    }


}
