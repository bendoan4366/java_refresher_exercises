package inheritance;

public class vehicle {

    private String name;
    private String size;

    private int currentVelocity;
    private int currentDirection;

    public vehicle(String name, String size){
        this.name = name;
        this.size = size;

        this.currentDirection = 0;
        this.currentVelocity = 0;
    }

    public void steer(int direction){
        this.currentDirection = direction;
        System.out.println("Steering " + this.currentDirection + "degrees");

    }

    public void move(int velocity, int direction) {
        this.currentVelocity = velocity;
        this.currentDirection = direction;
        System.out.println("Moving at " + this.currentVelocity + " mph, in " + this.currentDirection + "degrees");

    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void stop(){
        this.currentVelocity = 0;
    }
}
