package com.bootcamp.b17;

import android.graphics.Color;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GoTCharacterTest {
    @Test
    public void titleColorShouldBeGreenIfCharacterIsAlive() {
        GoTCharacter goTCharacter = new GoTCharacter(null, null, null, true, null, 0, null);
        assertThat(goTCharacter.getTitleColor(), is(Color.GREEN));
    }

    @Test
    public void titleColorShouldBeRedIfCharacterIsDead() {
        GoTCharacter goTCharacter = new GoTCharacter(null, null, null, false, null, 0, null);
        assertThat(goTCharacter.getTitleColor(), is(Color.RED));
    }

}