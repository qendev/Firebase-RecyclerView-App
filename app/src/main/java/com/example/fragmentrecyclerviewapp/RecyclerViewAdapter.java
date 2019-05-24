package com.example.fragmentrecyclerviewapp;

/*
*Created by qendev on 23/05/2019.
 */

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    Context mcontext;
    List<Contact> mData;
    Dialog mydialog;

    public RecyclerViewAdapter(Context mcontext, List<Contact> mData) {
        this.mcontext = mcontext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View v;
        v=LayoutInflater.from(mcontext).inflate(R.layout.item_contact,viewGroup,false);
        final MyViewHolder vHolder=new MyViewHolder(v);


        //Dialog ini.

        mydialog=new Dialog(mcontext);
        mydialog.setContentView(R.layout.dialog_contact);

        vHolder.item_contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView dialog_name_tv=(TextView)mydialog.findViewById(R.id.dialog_name_id);
                TextView dialog_phone_tv=(TextView)mydialog.findViewById(R.id.dialog_phone_id);
                ImageView dialog_contact_img=(ImageView)mydialog.findViewById(R.id.dialog_img);
                dialog_name_tv.setText(mData.get(vHolder.getAdapterPosition()).getName());
                dialog_phone_tv.setText(mData.get(vHolder.getAdapterPosition()).getPhone());
                dialog_contact_img.setImageResource(mData.get(vHolder.getAdapterPosition()).getPhoto());

                Toast.makeText(mcontext, "Test Click" + String.valueOf(vHolder.getAdapterPosition()), Toast.LENGTH_SHORT).show();
                mydialog.show();
            }
        });


        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {

        myViewHolder.tv_name.setText(mData.get(i).getName());
        myViewHolder.tv_phone.setText(mData.get(i).getPhone());
        myViewHolder.img.setImageResource(mData.get(i).getPhoto());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        private LinearLayout item_contact;
        private TextView tv_name;
        private TextView tv_phone;
        private ImageView img;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            item_contact=(LinearLayout) itemView.findViewById(R.id.contact_item_id);
            tv_name=(TextView) itemView.findViewById(R.id.name_contact);
            tv_phone=(TextView) itemView.findViewById(R.id.phone_contact);
            img=(ImageView) itemView.findViewById(R.id.img_contact);

        }
    }



}
