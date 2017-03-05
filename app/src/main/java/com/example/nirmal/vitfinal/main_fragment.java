package com.example.nirmal.vitfinal;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ViewFlipper;
import android.widget.Button;

/**
 * Created by nirmal on 17/1/17.
 */

public class main_fragment extends Fragment {
    Animation Fade_in,Fade_out;
    Button m1,m2,m3,m4,b1,b2,b3,b4,b5,b6,b7,b8;
    ViewFlipper viewflipper;
int mf=0;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View subView = inflater.inflate(R.layout.fragment_main,container,false);

        viewflipper=(ViewFlipper)subView.findViewById(R.id.bckgroundviewflipper1);

        Fade_in= AnimationUtils.loadAnimation(getActivity(),android.R.anim.fade_in);

        Fade_out=AnimationUtils.loadAnimation(getActivity(),android.R.anim.fade_out);
        m1=(Button)subView.findViewById(R.id.buttonm1);
        m2=(Button)subView.findViewById(R.id.buttonm2);
        m3=(Button)subView.findViewById(R.id.buttonm3);
        m4=(Button)subView.findViewById(R.id.buttonm4);

        b1=(Button)subView.findViewById(R.id.button1);
        b2=(Button)subView.findViewById(R.id.button2);
        b3=(Button)subView.findViewById(R.id.button3);
        b4=(Button)subView.findViewById(R.id.button4);
        b5=(Button)subView.findViewById(R.id.button5);
        b6=(Button)subView.findViewById(R.id.button6);
        b7=(Button)subView.findViewById(R.id.button7);
        b8=(Button)subView.findViewById(R.id.button8);


       viewflipper.setInAnimation(Fade_in);
        viewflipper.setOutAnimation(Fade_out);
        viewflipper.setAutoStart(true);
        viewflipper.setFlipInterval(2500);
        viewflipper.startFlipping();




        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                FragmentManager fm = getActivity().getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.content_main,new formal_fragment()).commit();

            }
        });
        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                FragmentManager fm = getActivity().getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.content_main,new informal_fragment()).commit();

            }
        });

        m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                FragmentManager fm = getActivity().getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.content_main,new culturals_fragment()).commit();

            }
        });
        m4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                FragmentManager fm = getActivity().getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.content_main,new sports_fragment()).commit();

            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                FragmentManager fm = getActivity().getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.content_main,new rapidfragment()).commit();

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                FragmentManager fm = getActivity().getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.content_main,new debatefragment()).commit();

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                FragmentManager fm = getActivity().getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.content_main,new sherlock()).commit();

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                FragmentManager fm = getActivity().getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.content_main,new Shipwreck()).commit();

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                FragmentManager fm = getActivity().getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.content_main,new Bobe()).commit();

            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                FragmentManager fm = getActivity().getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.content_main,new Dancesolo()).commit();

            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                FragmentManager fm = getActivity().getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.content_main,new handball()).commit();

            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                FragmentManager fm = getActivity().getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.content_main,new cric()).commit();

            }
        });
        ((MainActivity)getActivity()).setActionBarTitle("RapidFire");
        return subView;

    }

}
