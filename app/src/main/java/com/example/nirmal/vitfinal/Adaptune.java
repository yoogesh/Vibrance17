package com.example.nirmal.vitfinal;


import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 */
public class Adaptune extends Fragment {

Button b1;
    public Adaptune() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View m=inflater.inflate(R.layout.fragment_adaptune, container, false);
        b1=(Button)m.findViewById(R.id.button9);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String phone="tel:9597108145";



                call();




            }
        });
        ((MainActivity)getActivity()).setActionBarTitle("Adaptune");
        return m;
    }




    private void call() {

        Intent call = new Intent(Intent.ACTION_DIAL);
        call.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        call.setData(Uri.parse("tel:" + "9597108145"));
        getActivity().startActivity(call);
    }

}
