package com.example.physlearn.Fragments;


import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.physlearn.DbHelper1;
import com.example.physlearn.Question1;
import com.example.physlearn.R;
import com.example.physlearn.Activities.Result1Activity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Stack;
import java.util.concurrent.TimeUnit;

public class QuizFragment extends Fragment {

    List<Question1> quesList;
    int score = 0;
    int qid = 0;
    int qnum = 1;

    int temp = 0;
    Random random;
    Question1 currentQ;
    TextView txtQuestion, times;
    RadioButton rda, rdb, rdc, rdd;
    Button btnnext, btnff;
    ImageView starimg, nextimg, ffimg;

    Stack<Integer> myStack;
    List<View> radiolist;
    DbHelper1 db;
    View tempView;


    public QuizFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_quiz, container, false);

        myStack = new Stack<Integer>();

        random = new Random();

        db = new DbHelper1(getContext());
        quesList = db.getAllQuestions();

        txtQuestion = (TextView) v.findViewById(R.id.textView1);
        rda = (RadioButton) v.findViewById(R.id.radio0);
        rdb = (RadioButton) v.findViewById(R.id.radio1);
        rdc = (RadioButton) v.findViewById(R.id.radio2);
        rdd = (RadioButton) v.findViewById(R.id.radio3);
        btnnext = (Button) v.findViewById(R.id.btnnext);
        btnff = (Button) v.findViewById(R.id.btnff);

        times = (TextView) v.findViewById(R.id.timers);
        // method which will set the things up for our game
        setQuestionView();
        times.setText("00:02:00");
        // A timer of 60 seconds to play for, with an interval of 1 second (1000 milliseconds)
        CounterClass timer = new CounterClass(120000, 1000);
        timer.start();

        radiolist = new ArrayList<View>(Arrays.asList(rda, rdb, rdc, rdd));
        for (int i = 0; i < db.rowcount(); i++) {
            myStack.push(i);
        }
        Collections.shuffle(myStack);
        setQuestionView();

        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioGroup grp = (RadioGroup) getView().findViewById(R.id.radioGroup1);
                RadioButton answer = (RadioButton) getView().findViewById(grp.getCheckedRadioButtonId());
                Log.d("yourans", currentQ.getANSWER() + " " + answer.getText());
                if (currentQ.getANSWER().equals(answer.getText())) {
                    score++;
                    Log.d("score", "Your score " + score);
                }
                if (qnum < 10) {
                    currentQ = quesList.get(qid);
                    qnum++;
                    setQuestionView();
                } else {
                    Intent intent = new Intent(getActivity(), Result1Activity.class);
                    Bundle b = new Bundle();
                    b.putInt("score", score); //Your score
                    intent.putExtras(b); //Put your score to your next Intent
                    startActivity(intent);

                }
            }
        });
        btnff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                radiolist.clear();
                if (rdd.getText().equals(currentQ.getANSWER())) {
                    tempView = rdd;
                } else if (rdc.getText().equals(currentQ.getANSWER())) {
                    tempView = rdc;
                } else if (rdb.getText().equals(currentQ.getANSWER())) {
                    tempView = rdb;
                } else if (rda.getText().equals(currentQ.getANSWER())) {
                    tempView = rda;
                }
                if (tempView != rdd) {
                    radiolist.add(rdd);
                }
                if (tempView != rdc) {
                    radiolist.add(rdc);
                }
                if (tempView != rdb) {
                    radiolist.add(rdb);
                }
                if (tempView != rda) {
                    radiolist.add(rda);
                }
                Collections.shuffle(radiolist);
                radiolist.get(0).setVisibility(View.INVISIBLE);
                radiolist.get(1).setVisibility(View.INVISIBLE);
                btnff.setEnabled(false);
            }
        });

        return v;
    }

    private void setQuestionView()
    {
        if (!myStack.isEmpty()){
            qid = myStack.pop();
            currentQ=quesList.get(qid);
            txtQuestion.setText(qnum + ". " + currentQ.getQUESTION());
            rda.setText(currentQ.getOPTA());
            rdb.setText(currentQ.getOPTB());
            rdc.setText(currentQ.getOPTC());
            rdd.setText(currentQ.getOPTD());

            rda.setVisibility(View.VISIBLE);
            rdb.setVisibility(View.VISIBLE);
            rdc.setVisibility(View.VISIBLE);
            rdd.setVisibility(View.VISIBLE);
            rda.setChecked(true);
            btnff.setEnabled(true);
        }
    }

    private class CounterClass extends CountDownTimer {
        public CounterClass(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
            // TODO Auto-generated constructor stub
        }
        @Override
        public void onFinish() {
            times.setText("Time is up");
            qnum = 10;
        }
        @Override
        public void onTick(long millisUntilFinished) {
            // TODO Auto-generated method stub
            long millis = millisUntilFinished;
            String hms = String.format(
                    "%02d:%02d:%02d",
                    TimeUnit.MILLISECONDS.toHours(millis),
                    TimeUnit.MILLISECONDS.toMinutes(millis)
                            - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS
                            .toHours(millis)),
                    TimeUnit.MILLISECONDS.toSeconds(millis)
                            - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS
                            .toMinutes(millis)));
            System.out.println(hms);
            times.setText(hms);

        }

    }


}
