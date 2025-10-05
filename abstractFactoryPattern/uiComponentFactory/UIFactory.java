package abstractFactoryPattern.uiComponentFactory;

public interface UIFactory {
    UIComponent createButton();
    UIComponent createCheckBox();

    public default void produceUIComponent(){
        System.out.println("Creating UI Component...");
        UIComponent button = createButton();
        UIComponent checkBox = createCheckBox();
        button.addingComponent();
        checkBox.addingComponent();
        System.out.println("Created UI component....");
    }
}
