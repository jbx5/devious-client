package dev.hoot.api.input;

import dev.hoot.api.commons.Time;
import dev.hoot.api.game.Game;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Keyboard {
    public static void pressed(int keyCode) {
        pressed(keyCode, KeyEvent.CHAR_UNDEFINED);
    }

    public static void pressed(int keyCode, char keyChar) {
        Canvas canvas = Game.getClient().getCanvas();
        long time = System.currentTimeMillis();
        KeyEvent event = new KeyEvent(canvas, KeyEvent.KEY_PRESSED, time, 0, keyCode, keyChar, KeyEvent.KEY_LOCATION_STANDARD);
        canvas.dispatchEvent(event);
    }

    public static void typed(int keyCode) {
        typed(keyCode, KeyEvent.CHAR_UNDEFINED);
    }

    public static void typed(int keyCode, char keyChar) {
        Canvas canvas = Game.getClient().getCanvas();
        long time = System.currentTimeMillis();
        KeyEvent event = new KeyEvent(canvas, KeyEvent.KEY_TYPED, time, 0, keyCode, keyChar, KeyEvent.KEY_LOCATION_UNKNOWN);
        canvas.dispatchEvent(event);
    }

    public static void released(int keyCode) {
        released(keyCode, KeyEvent.CHAR_UNDEFINED);
    }

    public static void released(int keyCode, char keyChar) {
        Canvas canvas = Game.getClient().getCanvas();
        long time = System.currentTimeMillis();
        KeyEvent event = new KeyEvent(canvas, KeyEvent.KEY_RELEASED, time, 0, keyCode, keyChar, KeyEvent.KEY_LOCATION_STANDARD);
        canvas.dispatchEvent(event);
    }

    public static void type(char c) {
        Canvas canvas = Game.getClient().getCanvas();
        long time = System.currentTimeMillis();
        int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);
        KeyEvent pressed = new KeyEvent(canvas, KeyEvent.KEY_PRESSED, time, 0, keyCode, c, KeyEvent.KEY_LOCATION_STANDARD);
        KeyEvent typed = new KeyEvent(canvas, KeyEvent.KEY_TYPED, time, 0, 0, c, KeyEvent.KEY_LOCATION_UNKNOWN);
        canvas.dispatchEvent(pressed);
        canvas.dispatchEvent(typed);
        Time.sleep(10);
        KeyEvent released = new KeyEvent(
                canvas,
                KeyEvent.KEY_RELEASED,
                System.currentTimeMillis(),
                0,
                keyCode,
                c,
                KeyEvent.KEY_LOCATION_STANDARD
        );

        canvas.dispatchEvent(released);
    }

    public static void type(int number) {
        type(String.valueOf(number));
    }

    public static void type(String text) {
        type(text, false);
    }

    public static void type(String text, boolean sendEnter) {
        char[] chars = text.toCharArray();
        for (char c : chars) {
            type(c);
        }

        if (sendEnter) {
            sendEnter();
        }
    }

    public static void sendEnter() {
        type((char) KeyEvent.VK_ENTER);
    }

    public static void sendSpace() {
        type((char) KeyEvent.VK_SPACE);
    }
}
