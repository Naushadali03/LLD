package dip;

import java.security.Key;

public class ValidDip {
    public static void main(String[] args) {
        // Keyboard keyboard = new WireKeyboard();
        // Mouse mouse = new WiredMouse();
         Keyboard keyboard = new WireLessKeyboard();
        Mouse mouse = new WireLessMouse();
        ValidMacBook validMacBook = new ValidMacBook(keyboard, mouse);
        keyboard.keyboard();
        mouse.mouse();
    }
}
