
package com.example.physlearn.Activities;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.physlearn.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import org.w3c.dom.Text;

public class CertificateActivity extends AppCompatActivity {

    String date;
    String score;
    String email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_certificate);

        Bundle bundle = getIntent().getExtras();
        score = bundle.getString("score");
        date = bundle.getString("date");

        TextView name = (TextView)findViewById(R.id.txtCertificate);
        TextView txtDate = (TextView)findViewById(R.id.txtDate);
        TextView txtScore = (TextView)findViewById(R.id.txtScore);

        txtDate.setText(date);
        txtScore.setText(score+"0% complete");


        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        if (user != null) {
            email = user.getEmail();

        }

        name.setText(email);


    }
}
