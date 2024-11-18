package com.example.imageviewtoggleapp;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ToggleButton;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;
    private ToggleButton toggleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        toggleButton = findViewById(R.id.toggleButton);

        // Set the initial image
        imageView.setImageResource(R.drawable.image1);

        toggleButton.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                // Change to the second image when the toggle is on
                imageView.setImageResource(R.drawable.image2);
            } else {
                // Change back to the first image when the toggle is off
                imageView.setImageResource(R.drawable.image1);
            }
        });
    }
}
