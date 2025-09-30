package dip;

public class ValidMacBook {

    private final Keyboard keyboard;
    private final Mouse mouse;
    public ValidMacBook(Keyboard keyboard, Mouse mouse){
        this.keyboard=keyboard;
        this.mouse=mouse;
    }
    public void mouse(){
        mouse.mouse();
    }
    public void keyboard(){
        keyboard.keyboard();
    }

}
