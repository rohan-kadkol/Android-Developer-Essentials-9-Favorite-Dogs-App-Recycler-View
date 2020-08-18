package com.rohankadkol.favoritedogsapprecyclerview9;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.rohankadkol.favoritedogsapprecyclerview9.adapters.DogsAdapter;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRvDogs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRvDogs = findViewById(R.id.rv_dogs);

        DogsAdapter adapter = new DogsAdapter(this);
        mRvDogs.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        mRvDogs.setLayoutManager(layoutManager);
    }
}
