package com.bootcamp.b17;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListActivity extends AppCompatActivity {
    private GoTAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ListView listView = (ListView) findViewById(R.id.list_got);
        adapter = new GoTAdapter(this);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(ListActivity.this, DetailActivity.class);
                intent.putExtra(DetailActivity.CHARACTER, adapter.getItem(position));
                startActivity(intent);
            }
        });
    }

    private static class GoTAdapter extends BaseAdapter {
        private final Context context;
        private final List<GoTCharacter> gotCharacters;

        public GoTAdapter(Context context) {
            this.context = context;
            gotCharacters = new ArrayList<>();
            gotCharacters.addAll(Arrays.asList(Constants.GOT_CHARACTERS));
        }

        @Override
        public int getCount() {
            return gotCharacters.size();
        }

        @Override
        public GoTCharacter getItem(int i) {
            return gotCharacters.get(i);
        }

        @Override
        public long getItemId(int i) {
            return getItem(i).id;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(LAYOUT_INFLATER_SERVICE);
                convertView = layoutInflater.inflate(R.layout.item_got, parent, false);
            }
            GoTCharacter goTCharacter = getItem(position);
            ImageView thumbnail = (ImageView) convertView.findViewById(R.id.img_thumbnail);
            Glide.with(context)
                    .load(goTCharacter.thumbUrl)
                    .placeholder(R.drawable.profile_placeholder)
                    .error(R.drawable.profile_placeholder_error)
                    .fitCenter()
                    .into(thumbnail);
            ((TextView) convertView.findViewById(R.id.txt_got)).setText(goTCharacter.name);
            return convertView;
        }
    }
}
