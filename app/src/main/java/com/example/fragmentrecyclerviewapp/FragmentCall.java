package com.example.fragmentrecyclerviewapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * *Created by qendev on 23/05/2019.
 */

public class FragmentCall extends Fragment {

    View v;




    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
         v=inflater.inflate(R.layout.call_fragment,container,false);
        return v;
    }

    public FragmentCall() {
    }
}
