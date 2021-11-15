package com.example.caloriecreaturecollectorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

//import com.example.calorie_creature_collector.R;

import java.util.ArrayList;

public class MyFitnessGoals extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_fitness_goals);

        ArrayList<String> displayNotes = new ArrayList<>();
        displayNotes.add("Goal 1\n.....");
        displayNotes.add("Goal 2\n.....");
        displayNotes.add("Goal 3\n.....");

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, displayNotes);
        ListView listView = (ListView) findViewById(R.id.goalsListView);
        listView.setAdapter(adapter);
    }
}