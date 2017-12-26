package com.example.physlearn.Fragments;


import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.physlearn.CustomAdapter;
import com.example.physlearn.DBHelperResult;
import com.example.physlearn.R;
import com.example.physlearn.Result;

import java.util.List;


public class StatisticsFragment extends Fragment {

    ArrayAdapter<Result> adapter;
    List<Result> resultList;
    DBHelperResult dbHelperResult;
    ListView listView;


    public StatisticsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_statistics, container, false);

        listView = (ListView) v.findViewById(R.id.listView);
        CustomAdapter adapter = new CustomAdapter(getActivity(), resultList);

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, final int position, long id) {
                LayoutInflater layoutInflater = LayoutInflater.from(getActivity());
                View promptView = layoutInflater.inflate(R.layout.delete, null);
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(getActivity());
                alertDialogBuilder.setView(promptView);

                final TextView textView = (TextView) promptView.findViewById(R.id.textView);
                textView.setText("Delete?");
                // setup a dialog window
                alertDialogBuilder.setCancelable(false)
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                resultList.remove(position);
                                CustomAdapter adapter = new CustomAdapter(getActivity(), resultList);
                                listView.setAdapter(adapter);
                            }
                        })
                        .setNegativeButton("Cancel",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = alertDialogBuilder.create();
                alert.show();
                return true;
            }
        });



        dbHelperResult = new DBHelperResult(getActivity());
        resultList = dbHelperResult.getAllResults();
        listView = (ListView) v.findViewById(R.id.listView);

        adapter = new CustomAdapter(getActivity(), resultList, dbHelperResult);
        listView.setAdapter(adapter);

        return v;
    }

}
