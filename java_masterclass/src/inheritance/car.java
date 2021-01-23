package inheritance;

public class car extends vehicle {

    private int wheels;
    private int gears;
    private int doors;

    private boolean isManual;
    private int currentGear;

    public car(String name, String size, int wheels, int gears, int doors, boolean isManual) {

        super(name, size);
        this.wheels = wheels;
        this.gears = gears;
        this.doors = doors;
        this.isManual = isManual;

        this.currentGear =1;

    }

    public void changeGear(int gear){
        this.currentGear = currentGear;
        System.out.println("Current gear set to " + this.currentGear);
    }

    public void changeVelocity(int speed, int direction){
        move(speed, direction);
        System.out.println("Car changeVelocity: Current speed is " + speed + ". Current direction is " + direction);
    }

}
