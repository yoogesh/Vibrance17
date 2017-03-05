package com.example.nirmal.vitfinal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.zip.Inflater;

/**
 * Created by RamYoogesh on 10/02/17.
 */

public class CustomAdapter extends BaseAdapter {

    public String items[];
    public int img[];

    PrimaryFragment pm;
    LayoutInflater mLayoutInflater=null;
    public CustomAdapter(PrimaryFragment pm,String items[],int img[])
    {
this.items=items;
        this.img=img;
        this.pm=pm;




    }


    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }
}
