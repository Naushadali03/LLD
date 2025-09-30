package dip;

public class MacBook {
    private final WireKeyboard wireKeyboard;
    private final WiredMouse wiredMouse;
    public MacBook(WireKeyboard wireKeyboard, WiredMouse wiredmouse){
        this.wireKeyboard=wireKeyboard;
        this.wiredMouse=wiredmouse;
    }
    public void mouse(){
        wiredMouse.mouse();
    }
    public void keyboard(){
        wireKeyboard.keyboard();
    }
}
