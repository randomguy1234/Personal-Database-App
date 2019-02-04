package com.example.selfapp.personaldatabase;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity
{
    DatabaseHelper db;
    Button add1, delete1, view1, search1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        db= new DatabaseHelper(this);

        /*Toast toast= Toast.makeText(getApplicationContext(),"Welcome to Main Menu",Toast.LENGTH_LONG);
        toast.show();*/

        add1= findViewById(R.id.add_button1);
        delete1= findViewById(R.id.delete_button1);
        view1= findViewById(R.id.change_button1);
        search1= findViewById(R.id.search_button1);

        //default layout of app is Landscape, may change in future

        add1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //go to Add Activity
                Intent intent= new Intent(HomeActivity.this,AddActivity.class);
                startActivity(intent);
            }
        });

        delete1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //go to Delete Activity
                Intent intent= new Intent(HomeActivity.this,DeleteActivity.class);
                startActivity(intent);
            }
        });

        view1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //go to Database Activity
                Intent intent= new Intent(HomeActivity.this,DatabaseActivity.class);
                startActivity(intent);
            }
        });

        search1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //go to Search Activity
                Intent intent= new Intent(HomeActivity.this,SearchActivity.class);
                startActivity(intent);
            }
        });
    }
}
