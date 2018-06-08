package com.example.ahmadabuadas.add_application;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button addBtn = (Button) findViewById(R.id.addBtn);
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText N1Text = (EditText) findViewById(R.id.N1Text);
                EditText N2Text = (EditText) findViewById(R.id.N2Text);

                TextView resultText = (TextView) findViewById(R.id.resultText);
                int nub1 = Integer.parseInt(N1Text.getText().toString()) ;
                int nub2 = Integer.parseInt(N2Text.getText().toString()) ;
                int result = nub1 + nub2;

                resultText.setText(result+ "");

            }
        });

    }
}
