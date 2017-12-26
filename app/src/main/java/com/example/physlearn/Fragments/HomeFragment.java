package com.example.physlearn.Fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.physlearn.Modules.Module1;
import com.example.physlearn.Modules.Module2;
import com.example.physlearn.Modules.Module3;
import com.example.physlearn.Modules.Module4;
import com.example.physlearn.Modules.Module5;
import com.example.physlearn.R;


public class HomeFragment extends Fragment implements View.OnClickListener{

    Button btnmod1, btnmod2, btnmod3, btnmod4, btnmod5;



    public HomeFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_home, container, false);

        btnmod1 = (Button) v.findViewById(R.id.btnmod1);
        btnmod1.setOnClickListener(this);

        btnmod2 = (Button)v.findViewById(R.id.btnmod2);
        btnmod2.setOnClickListener(this);

        btnmod3 = (Button)v.findViewById(R.id.btnmod3);
        btnmod3.setOnClickListener(this);

        btnmod4 = (Button)v.findViewById(R.id.btnmod4);
        btnmod4.setOnClickListener(this);

        btnmod5 = (Button)v.findViewById(R.id.btnmod5);
        btnmod5.setOnClickListener(this);



        return v;
    }

    @Override
    public void onClick(View v) {
        Intent intent;

        switch (v.getId()){
            case R.id.btnmod1:
                intent = new Intent(getActivity(), Module1.class);
                startActivity(intent);
                break;
            case R.id.btnmod2:
                intent = new Intent(getActivity(), Module2.class);
                startActivity(intent);
                break;
            case R.id.btnmod3:
                intent = new Intent(getActivity(), Module3.class);
                startActivity(intent);
                break;
            case R.id.btnmod4:
                intent = new Intent(getActivity(), Module4.class);
                startActivity(intent);
                break;
            case R.id.btnmod5:
                intent = new Intent(getActivity(), Module5.class);
                startActivity(intent);
                break;

        }
    }
}
