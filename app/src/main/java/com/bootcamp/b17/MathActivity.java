package com.bootcamp.b17;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Locale;

import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

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
                    final int times = Integer.parseInt(input);

                    ((TextView) findViewById(R.id.txt_result)).setText(String.format(Locale.ENGLISH, "Starting computation %d times", times));
                    calculateButton.setEnabled(false);
                    Observable.range(0, times)
                            .subscribeOn(AndroidSchedulers.mainThread())
                            .observeOn(Schedulers.computation())
                            .subscribe(new Subscriber<Integer>() {
                                @Override
                                public void onCompleted() {
                                    calculateButton.setEnabled(true);
                                    ((TextView) findViewById(R.id.txt_result)).setText(String.format(Locale.ENGLISH, "Did computation %d times", times));
                                }

                                @Override
                                public void onError(Throwable e) {
                                    calculateButton.setEnabled(true);
                                    ((TextView) findViewById(R.id.txt_result)).setText(String.format(Locale.ENGLISH, "Error in execution - %s", e.getMessage()));
                                }

                                @Override
                                public void onNext(Integer integer) {
                                    int vain = 0;
                                    for (int j = 0; j < 100000; j++) {
                                        vain += j;
                                    }
                                }
                            });
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
