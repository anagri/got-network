package com.bootcamp.b17;

import android.graphics.Color;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GoTCharacterTest {
    @Test
    public void titleColorShouldBeGreenIfCharacterIsAlive() {
        GoTCharacter goTCharacter = new GoTCharacter(0, null, null, null, true, null, null);
        assertThat(goTCharacter.getTitleColor(), is(Color.GREEN));
    }

    @Test
    public void titleColorShouldBeRedIfCharacterIsDead() {
        GoTCharacter goTCharacter = new GoTCharacter(0, null, null, null, false, null, null);
        assertThat(goTCharacter.getTitleColor(), is(Color.RED));
    }
}