package com.bootcamp.b17;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {
    public static final String CHARACTER = "DetailActivity.name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        GoTCharacter goTCharacter = getIntent().getParcelableExtra(CHARACTER);
        TextView name = (TextView) findViewById(R.id.txt_name);
        name.setText(goTCharacter.name);
        name.setTextColor(goTCharacter.alive ? Color.GREEN : Color.RED);
        ((TextView) findViewById(R.id.txt_desc)).setText(goTCharacter.description);
        ImageView imgHouse = (ImageView) findViewById(R.id.img_got);
        Glide.with(this)
                .load(goTCharacter.fullUrl)
                .placeholder(R.drawable.profile_placeholder_full)
                .error(R.drawable.profile_placeholder_error_full)
                .into(imgHouse);
        ((ImageView) findViewById(R.id.img_house)).setImageResource(goTCharacter.houseResId);
    }
}
