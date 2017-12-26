package com.example.physlearn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Result1Activity extends AppCompatActivity {


    DBHelperResult dbHelperResult, temp;
    int score;
    String date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result1);



        temp = new DBHelperResult(this);
        dbHelperResult = new DBHelperResult(temp.getContext());


        //get text view
        TextView t=(TextView)findViewById(R.id.textResult);
        //get score
        Bundle b = getIntent().getExtras();

        score = b.getInt("score");
        //display score

        switch (score)
        {
            case 0:t.setText("Правильные ответы 0 из 10 вопросов");
            case 1:t.setText("Правильные ответы 1 из 10 вопросов");break;
            case 2: t.setText("Правильные ответы 2 из 10 вопросов");
                break;
            case 3:t.setText("Правильные ответы 3 из 10 вопросов");break;
            case 4:t.setText("Правильные ответы 4 из 10 вопросов");
                break;
            case 5:t.setText("Правильные ответы 5 из 10 вопросов");break;
            case 6:t.setText("Правильные ответы 6 из 10 вопросов");break;
            case 7:t.setText("Правильные ответы 7 из 10 вопросов");break;
            case 8:t.setText("Правильные ответы 8 из 10 вопросов");break;
            case 9:t.setText("Правильные ответы 9 из 10 вопросов");break;
            case 10:t.setText("Правильные ответы 10 из 10 вопросов");break;


        }

    }
}
