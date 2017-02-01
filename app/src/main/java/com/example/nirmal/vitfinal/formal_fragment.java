package com.example.nirmal.vitfinal;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by nirmal on 17/1/17.
 */

public class formal_fragment extends Fragment {
    Button but1,but2,but3,but4,but5,but6,but8,but9;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View subView =  inflater.inflate(R.layout.fragment_formal,container,false);
        but1 = (Button)subView.findViewById(R.id.button1);
        but2 = (Button)subView.findViewById(R.id.button2);
        but3 = (Button)subView.findViewById(R.id.button3);
        but4 = (Button)subView.findViewById(R.id.button4);
        but5 = (Button)subView.findViewById(R.id.button5);
        but6 = (Button)subView.findViewById(R.id.button6);
        but8 = (Button)subView.findViewById(R.id.button8);
        but9 = (Button)subView.findViewById(R.id.button9);


        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentManager fm = getActivity().getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.content_main,new rapidfragment()).commit();



            }
        });
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getActivity().getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.content_main,new debatefragment()).commit();

            }
        });
        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentManager fm = getActivity().getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.content_main, new sherlock()).commit();
            }
        });
        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentManager fm = getActivity().getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.content_main, new Shipwreck()).commit();
            }
        });


        but5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentManager fm = getActivity().getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.content_main, new adzap()).commit();
            }
        });

        but6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentManager fm = getActivity().getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.content_main, new turncoat()).commit();
            }
        });





























        return subView;

    }
}
