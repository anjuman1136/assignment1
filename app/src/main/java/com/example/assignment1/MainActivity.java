package com.example.assignment1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView myTextView;
    private ImageView myImageView;
    private Button myButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initializing views
        myTextView = findViewById(R.id.myTextView);
        myImageView = findViewById(R.id.myImageView);
        myButton = findViewById(R.id.myButton);

        // Setting up Button click listener
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Show Toast message
                Toast.makeText(MainActivity.this, "Button Clicked!", Toast.LENGTH_SHORT).show();

                // Changing TextView text
                myTextView.setText("Button was clicked!");

                // Optionally you could change the image here:
                // myImageView.setImageResource(R.drawable.new_image);
            }
        });
    }
}
