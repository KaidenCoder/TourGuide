package com.example.android.tourguide;
/**
 * This project is done by Khaidem Sandip Singha under the Udacity Android Foundations Nanodegree program.
 *
 * I confirm that this submission is my own work. I have not used code from any other Udacity student's or graduate's submission of the same project.
 * I understand that Udacity will check my submission for plagiarism, and that failure to adhere to the Udacity Honor Code may result in the cancellation of my
 * enrollment.
 */
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the TopAttractions category
        TextView attractions = findViewById(R.id.attractions);

        // Set a click listener on that View
        attractions.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the TopAttractions category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link TopAttractions}
                Intent attractionsIntent = new Intent(MainActivity.this, TopAttractions.class);
                // Start the new activity
                startActivity(attractionsIntent);
            }
        });

        // Find the View that shows the Restaurants category
        TextView restaurants = findViewById(R.id.restaurants);
        // Set a click listener on that View
        restaurants.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Restaurants category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link Restaurants}
                Intent restaurantsIntent = new Intent(MainActivity.this, Restaurants.class);
                // Start the new activity
                startActivity(restaurantsIntent);
            }
        });

        // Find the View that shows the PublicPlaces category
        TextView publicPlaces = findViewById(R.id.publicPlaces);
        // Set a click listener on that View
        publicPlaces.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the PublicPlaces category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PublicPlaces}
                Intent publicIntent = new Intent(MainActivity.this, PublicPlaces.class);
                // Start the new activity
                startActivity(publicIntent);
            }
        });

        // Find the View that shows the CityEvents category
        TextView cityEvents = findViewById(R.id.cityEvents);
        // Set a click listener on that View
        cityEvents.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the CityEvents category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link CityEvents}
                Intent cityIntent = new Intent(MainActivity.this, CityEvents.class);
                // Start the new activity
                startActivity(cityIntent);
            }
        });
    }
}
