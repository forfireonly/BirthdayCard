package com.example.birthdaycard;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;

public class NewImageFragment extends Fragment {

    @Override

    public View  onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.new_image_fragment, parent, false);
        ButterKnife.bind(this, view);
        return view;
    }
}
