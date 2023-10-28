package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

     boolean longClickDetected = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View workButton = findViewById(R.id.WorkHours);
        workButton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                longClickDetected = true;
                Intent i = new Intent(MainActivity.this, Activity_work.class);
                startActivity(i);
                return true;
            }
        });
    }

    public void call(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:+966920002040"));
        startActivity(i);
    }

    public void about(View view) {
        Intent i = new Intent(this, Activity_about.class);
        startActivity(i);
    }

    public void work(View view) {
        if (!longClickDetected) {
            Toast.makeText(this, "Please long press the button", Toast.LENGTH_SHORT).show();
        }
    }
}