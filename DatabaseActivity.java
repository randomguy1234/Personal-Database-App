package com.example.selfapp.personaldatabase;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import de.codecrafters.tableview.TableView;
import de.codecrafters.tableview.toolkit.SimpleTableHeaderAdapter;

public class DatabaseActivity extends AppCompatActivity {

    //DatabaseHelper db;

    //may need to take out codecrafters stuff and switch to dynamic table layout
    final static String[] header={"Card Name","Card Type","Card Info","Attribute","ATK","DEF","Lv/Rank/Link#","Card Text","Effect 1","Effect 2","Effect 3","Effect 4"};
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_database);

        TableView<String[]> tableView= findViewById(R.id.tableView);
        tableView.setColumnCount(12);
        tableView.setHeaderAdapter(new SimpleTableHeaderAdapter(this,header));

        //add code to enable the data to be read by the uses later
        /*
        Cursor result= db.getData();

        */
    }
}
