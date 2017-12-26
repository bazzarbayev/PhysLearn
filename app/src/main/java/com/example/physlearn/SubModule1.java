package com.example.physlearn;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import com.github.barteksc.pdfviewer.PDFView;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class SubModule1 extends AppCompatActivity {

    PDFView pdfView;
    private ProgressBar spinner;
    String Url;

//    public SubModule1(String url){
//        this.Url = url;
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_module1);

        pdfView = (PDFView)findViewById(R.id.pdfView);


        spinner = (ProgressBar)findViewById(R.id.progressBar1);

        spinner.setVisibility(View.VISIBLE);

        //Read from Assets
        //pdfView.fromAsset("module1.pdf").load();

        Bundle bundle = getIntent().getExtras();
        Url = bundle.getString("message");

        new RetrievePDFStream().execute(Url);

    }

    class RetrievePDFStream extends AsyncTask<String, Void, InputStream>
    {

        @Override
        protected InputStream doInBackground(String... strings) {
            InputStream inputStream = null;
            try{
                URL url = new URL(strings[0]);
                HttpURLConnection urlConnection = (HttpURLConnection)url.openConnection();
                if (urlConnection.getResponseCode() == 200)
                {
                    inputStream = new BufferedInputStream(urlConnection.getInputStream());

                }
            }
            catch (IOException e)
            {
                return null;
            }
            return inputStream;
        }

        @Override
        protected void onPostExecute(InputStream inputStream) {
            pdfView.fromStream(inputStream).load();

            spinner.setVisibility(View.GONE);
        }
    }
}
