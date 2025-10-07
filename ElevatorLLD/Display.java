package ElevatorLLD;

public class Display {
    int floorNo;
    Direction direction;

    public void setDisplay(Direction direction,int floorNo){
        this.direction=direction;
        this.floorNo=floorNo;
    }

    public void showDisplay(){
        System.out.println(floorNo);
        System.out.println(direction);
    }
}
