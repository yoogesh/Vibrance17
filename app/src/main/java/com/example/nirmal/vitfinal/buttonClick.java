package com.example.nirmal.vitfinal;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by nirmal on 17/1/17.
 */

public class buttonClick extends Fragment {
    TextView cardText,CardText1,CardText2;
    ImageView imgView;
    String s1;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View subView = inflater.inflate(R.layout.cardview,container,false);
        setAllString();
        cardText = (TextView)subView.findViewById(R.id.cardview_text);
        imgView = (ImageView)subView.findViewById(R.id.image_cardview);

        checkButtonthatwasClicked();
        //cardText.setText(VariableHolders.buttonThatWasClicked);
        return subView;
    }
    void checkButtonthatwasClicked(){
        String check = VariableHolders.buttonThatWasClicked;
        if(check.equals("RapidFire")){
            cardText.setText(s1);
            //imgView.setImageResource(R.drawable.rapidfire);
        }
        else if(check.equals("Debate")){
            cardText.setText(check);
           // imgView.setImageResource(R.drawable.cla);
        }
    }
    void setAllString(){
        s1 = "This is Rapid Fire :)";
    }


}
