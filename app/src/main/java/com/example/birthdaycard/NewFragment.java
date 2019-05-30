package com.example.birthdaycard;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class NewFragment extends Fragment {

    @BindView(R.id.button)
    Button button;

    @BindView(R.id.button_same_screen)
    Button buttonSameScreen;

    @BindView(R.id.awesomeness_same_screen)
    TextView awesomnessSameScreen;

    boolean flag;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_layout,parent,false);
        // Defines the xml file for the fragment
        ButterKnife.bind(this,view);

        flag = true;


        return view;
    }

    @OnClick(R.id.button)
    public void buttonClicked(){
        Intent openIntent = new Intent(getContext(), NewImage.class);
        startActivity(openIntent);

    }

    @OnClick(R.id.button_same_screen)
    public void buttonSameScreenAction(){
        if (flag){
        awesomnessSameScreen.setVisibility(View.VISIBLE);
        flag = false;}
        else { awesomnessSameScreen.setVisibility(View.INVISIBLE); flag = true;}

    }
}
