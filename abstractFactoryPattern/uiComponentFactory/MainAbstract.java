package abstractFactoryPattern.uiComponentFactory;

public class MainAbstract {
    public static void main(String[] args) {
        UIFactoryProvider uiFactoryProvider = new UIFactoryProvider();
        UIFactory window = uiFactoryProvider.getUIComponent(ComponentType.WINDOW, "UIComponent");
        window.produceUIComponent();

    }
}
