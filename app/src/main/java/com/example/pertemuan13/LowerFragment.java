package com.example.pertemuan13;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class LowerFragment extends Fragment {

    TextView tvResult;
    public LowerFragment(){}

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.lower_fragment, container, false);
        tvResult = rootView.findViewById(R.id.tvResult);
        return rootView;
    }

    public void kasihHasil(String sentence){
        tvResult.setText(sentence);
    }
}
