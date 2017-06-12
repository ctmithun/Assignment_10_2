package com.billionman.com.assignment_10_2;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class Frag_List extends Fragment {

    MainActivity activity = null;

    public Frag_List() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_frag__list, container, false);
        ListView listView = (ListView) v.findViewById(R.id.list_item);
        final String item[]={"layout1","layout2","layout3","layout4"};
        ArrayAdapter arrayAdapter = new ArrayAdapter(getContext(),android.R.layout.simple_list_item_1,item);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                activity.onListClick(item[i]);
            }
        });
        return v;
    }


    @Override
    public void onAttach(Context ctx) {
        super.onAttach(ctx);
        this.activity = (MainActivity) ctx;
        System.out.println(activity.getClass());
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}
