package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

import com.example.myapplication2.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    //FragmentTransaction transaction;
    //FragmentManager fragmentManager = getSupportFragmentManager();
    //Fragment firstFragment, secondFragment;

    private EditText name_input_1,description_input;
    private RecyclerView recyclerView;
    


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //firstFragment = new FirstFragment();
        //secondFragment = new SecondFragment();
        //getSupportFragmentManager().beginTransaction().add(R.id.contenedorFragmentos,firstFragment);
    }





}