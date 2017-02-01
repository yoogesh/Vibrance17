package com.example.nirmal.vitfinal;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ViewFlipper;

/**
 * Created by nirmal on 17/1/17.
 */

public class main_fragment extends Fragment {
    Animation Fade_in,Fade_out;
    ViewFlipper viewflipper;
int mf=0;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View subView = inflater.inflate(R.layout.fragment_main,container,false);

        viewflipper=(ViewFlipper)subView.findViewById(R.id.bckgroundviewflipper1);

        Fade_in= AnimationUtils.loadAnimation(getActivity(),android.R.anim.fade_in);

        Fade_out=AnimationUtils.loadAnimation(getActivity(),android.R.anim.fade_out);

  //      viewflipper.setInAnimation(Fade_in);
   //     viewflipper.setOutAnimation(Fade_out);
     //   viewflipper.setAutoStart(true);
 //       viewflipper.showNext();
   //     viewflipper.setFlipInterval(3500);
       viewflipper.setInAnimation(Fade_in);
        viewflipper.setOutAnimation(Fade_out);
        viewflipper.setAutoStart(true);
        viewflipper.setFlipInterval(3500);
        viewflipper.startFlipping();
        return subView;

    }
}
