package factoryPattern.animal;

public class Main {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();
        Animal animal = animalFactory.getAnimal("dog");
        animal.sound();
        animal = animalFactory.getAnimal("cat");
        animal.sound();
        animal = animalFactory.getAnimal("lion");
        animal.sound();
    }
}
