package abstractFactoryPattern.uiComponentFactory;

public class MacUIComponent implements UIFactory{

    private String brand;

    public MacUIComponent(String brand){
        this.brand=brand;
    }

    @Override
    public UIComponent createButton() {
        return new MacButton();
    }

    @Override
    public UIComponent createCheckBox() {
        return new MacCheckBox();
    }
    
}
