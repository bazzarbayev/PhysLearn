package com.example.physlearn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Module1 extends AppCompatActivity {

    ArrayList<String> texts = new ArrayList();
    ArrayList times = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module1);

        ListView lv = (ListView)findViewById(R.id.module1lv);

        for(int i=1;i<5;i++){
            times.add("Chapter "+i);
        }
        texts.add("I. СТРУКТУРНЫЕ МОДЕЛИ НЕЛИНЕЙНЫХ ДИНАМИЧЕСКИХ СИСТЕМ УПРАВЛЕНИЯ");
        texts.add("II. МАТЕМАТИЧЕСКИЕ МОДЕЛИ НЕЛИНЕЙНЫХ ДИНАМИЧЕСКИХ СИСТЕМ УПРАВЛЕНИЯ");
        texts.add("III. СТАТИСТИЧЕСКИЙ АНАЛИЗ НЕЛИНЕЙНЫХ ДИНАМИЧЕСКИХ СИСТЕМ УПРАВЛЕНИЯ");
        texts.add("IV. СИНТЕЗ НЕЛИНЕЙНЫХ ДИНАМИЧЕСКИХ СИСТЕМ УПРАВЛЕНИЯ ОБЪЕКТАМИ");

        lv.setAdapter(new ListAdapter(this, texts,times));
    }
}
