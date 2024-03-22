/**
 * Startup
 */
public class Startup {
    static int classLocal;

    public static void main(String[] args) {
        Student student = new Student();
        student.major = Major.COMPUTERSCIENCE;

        Student student2 = new Student();
        student2.major = Major.COMMUNICATIONS;

        if (student.major == Major.COMPUTERSCIENCE) {
            System.out.println("Computers are the best");
        }


        Car car1 = new Car();
        car1.horsePower = 14;
        car1.style = CarStyle.SUV;
        car1.type = PowerType.UNLEADED;

        Car car2 = new Car();

        Car car3 = new Car();
        car3.horsePower = 32;

        System.out.println(car1.horsePower);
        System.out.println(car2.horsePower);
    }

    public static double harmonic (int n) {
        int local = 0;
        System.out.println(local);
        System.out.println(classLocal);

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