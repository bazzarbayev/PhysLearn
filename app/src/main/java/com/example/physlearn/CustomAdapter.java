package com.example.physlearn;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends ArrayAdapter<Result> {
    List<Result> results;
    Context context;
    DBHelperResult dbHelperResult;



    public CustomAdapter(Context context, List<Result> results, DBHelperResult dbHelperResult) {
        super(context, R.layout.itemrow, results);
        this.context = context;
        this.results = results;
        this.dbHelperResult = dbHelperResult;

    }

    public CustomAdapter(Context context, List<Result> resultList) {
        super(context,R.layout.itemrow,resultList);
        this.context = context;
        this.results = resultList;
    }


    @Override
    public View getView(final int position, final View convertView, ViewGroup parent){
        LayoutInflater inflater;
        View customView;
        TextView name, date, score;

        inflater = LayoutInflater.from(getContext());
        customView = inflater.inflate(R.layout.itemrow, parent, false);
        score = (TextView)customView.findViewById(R.id.score);
        name = (TextView)customView.findViewById(R.id.name);
        date = (TextView)customView.findViewById(R.id.date);

        score.setText(results.get(position).getRESULT());
        name.setText(results.get(position).getNAME());
        date.setText(results.get(position).getDATE());

        return customView;
    }
}