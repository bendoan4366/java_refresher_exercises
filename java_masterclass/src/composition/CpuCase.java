package composition;

public class CpuCase {

    private String model;
    private String manufacturer;
    private String powerSupply;
    private Dimensions dimensions;
    private boolean clicked;

    public CpuCase(String model, String manufacturer, String powerSupply, Dimensions dimensions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dimensions = dimensions;
        this.clicked = false;
    }

    public void pressPowerButton(){

        System.out.println("Power button pressed");

        if(this.clicked == false) {

            this.clicked = true;

        } else {

            this.clicked = false;

        }
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public boolean isClicked() {
        return clicked;
    }
}
