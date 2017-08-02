package com.bootcamp.b17;

import android.graphics.Color;

public class GoTCharacterViewModel {
    private final GoTCharacter goTCharacter;

    public GoTCharacterViewModel(GoTCharacter goTCharacter) {
        this.goTCharacter = goTCharacter;
    }

    public GoTCharacter getGoTCharacter() {
        return goTCharacter;
    }

    public int getTitleColor() {
        return goTCharacter.alive ? Color.GREEN : Color.RED;
    }
}
