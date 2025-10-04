package factoryPattern.animal;

public class AnimalFactory {
    public Animal getAnimal(String animal){
        switch(animal){
            case "dog": return new Dog();
            case "cat": return new Cat();
            case "lion": return new Lion();
        }
        return null;
    }
}
