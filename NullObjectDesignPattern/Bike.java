package NullObjectDesignPattern;

public class Bike implements Vehicle{

    @Override
    public int getTankCapacity() {
        return 35;
    }

    @Override
    public int getSeatCapacity() {
       return 2;
    }
    
}
