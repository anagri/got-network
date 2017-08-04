package com.bootcamp.b17;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;

import static com.bootcamp.b17.Constants.BARATHEON;
import static com.bootcamp.b17.Constants.BOLTON;
import static com.bootcamp.b17.Constants.DOTHRAKI;
import static com.bootcamp.b17.Constants.FACELESS_MEN;
import static com.bootcamp.b17.Constants.LANNISTER;
import static com.bootcamp.b17.Constants.STARK;
import static com.bootcamp.b17.Constants.TARGARYEN;

public class GoTCharacter implements Parcelable {
    public final Integer id;
    public final String name;
    public final String thumbUrl;
    public final boolean alive;
    public final String fullUrl;
    public final Integer house;
    public final String description;

    public GoTCharacter(
            Integer id,
            String name,
            String thumbUrl,
            String fullUrl,
            boolean alive,
            Integer house,
            String description) {
        this.id = id;
        this.name = name;
        this.thumbUrl = thumbUrl;
        this.alive = alive;
        this.fullUrl = fullUrl;
        this.house = house;
        this.description = description;
    }

    public int getTitleColor() {
        return alive ? Color.GREEN : Color.RED;
    }

    public String getDescription() {
        return description;
    }

    public int getHouseResId() {
        switch (house) {
            case STARK:
                return R.drawable.stark;
            case LANNISTER:
                return R.drawable.lannister;
            case BARATHEON:
                return R.drawable.baratheon;
            case TARGARYEN:
                return R.drawable.targaryen;
            case BOLTON:
                return R.drawable.bolton;
            case DOTHRAKI:
                return R.drawable.dothraki;
            case FACELESS_MEN:
                return R.drawable.faceless;
            default:
                return R.drawable.house_placeholder;
        }
    }

    public String getHouseName() {
        switch (house) {
            case STARK:
                return "Stark";
            case LANNISTER:
                return "Lannister";
            case BARATHEON:
                return "Baratheon";
            case TARGARYEN:
                return "Targaryen";
            case BOLTON:
                return "Bolton";
            case DOTHRAKI:
                return "Dothraki";
            case FACELESS_MEN:
                return "Faceless Men";
            default:
                return "Unknown";
        }
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.id);
        dest.writeString(this.name);
        dest.writeString(this.thumbUrl);
        dest.writeByte(this.alive ? (byte) 1 : (byte) 0);
        dest.writeString(this.fullUrl);
        dest.writeValue(this.house);
        dest.writeString(this.description);
    }

    protected GoTCharacter(Parcel in) {
        this.id = (Integer) in.readValue(Integer.class.getClassLoader());
        this.name = in.readString();
        this.thumbUrl = in.readString();
        this.alive = in.readByte() != 0;
        this.fullUrl = in.readString();
        this.house = (Integer) in.readValue(Integer.class.getClassLoader());
        this.description = in.readString();
    }

    public static final Creator<GoTCharacter> CREATOR = new Creator<GoTCharacter>() {
        @Override
        public GoTCharacter createFromParcel(Parcel source) {
            return new GoTCharacter(source);
        }

        @Override
        public GoTCharacter[] newArray(int size) {
            return new GoTCharacter[size];
        }
    };
}
