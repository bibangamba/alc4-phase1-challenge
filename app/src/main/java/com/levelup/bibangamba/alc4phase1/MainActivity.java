package com.levelup.bibangamba.alc4phase1;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.levelup.bibangamba.alc4phase1.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this,
                R.layout.activity_main);
        binding.aboutAlcButton.setOnClickListener(view -> {
            Intent startAboutALCActivity = new Intent(
                    MainActivity.this, AboutALC.class);
            startActivity(startAboutALCActivity);
        });

        binding.myProfileButton.setOnClickListener(view -> {
            Intent startProfileActivity = new Intent(
                    MainActivity.this, Profile.class);
            startActivity(startProfileActivity);
        });
    }
}
