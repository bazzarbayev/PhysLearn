package com.example.physlearn.Modules;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.physlearn.ListAdapter;
import com.example.physlearn.R;

import java.util.ArrayList;

public class Module2 extends AppCompatActivity {

    ArrayList<String> texts = new ArrayList();
    ArrayList times = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module2);

        ListView lv = (ListView)findViewById(R.id.module2lv);

        for(int i=1;i<6;i++){
            times.add("Chapter "+i);
        }
        texts.add("І. АҚПАРАТ ТЕОРИЯСЫНЫҢ НЕГІЗГІ ТҮСІНІКТЕРІ МЕН МІНДЕТТЕРІ");
        texts.add("II. АҚПАРАТТЫ ӨЛШЕУ");
        texts.add("III. СИГНАЛДАРДЫҢ МАТЕМАТИКАЛЫҚ МОДЕЛЬДЕРІ");
        texts.add("IV. АҚПАРАТТЫ КВАНТТАУ");
        texts.add("V. БАЙЛАНЫС КАНАЛДАРЫ МЕН ЖҮЙЕЛЕРІ");

        lv.setAdapter(new ListAdapter(this, texts,times));
    }
}
