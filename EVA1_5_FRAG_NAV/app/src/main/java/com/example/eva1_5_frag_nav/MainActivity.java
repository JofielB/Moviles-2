package com.example.eva1_5_frag_nav;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        ButtonFragment btnFrag = new ButtonFragment();
        fragmentTransaction.replace(R.id.frameLayMain,btnFrag);
        fragmentTransaction.commit();
    }

    public void replaceFragment(){
        FragmentTransaction fragTr = getSupportFragmentManager().beginTransaction();
        ColorFragment colorFg = new ColorFragment();
        fragTr.replace(R.id.frameLayMain, colorFg);
        fragTr.commit();
    }
}
