package abstractFactoryPattern.uiComponentFactory;

public class MacCheckBox implements UIComponent{

    @Override
    public void addingComponent() {
        System.out.println("Adding checkbox for mac....");
    }
    
}
