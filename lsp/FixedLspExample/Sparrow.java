package lsp.FixedLspExample;

public class Sparrow implements Bird, Flyable {

    @Override
    public void fly() {
        System.out.println("Sparrow is flying...");
    }
    
}
