enum PowerType {
    ELECTRIC, UNLEADED, DIESEL
}

enum CarStyle {
    SEDAN, COUPE, TRUCK, SUV
}

public class Car {
    private int horsePower;
    private PowerType type;
    private CarStyle style;

    // this is a public getter
    public int getHorsePower() {
        return this.horsePower;
    }

    // this is a setter
    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public PowerType getType() {
        return this.type;
    }

    // this is a setter
    public void setType(PowerType type) {
        this.type = type;
    }    
    
    public CarStyle getStyle() {
        return this.style;
    }

    // this is a setter
    public void setStyle(CarStyle style) {
        this.style = style;
    }
}
