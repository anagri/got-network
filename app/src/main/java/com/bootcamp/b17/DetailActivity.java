package com.bootcamp.b17;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    public static final String CHARACTER = "DetailActivity.name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        GoTCharacter goTCharacter = getIntent().getParcelableExtra(CHARACTER);
        ((TextView) findViewById(R.id.txt_name)).setText(goTCharacter.name);
        ((TextView) findViewById(R.id.txt_desc)).setText(goTCharacter.description);
        ((ImageView) findViewById(R.id.img_got)).setImageResource(goTCharacter.fullResId);
        ((ImageView) findViewById(R.id.img_house)).setImageResource(goTCharacter.houseResId);
    }
}
