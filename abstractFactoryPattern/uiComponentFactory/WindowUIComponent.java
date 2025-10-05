package abstractFactoryPattern.uiComponentFactory;

public class WindowUIComponent implements UIFactory{
    private String brand;

    public WindowUIComponent(String brand){
        this.brand=brand;
    }

    @Override
    public UIComponent createButton() {
        return new WindowButton();
    }

    @Override
    public UIComponent createCheckBox() {
        return new WindowCheckBox();
    }
    
}
