package com.example.fragmentrecyclerviewapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qendev on 23/05/2019.
 */

public class FragmentContact extends Fragment {

    View v;
    private RecyclerView myrecyclerview;
    private List<Contact> lstcontact;


    public FragmentContact() {
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v=inflater.inflate(R.layout.contact_fragment,container,false);
        myrecyclerview=(RecyclerView) v.findViewById(R.id.contact_recyclerview);
        RecyclerViewAdapter recyclerAdapter=new RecyclerViewAdapter(getContext(),lstcontact);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(recyclerAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstcontact = new ArrayList<>();
        lstcontact.add(new Contact("Alex Young","(111) 23456789",R.drawable.alexyoung));
        lstcontact.add(new Contact("Amanda Benett","(222) 76894900",R.drawable.amandabenett));
        lstcontact.add(new Contact("Amos White","(333) 57600978",R.drawable.amoswhite));
        lstcontact.add(new Contact("Bryan Cranston","(444) 8769903",R.drawable.bryancranston));
        lstcontact.add(new Contact("Chris Owen","(555) 77667788",R.drawable.chrisowen));
        lstcontact.add(new Contact("Grace Ashley","(667) 87724564",R.drawable.graceashley));
        lstcontact.add(new Contact("Hillary Clinton","(776) 4423432",R.drawable.hillaryclinton));
        lstcontact.add(new Contact("Jake Anderson","(888) 77666555",R.drawable.jakeanderson));
        lstcontact.add(new Contact("Lilian Wade","(456) 66574996",R.drawable.lilianwade));
        lstcontact.add(new Contact("Roy Lyon","(332) 21113300",R.drawable.roylyon));
        lstcontact.add(new Contact("Eddi Kempbell","(776) 65789428",R.drawable.eddiekampbell));







    }
}
