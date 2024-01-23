package com.example.pertemuan13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity implements UpperFragment.OnFragmentInteractionListener{

    UpperFragment upperFragment;
    LowerFragment lowerFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(findViewById(R.id.upper_fragment_container) != null){
            if(savedInstanceState != null){
                return;
            }
            upperFragment = new UpperFragment();
            upperFragment.setArguments(getIntent().getExtras());
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.upper_fragment_container, upperFragment).commit();
        }

        if(findViewById(R.id.lower_fragment_container) != null){
            if(savedInstanceState != null){
                return;
            }
            lowerFragment = new LowerFragment();
            lowerFragment.setArguments(getIntent().getExtras());
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.lower_fragment_container, lowerFragment).commit();
        }
    }

    @Override
    public void onFragmentInteraction(String sentence) {
        Log.v("upperFragment", "Activity dapat pesan dari upper fragment " + sentence);
        lowerFragment.kasihHasil(sentence);
    }
}