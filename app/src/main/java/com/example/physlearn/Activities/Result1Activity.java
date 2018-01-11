package com.example.physlearn.Activities;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.physlearn.DBHelperResult;
import com.example.physlearn.Fragments.QuizFragment;
import com.example.physlearn.R;
import com.example.physlearn.Result;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Result1Activity extends AppCompatActivity {


    DBHelperResult dbHelperResult, temp;
    int score;
    String date;
    Button btnSave, btnShow;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result1);



        temp = new DBHelperResult(this);
        dbHelperResult = new DBHelperResult(temp.getContext());

        btnSave = (Button) findViewById(R.id.btnSave);

        btnShow = (Button)findViewById(R.id.btnShow);

        //get text view
        TextView t=(TextView)findViewById(R.id.textResult);
        //get score
        Bundle b = getIntent().getExtras();

        score = b.getInt("score");
        //display score

        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        date = df.format(Calendar.getInstance().getTime());

        switch (score)
        {
            case 0:t.setText("Correct answers 0 from 10 questions");
            case 1:t.setText("Correct answers 1 from 10 questions");break;
            case 2:t.setText("Correct answers 2 from 10 questions");
                break;
            case 3:t.setText("Correct answers 3 from 10 questions");break;
            case 4:t.setText("Correct answers 4 from 10 questions");
                break;
            case 5:t.setText("Correct answers 5 from 10 questions");break;
            case 6:t.setText("Correct answers 6 from 10 questions");break;
            case 7:t.setText("Correct answers 7 from 10 questions");break;
            case 8:t.setText("Correct answers 8 from 10 questions");break;
            case 9:t.setText("Correct answers 9 from 10 questions");break;
            case 10:t.setText("Correct answers 10 from 10 questions");break;


        }

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater layoutInflater = LayoutInflater.from(Result1Activity.this);
                View promptView = layoutInflater.inflate(R.layout.promptview, null);
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Result1Activity.this);
                alertDialogBuilder.setView(promptView);

                final EditText editText = (EditText) promptView.findViewById(R.id.editText);

                alertDialogBuilder.setCancelable(false)
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {


                                Result result = new Result(editText.getText().toString(), date.toString(), score + "");
                                dbHelperResult.addQuestions(result);
                                Toast.makeText(getApplicationContext(),
                                        "Result saved", Toast.LENGTH_SHORT).show();
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
            }
        });

        btnShow.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Result1Activity.this, CertificateActivity.class);

                intent.putExtra("score", String.valueOf(score));
                intent.putExtra("date", date);
                startActivity(intent);
            }
        });

    }
}
