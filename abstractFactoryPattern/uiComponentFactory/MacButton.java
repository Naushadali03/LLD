package abstractFactoryPattern.uiComponentFactory;

public class MacButton implements UIComponent{

    @Override
    public void addingComponent() {
        System.out.println("Adding button for mac...");
    }
    
}
