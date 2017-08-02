package com.bootcamp.b17;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bootcamp.b17.databinding.ActivityDetailBinding;
import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {
    public static final String CHARACTER = "DetailActivity.name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        GoTCharacter goTCharacter = getIntent().getParcelableExtra(CHARACTER);
        ActivityDetailBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_detail);
        binding.setGoTCharacterViewModel(new GoTCharacterViewModel(goTCharacter));

        ImageView imgHouse = (ImageView) findViewById(R.id.img_got);
        Glide.with(this)
                .load(goTCharacter.fullUrl)
                .placeholder(R.drawable.profile_placeholder_full)
                .error(R.drawable.profile_placeholder_error_full)
                .into(imgHouse);
        ((ImageView) findViewById(R.id.img_house)).setImageResource(goTCharacter.houseResId);
    }
}
