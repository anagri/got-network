package com.bootcamp.b17;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Locale;

public class MathActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math);
        final Button calculateButton = (Button) findViewById(R.id.btn_calculate);
        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = ((EditText) findViewById(R.id.input_number)).getText().toString();
                if (input.matches("\\d+")) {
                    int times = Integer.parseInt(input);

                    ((TextView) findViewById(R.id.txt_result)).setText(String.format(Locale.ENGLISH, "Starting computation %d times", times));
                    calculateButton.setEnabled(false);
                    new AsyncTask<Integer, Integer, Integer>() {
                        @Override
                        protected Integer doInBackground(Integer... params) {
                            int times = params[0];
                            for (int i = 0; i < times; i++) {
                                int vain = 0;
                                for (int j = 0; j < 100000; j++) {
                                    vain += times;
                                }
                                publishProgress(i);
                            }
                            return times;
                        }

                        @Override
                        protected void onProgressUpdate(Integer... values) {
                            ((TextView) findViewById(R.id.txt_result)).setText(String.format(Locale.ENGLISH, "Did computation %d times", values[0]));
                        }

                        @Override
                        protected void onPostExecute(Integer times) {
                            calculateButton.setEnabled(true);
                            ((TextView) findViewById(R.id.txt_result)).setText(String.format(Locale.ENGLISH, "Did computation %d times", times));
                        }
                    }.execute(times);
                } else {
                    new AlertDialog.Builder(MathActivity.this)
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
