package com.example.prueba;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.prueba.databinding.ActivityMainBinding;

public class MainActivity extends Activity {

    private TextView mTextView;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }
}