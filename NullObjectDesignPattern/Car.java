package NullObjectDesignPattern;

public class Car implements Vehicle{

    @Override
    public int getTankCapacity() {
        return 45;
    }

    @Override
    public int getSeatCapacity() {
       return 5;
    }
    
}
