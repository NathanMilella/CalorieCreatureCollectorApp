package com.example.caloriecreaturecollectorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MyWorkouts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_workouts);

        ArrayList<String> displayNotes = new ArrayList<>();
        displayNotes.add("Workout 1\nActivity Type:\nDistance:\nDuration:");
        displayNotes.add("Workout 2\nActivity Type:\nDistance:\nDuration:");
        displayNotes.add("Workout 3\nActivity Type:\nDistance:\nDuration:");

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, displayNotes);
        ListView listView = (ListView) findViewById(R.id.workoutListView);
        listView.setAdapter(adapter);
    }
}