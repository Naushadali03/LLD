package ElevatorLLD;

public class ElevatorCar {
    int id;
    int currentFloor;
    Direction direction;
    InternalButton internalButton;
    Display display;
    ElevatorDoor elevatorDoor;
    ElevatorState elevatorState;
    public ElevatorCar(){
        internalButton = new InternalButton();
        elevatorDoor = new ElevatorDoor();
        display = new Display();
        currentFloor=0;
        elevatorState = elevatorState.IDLE;
       direction = direction.UP;
    }

    public void showDisplay(){
        display.showDisplay();
    }

    public void pressButton(int destination){
        this.internalButton.pressButton(destination,this);
    }
    public void setDisplay(){
        this.display.setDisplay(direction,currentFloor);
    }
    public boolean moveElevator(Direction dir,int destinationFloor){
            int startFloor=currentFloor;
            if(dir==Direction.UP){
                for(int i=startFloor;i<=destinationFloor;i++){
                    this.currentFloor=startFloor;
                    setDisplay();
                    showDisplay();
                    if(i==destinationFloor){
                        return true;
                    }
                }
            }
            if(dir==Direction.DOWN){
                for(int i=startFloor;i>=destinationFloor;i--){
                    this.currentFloor=startFloor;
                    setDisplay();
                    showDisplay();
                    if(i==destinationFloor) return true;
                }
            }
            return false;

    }
}
