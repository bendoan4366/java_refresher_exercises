package inheritance;

public class audiA3 extends car {

    private boolean turbo;

    public audiA3(boolean isManual, boolean turbo) {
        super("A3", "AWD", 4, 4,  4, isManual);
        this.turbo = turbo;
    }

    public void accelerate(int rate){
        int newVelocity = getCurrentVelocity() + rate;

        if (newVelocity ==0) {
            stop();
            changeGear(1);
        } else if (newVelocity > 0 && newVelocity < 10){
            changeGear(1);
        } else if (newVelocity > 10 && newVelocity < 30){
            changeGear(2);
        } else if (newVelocity > 30 && newVelocity < 60){
            changeGear(3);
        } else {
            changeGear(4);
        }
    }
}
