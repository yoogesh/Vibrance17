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
 * A simple {@link Fragment} subclass.
 */
public class drame_club extends Fragment {

    Button but1,but2,but3,but4,but5;
    public drame_club() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View subView=inflater.inflate(R.layout.fragment_drame_club, container, false);
        but1 = (Button)subView.findViewById(R.id.button1);
        but2 = (Button)subView.findViewById(R.id.button2);
        but3 = (Button)subView.findViewById(R.id.button3);
        but4 = (Button)subView.findViewById(R.id.button4);
        but5 = (Button)subView.findViewById(R.id.button5);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentManager fm = getActivity().getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.content_main,new sherlock()).commit();



            }
        });
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getActivity().getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.content_main,new reel()).commit();

            }
        });
        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentManager fm = getActivity().getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.content_main, new Shipwreck()).commit();
            }
        });
        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentManager fm = getActivity().getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.content_main, new sherlock()).commit();
            }
        });

        return subView;
    }

}
