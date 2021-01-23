package composition;

public class PC {

    private CpuCase cpu_case;
    private Monitor monitor;
    private Motherboard motherboard;
    private Boolean isOn;

    public PC(CpuCase cpu_case, Monitor monitor, Motherboard motherboard) {
        this.cpu_case = cpu_case;
        this.monitor = monitor;
        this.motherboard = motherboard;
        this.isOn = false;
    }

    public void togglePower(){

        cpu_case.pressPowerButton();

        if(cpu_case.isClicked() == true){

            this.isOn = true;
            drawLogo();
            System.out.println("System is powered on");

        } else {

            this.isOn = false;
            System.out.println("System is powered off");

        }
    }

    private void drawLogo(){

        monitor.drawPixelAt(1500, 1500, "blue");

    }

    public void loadProgram(String program){
        motherboard.loadProgram(program);
    }

    public void drawPixel(int x, int y, String color){
        monitor.drawPixelAt(x, y, color);
    }

    public Boolean getOn() {
        return isOn;
    }
}
