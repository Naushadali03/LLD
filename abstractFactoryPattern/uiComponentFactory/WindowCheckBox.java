package abstractFactoryPattern.uiComponentFactory;

public class WindowCheckBox implements UIComponent{

    @Override
    public void addingComponent() {
        System.out.println("Adding checkbox for window....");
    }
    
}
