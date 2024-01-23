package com.example.pertemuan13;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class UpperFragment extends Fragment {
    Button btnPotato, btnTomato;
    public UpperFragment(){}

    // generate override klik kanan
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.upper_fragment, container, false);

        btnPotato = rootView.findViewById(R.id.btnPotato);
        btnPotato.setOnClickListener(v -> {
            Log.v("upperFragment", "potato di klik");
            onPotato();
        });

        btnTomato = rootView.findViewById(R.id.btnTomato);
        btnTomato.setOnClickListener(v -> {
            Log.v("upperFragment", "tomato di klik");
            onTomato();
        });
        return rootView;
    }

    OnFragmentInteractionListener mListener;
    public interface OnFragmentInteractionListener{
        void onFragmentInteraction(String sentence);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if(context instanceof OnFragmentInteractionListener){
            mListener = (OnFragmentInteractionListener) context;
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    public void onPotato(){
        if(mListener != null){
            mListener.onFragmentInteraction("This is potato");
        }
    }

    public void onTomato(){
        if(mListener != null){
            mListener.onFragmentInteraction("This is tomato");
        }
    }
}
