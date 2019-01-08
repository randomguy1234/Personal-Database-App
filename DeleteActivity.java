package com.example.selfapp.personaldatabase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DeleteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete);

        Button btn1, btn2;
        btn1= findViewById(R.id.button_dr);
        btn2= findViewById(R.id.button_dr);


        //row deletion method
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //go to new activity, show table, ten select rows for deletion, create delete button on bottom of new activity
                //SQL needed here
            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //create confirmation and make it pop up 1st, give Y/N options
                //need SQL for actual delete part

            }
        });
    }
}
