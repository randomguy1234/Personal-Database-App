package com.example.selfapp.personaldatabase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        CheckBox check1, check2, check3;
        Button btn1= findViewById(R.id.buttonSearch2);
        check1= findViewById(R.id.checkBox1);
        check2= findViewById(R.id.checkBox2);
        check3= findViewById(R.id.checkBox3);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //create switch for 7 cases, all should transfer to new activity
                //may need SQL for custom search
            }
        });
    }
}
