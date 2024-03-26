enum PowerType {
    ELECTRIC, UNLEADED, DIESEL
}

enum CarStyle {
    SEDAN, COUPE, TRUCK, SUV
}

enum CarManufacturer {
    JEEP, TOYOTA, CHEVROLET
}

enum CarModel {
    WRANGLER, TACOMA, AVALANCHE
}

public class Car {
    private int horsePower = 180;
    private PowerType type;
    private CarStyle style;
    private CarManufacturer make;
    private CarModel model;
    public double mileage = 0.0;
    static int numberOfCars;
    final int year;

    public Car(CarManufacturer make, CarModel model, int year) {
        this.make = make;
        this.model = model;
        numberOfCars++;
        this.year = year;
    }

    public String toString() {
        return make + " " + model;
    }

    public void drive(double miles) {
        this.mileage += miles;
    }

    public void honk() {
        System.out.println("HONK");
    }

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
