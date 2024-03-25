enum PowerType {
    ELECTRIC, UNLEADED, DIESEL
}

enum CarStyle {
    SEDAN, COUPE, TRUCK, SUV
}

public class Car {
    private int horsePower = 180;
    private PowerType type;
    private CarStyle style;

    // this is a public getter
    public int getHorsePower() {
        return this.horsePower;
    }

    // this is a setter
    public void setHorsePower(int horsePower) {
        // Google told us HP is typically 180-200
        if (horsePower < 180) {
            this.horsePower = 180;
        } else if (horsePower > 200) {
            this.horsePower = 200;
        } else {
            this.horsePower = horsePower;
        }

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
