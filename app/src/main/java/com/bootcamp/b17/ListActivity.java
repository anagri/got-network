package com.bootcamp.b17;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class ListActivity extends AppCompatActivity {

    public static class GoTCharacter {
        public final String name;
        public final int resId;

        public GoTCharacter(String name, int resId) {
            this.name = name;
            this.resId = resId;
        }
    }

    public static final GoTCharacter[] GOT_CHARACTERS = new GoTCharacter[]
            {
                    new GoTCharacter("Arya Stark", R.drawable.arya),
                    new GoTCharacter("Bran Stark", R.drawable.bran),
                    new GoTCharacter("Brienne Tarth", R.drawable.brienne),
                    new GoTCharacter("Catelyn Stark", R.drawable.catelyn),
                    new GoTCharacter("Cercei Lannister", R.drawable.cercei),
                    new GoTCharacter("Daenerys Targaryen", R.drawable.daenerys),
                    new GoTCharacter("Davos Seaworth", R.drawable.davos),
                    new GoTCharacter("Eddard Stark", R.drawable.eddard),
                    new GoTCharacter("Hodor", R.drawable.hodor),
                    new GoTCharacter("Jaime Lannister", R.drawable.jaime),
                    new GoTCharacter("Jaqen Hagar", R.drawable.jaqen),
                    new GoTCharacter("Joffrey Baratheon", R.drawable.joffrey),
                    new GoTCharacter("Jon Snow", R.drawable.jon),
                    new GoTCharacter("Khal Drogo", R.drawable.khal),
                    new GoTCharacter("Melisandre", R.drawable.melisandre),
                    new GoTCharacter("Petyr Baelish", R.drawable.petyr),
                    new GoTCharacter("Podrick Payne", R.drawable.podrick),
                    new GoTCharacter("Pycelle", R.drawable.pycelle),
                    new GoTCharacter("Ramsay Bolton", R.drawable.ramsay),
                    new GoTCharacter("Renly Baratheon", R.drawable.renly),
                    new GoTCharacter("Robb Stark", R.drawable.robb),
                    new GoTCharacter("Robert Baratheon", R.drawable.robert),
                    new GoTCharacter("Roose Bolton", R.drawable.roose),
                    new GoTCharacter("Sansa Stark", R.drawable.sansa),
                    new GoTCharacter("Stannis Baratheon", R.drawable.stannis),
                    new GoTCharacter("Tyrion Lannister", R.drawable.tyrion),
                    new GoTCharacter("Tywin Lannister", R.drawable.tywin),
                    new GoTCharacter("Varys", R.drawable.varys)
            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ((ListView) findViewById(R.id.list_got)).setAdapter(new GoTAdapter(this));
    }

    private static class GoTAdapter extends BaseAdapter {
        private final Context context;

        public GoTAdapter(Context context) {
            this.context = context;
        }

        @Override
        public int getCount() {
            return GOT_CHARACTERS.length;
        }

        @Override
        public GoTCharacter getItem(int i) {
            return GOT_CHARACTERS[i];
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(LAYOUT_INFLATER_SERVICE);
                convertView = layoutInflater.inflate(R.layout.item_got, parent, false);
            }
            GoTCharacter goTCharacter = getItem(position);
            ((ImageView) convertView.findViewById(R.id.img_got)).setImageResource(goTCharacter.resId);
            ((TextView) convertView.findViewById(R.id.txt_got)).setText(goTCharacter.name);
            return convertView;
        }
    }
}
