package com.example.nirmal.vitfinal;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;
import android.content.Intent;
import android.net.Uri;



/**
 * A simple {@link Fragment} subclass.
 */
public class rapidfragment extends Fragment {

    View m;
    Button b1,b2;
    public rapidfragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        m=inflater.inflate(R.layout.fragment_rapidfragment, container, false);
        b1=(Button)m.findViewById(R.id.button9);
        b2=(Button)m.findViewById(R.id.button11);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phone="tel:9597108145";
                call();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phone="tel:9597108145";
                brow();
            }});
        ((MainActivity)getActivity()).setActionBarTitle("RapidFire");
        return m;
    }
    private void call() {

        Intent call = new Intent(Intent.ACTION_DIAL);
        call.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        call.setData(Uri.parse("tel:" + "9597108145"));
        getActivity().startActivity(call);
    }


    public void brow()
    {
        Intent browseintent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://vibrance.eventze.in"));
        getActivity().startActivity(browseintent);
    }

}
