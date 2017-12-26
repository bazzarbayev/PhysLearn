package com.example.physlearn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Module5 extends AppCompatActivity {

    ArrayList<String> texts = new ArrayList();
    ArrayList times = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module5);

        ListView lv = (ListView)findViewById(R.id.module5lv);

        for(int i=1;i<7;i++){
            times.add("Chapter "+i);
        }
        texts.add("I. МЕТОДЫ ИССЛЕДОВАНИЯ НЕЛИНЕЙНЫХ ДИНАМИЧЕСКИХ СИСТЕМ");
        texts.add("II. МАТЕМАТИЧЕСКИЕ МОДЕЛИ НЕЛИНЕЙНЫХ ДИНАМИЧЕСКИХ СИСТЕМ УПРАВЛЕНИЯ ОБЪЕКТАМИ С ЗАПАЗДЫВАНИЕМ");
        texts.add("III. СТАТИСТИЧЕСКИЙ АНАЛИЗ НЕЛИНЕЙНЫХ ДИНАМИЧЕСКИХ СИСТЕМ УПРАВЛЕНИЯ ОБЪЕКТАМИ С ЗАПАЗДЫВАНИЕМ");
        texts.add("IV. СИНТЕЗ НЕЛИНЕЙНЫХ ДИНАМИЧЕСКИХ СИСТЕМ УПРАВЛЕНИЯ ОБЪЕКТАМИ С ЗАПАЗДЫВАНИЕМ");
        texts.add("V. СТАТИСТИЧЕСКИЙ АНАЛИЗ И СИНТЕЗ ЦИФРОВЫХ НЕЛИНЕЙНЫХ ДИНАМИЧЕСКИХ СИСТЕМ УПРАВЛЕНИЯ С ЗАПАЗДЫВАНИЕМ");
        texts.add("VI. ДИАЛОГОВАЯ СИСТЕМА ИССЛЕДОВАНИЯ НЕЛИНЕЙНЫХ ДИНАМИЧЕСКИХ СИСТЕМ УПРАВЛЕНИЯ ОБЪЕКТАМИ С ЗАПАЗДЫВАНИЕМ");

        lv.setAdapter(new ListAdapter(this, texts,times));
    }
}
