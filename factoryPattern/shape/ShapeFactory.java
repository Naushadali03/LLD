package factoryPattern.shape;

public class ShapeFactory {
    public Shape getShape(String input){
        switch (input) {
            case "circle": return new Circle();
            case "square": return new Square();
        }
        return null;
    }
}
