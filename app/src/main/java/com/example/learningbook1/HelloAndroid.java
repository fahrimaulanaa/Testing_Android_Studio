package com.example.learningbook1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HelloAndroid extends Activity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hello_android);


        Button button = (Button) findViewById(R.id.buttonSubmit);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText editText = (EditText) findViewById(R.id.editTextNama);
                EditText editText2 = (EditText) findViewById(R.id.editTextAlamat);
                TextView textView = (TextView) findViewById(R.id.textViewHasil1);
                TextView textView2 = (TextView) findViewById(R.id.textViewHasil2);
                textView.setText("Selamat datang " + editText.getText());
                textView2.setText("Alamat anda " + editText2.getText());
            }
        });
    }
}
