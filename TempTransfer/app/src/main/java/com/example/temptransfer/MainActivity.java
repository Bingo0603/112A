package com.example.temptransfer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btn_onclick(View view){
        EditText edtTemp = (EditText) findViewById(R.id.edtTemp);
        TextView txtShow = (TextView) findViewById(R.id.txtShow);

        double degreeC = Double.parseDouble(edtTemp.getText().toString());
        double degreeF = (degreeC * 9.0/5.0 + 32.0);

        txtShow.setText("華氏溫度:"+ degreeF);
    }
}