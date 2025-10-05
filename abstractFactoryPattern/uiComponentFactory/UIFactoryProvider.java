package abstractFactoryPattern.uiComponentFactory;

public class UIFactoryProvider {
    public UIFactory getUIComponent(ComponentType type,String component){
            switch(type){
                case WINDOW: return new WindowUIComponent(component);
                case MAC: return new MacUIComponent(component);
               default:
                     throw new IllegalArgumentException("Unknown car type:" + type);
            }
    }
}
