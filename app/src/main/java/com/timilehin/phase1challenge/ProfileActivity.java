package com.timilehin.phase1challenge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        getSupportActionBar().setTitle("MY PROFILE");

        ImageView profilePicture =(ImageView) findViewById(R.id.imageView);
        profilePicture.setImageResource(R.drawable.profile);
    }
}
