package com.example.physlearn.Modules;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.physlearn.ListAdapter;
import com.example.physlearn.R;

import java.util.ArrayList;

public class Module3 extends AppCompatActivity {

    ArrayList<String> texts = new ArrayList();
    ArrayList times = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module3);

        ListView lv = (ListView)findViewById(R.id.module3lv);

        for(int i=1;i<6;i++){
            times.add("Chapter "+i);
        }
        texts.add("I. ОСНОВНЫЕ ПОЛОЖЕНИЯ ТЕОРИИ ИНФОРМАЦИИ");
        texts.add("II. ИЗМЕРЕНИЕ ИНФОРМАЦИИ");
        texts.add("III. МАТЕМАТИЧЕСКИЕ МОДЕЛИ СИГНАЛОВ");
        texts.add("IV. КВАНТОВАНИЕ ИНФОРМАЦИИ");
        texts.add("V. КАНАЛЫ И СИСТЕМЫ СВЯЗИ");

        lv.setAdapter(new ListAdapter(this, texts,times));
    }
}
