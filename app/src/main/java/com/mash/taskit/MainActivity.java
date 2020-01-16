package com.mash.taskit;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.mash.taskit.Screen.HomeFragment;
import com.mash.taskit.Screen.TaskManagerFragment;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        this.setSupportActionBar(toolbar);

        Button homeButton = findViewById(R.id.mainNav);
        homeButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                //Toast.makeText(getApplicationContext(), "Map", Toast.LENGTH_SHORT).show();
                Fragment fragment = new HomeFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frame, fragment); // replace a Fragment with Frame Layout
                transaction.commit(); // commit the changes
            }
        });

        Button taskManagerButton = findViewById(R.id.taskNav);
        taskManagerButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                //Toast.makeText(getApplicationContext(), "Map", Toast.LENGTH_SHORT).show();
                Fragment fragment = new TaskManagerFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frame, fragment); // replace a Fragment with Frame Layout
                transaction.commit(); // commit the changes
            }
        });



    }
}


