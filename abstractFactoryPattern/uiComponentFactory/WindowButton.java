package abstractFactoryPattern.uiComponentFactory;

public class WindowButton implements UIComponent{

    @Override
    public void addingComponent() {
        System.out.println("Adding button for window....");
    }
    
}
