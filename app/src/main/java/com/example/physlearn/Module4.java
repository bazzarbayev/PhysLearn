package com.example.physlearn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Module4 extends AppCompatActivity {

    ArrayList<String> texts = new ArrayList();
    ArrayList times = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module4);

        ListView lv = (ListView)findViewById(R.id.module4lv);

        for(int i=1;i<5;i++){
            times.add("Chapter "+i);
        }
        texts.add("I. БЕЙСЫЗЫҚТЫ ДИНАМИКАЛЫҚ ЖҮЙЕЛЕРІН ҚҰРУ ПРИНЦИПТАРЫ ЖӘНЕ МАТЕМАТИКАЛЫҚ ЖАЗЫЛУЫ");
        texts.add("II. БЕЙСЫЗЫҚТЫ ДИНАМИКАЛЫҚ ЖҮЙЕЛЕРДІҢ ВОЛЬТЕРЛЫҚ МОДЕЛЬДЕРІ");
        texts.add("III. БЕЙСЫЗЫҚТЫ ДИНАМИКАЛЫҚ ЖҮЙЕЛЕРІНІҢ СТАТИСТИКАЛЫҚ ТАЛДАУЫ");
        texts.add("IV. БЕЙСЫЗЫҚТЫ ДИНАМИКАЛЫҚ ЖҮЙЕЛЕРДІҢ СИНТЕЗІ");

        lv.setAdapter(new ListAdapter(this, texts,times));
    }
}
