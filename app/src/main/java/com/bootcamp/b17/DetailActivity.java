package com.bootcamp.b17;

import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;

import com.bootcamp.b17.databinding.ActivityDetailBinding;
import com.bumptech.glide.Glide;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class DetailActivity extends AppCompatActivity {
    public static final String CHARACTER = "DetailActivity.name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        GoTCharacter goTCharacter = getIntent().getParcelableExtra(CHARACTER);
        final ActivityDetailBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_detail);
        binding.setGoTCharacterViewModel(new GoTCharacterViewModel(goTCharacter));

        new AsyncTask<Object, Object, GoTCharacterViewModel>() {
            @Override
            protected GoTCharacterViewModel doInBackground(Object... params) {
                OkHttpClient okHttpClient = new OkHttpClient();
                try {
                    Response response = okHttpClient.newCall(new Request.Builder().url("http://192.168.0.3:8000/1.json").build()).execute();
                    String responseString = response.body().string();
                    Log.d("GOT", responseString);
                    Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create();
                    GoTCharacter goTCharacter = gson.fromJson(responseString, GoTCharacter.class);
                    return new GoTCharacterViewModel(goTCharacter);
                } catch (IOException e) {
                    Log.e("GOT", "Failed while making network call", e);
                }
                return null;
            }

            @Override
            protected void onPostExecute(GoTCharacterViewModel goTCharacterViewModel) {
                binding.setGoTCharacterViewModel(goTCharacterViewModel);
                binding.executePendingBindings();
            }
        }.execute();
    }

    @BindingAdapter("glideUrl")
    public static void bindGlideUrl(ImageView imageView, String url) {
        Glide.with(imageView.getContext())
                .load(url)
                .placeholder(R.drawable.profile_placeholder_full)
                .error(R.drawable.profile_placeholder_error_full)
                .into(imageView);
    }
}
