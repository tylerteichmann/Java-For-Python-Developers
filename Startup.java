import java.time.LocalDate;

/**
 * Startup
 */
public class Startup {

    public static void main(String[] args) {
        Student student = new Student("Tyler", LocalDate.of(1993, 4, 03));
        student.major = Major.COMPUTERSCIENCE;
        System.out.println(student);
        System.out.println(student.getAge());

        Student student2 = new Student("Tina");
        student2.major = Major.PHYSICS;
        student2.dateOfBirth = LocalDate.of(1996, 6, 17);
        System.out.println(student2.toString("Teichmann"));
        System.out.println(student2.getAge());

        // Student student3 = new Student();

        if (student.major == Major.COMPUTERSCIENCE) {
            System.out.println("Computers are the best");
        }

        Car car1 = new Car(CarManufacturer.JEEP, CarModel.WRANGLER, 2019);
        car1.setHorsePower(14);
        car1.setStyle(CarStyle.SUV);
        car1.setType(PowerType.UNLEADED);

        Car car2 = new Car(CarManufacturer.TOYOTA, CarModel.TACOMA, 2022);

        Car car3 = new Car(CarManufacturer.CHEVROLET, CarModel.AVALANCHE, 2010);
        car3.setHorsePower(195);;

        System.out.println(car3);
        System.out.println("Current mileage before driving: " + car3.mileage);
        car3.drive(160);
        System.out.println("After Driving: " + car3.mileage);
        car3.honk();

        // System.out.println(car1.getHorsePower());
        // System.out.println(car2.getHorsePower());
        // System.out.println(car3.getHorsePower());

        System.out.println("Number of cars on the road: " + Car.numberOfCars);

        Instructor teacher = new Instructor();
        teacher.email = "tyler.teichmann@stmartin.edu";        
        Instructor teacher2 = new Instructor();


    }

    public static double harmonic (int n) {
        int local = 0;
        System.out.println(local);
        // System.out.println(classLocal);

        for (int i = 0; i < 3; i++) {
            int forLoopLocal = 1;
            System.out.println(forLoopLocal);
        }
        // System.out.println(forLoopLocal);
        
        return n;
    }

    public static int vowels(String testString) {
        int numVowels = 0;
        String[] vowelsArr = {"a", "e", "i", "o", "u"};
        
        for(String c : vowelsArr) {
            if (testString.contains(c)) {
                numVowels++;
            }
        }
        
        return numVowels;
    }

    public static int getVowels(String term) {
        int n = 0;
        String lowerCased = term.toLowerCase();
        for (int i = 0; i < lowerCased.length(); i++) {
            char c = lowerCased.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c =='u') {
                n++;
            }
        }

        return n;
    }
}