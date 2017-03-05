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

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

/**
 * A simple {@link Fragment} subclass.
 */
public class mapp extends Fragment implements OnMapReadyCallback {

    GoogleMap gmap;
    MapView mvi;
    View mview;
    public mapp() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mview= inflater.inflate(R.layout.fragment_mapp, container, false);
        return mview;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {

        super.onViewCreated(view,savedInstanceState);
        mvi=(MapView)mview.findViewById(R.id.map);

        if(mvi!=null)

        {
            mvi.onCreate(null);
            mvi.onResume();
            mvi.getMapAsync(this);


        }
    }







    @Override
    public void onMapReady(GoogleMap googleMap) {
        MapsInitializer.initialize(getActivity());

        gmap=googleMap;
        googleMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
        googleMap.addMarker(new MarkerOptions().position(new LatLng(12.8426 , 80.1529)).title("Vit Chennai").snippet("Welcome to vibrance 2017"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(12.8434 , 80.1535)).title("Vit Chennai").snippet("Academic block"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(12.8432 , 80.1566)).title("Vit Chennai").snippet("Academic block II "));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(12.8426 , 80.1570)).title("Vit Chennai").snippet("Hostel B block  "));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(12.8431 , 80.1579)).title("Vit Chennai").snippet("Hostel C block  "));


        CameraPosition mypo=CameraPosition.builder().target(new LatLng(12.8426 , 80.1549)).zoom(16).bearing(0).tilt(0).build();
        googleMap.moveCamera(CameraUpdateFactory.newCameraPosition(mypo));
    }

}
