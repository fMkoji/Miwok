package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers2);

        ArrayList <String> list = new ArrayList<String>();
        list.add(0,"One");
        list.add(1,"Two");
        list.add(2,"Three");
        list.add(3,"Four");
        list.add(4,"Five");
        list.add(5,"Six");
        list.add(6,"Seven");
        list.add(7,"Eight");
        list.add(8,"Nine");
        list.add(9,"Ten");

//String[] words =new String[10];
//words[0] = "One";
//words[1] = "Two";
//words[2] = "Three";
//words[3] = "Four";
//words[4] = "Five";
Log.v("NumberActivity", "The word at index 4: " + list.get(4));
//words[5] = "Six";
//words[6] = "Seven";
Log.v("NumberActivity", "The word at index 6: " + list.get(6));
//words[7] = "Eight";
//words[8] = "Nine";
//words[9] = "Ten";

    }


}
