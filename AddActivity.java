package com.example.selfapp.personaldatabase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AddActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        Button btn1= findViewById(R.id.add2);
        Button btn2= findViewById(R.id.clear1);
        Button btn3= findViewById(R.id.effects1);

        EditText et1= findViewById(R.id.editText1);
        EditText et2= findViewById(R.id.editText2);
        EditText et3= findViewById(R.id.editText3);
        EditText et4= findViewById(R.id.editText4);
        EditText et5= findViewById(R.id.editText5);
        EditText et6= findViewById(R.id.editText6);
        EditText et7= findViewById(R.id.editText7);
        EditText et8= findViewById(R.id.editText8);
        EditText et9= findViewById(R.id.editText9A);
        EditText et10= findViewById(R.id.editText9B);
        EditText et11= findViewById(R.id.editText9C);
        EditText et12= findViewById(R.id.editText9D);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //enter data to database, may need SQL here

                //add message stating that card has been added when pressed
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //clear data entered above, may need SQL here
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //go to Effects Activity
                Intent intent= new Intent(AddActivity.this,EffectsActivity.class);
                startActivity(intent);
            }
        });
    }
}
