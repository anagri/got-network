package com.bootcamp.b17;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Locale;

public class MatchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math);
        findViewById(R.id.btn_calculate).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = ((EditText) findViewById(R.id.input_number)).getText().toString();
                if (input.matches("\\d+")) {
                    int times = Integer.parseInt(input);
                    for (int i = 0; i < times; i++) {
                        int vain = 0;
                        for (int j = 0; j < 100000; j++) {
                            vain += times;
                        }
                    }
                    ((TextView) findViewById(R.id.txt_result)).setText(String.format(Locale.ENGLISH, "Did computation %d times", times));
                } else {
                    new AlertDialog.Builder(MatchActivity.this)
                            .setMessage("Input is not a number")
                            .show();
                }
            }
        });
        findViewById(R.id.btn_current_time).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView) findViewById(R.id.txt_current_time)).setText(String.format("Current time is %s", Calendar.getInstance().getTime()));
            }
        });
    }
}
