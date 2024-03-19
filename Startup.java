import java.util.Arrays;

/**
 * Startup
 */
public class Startup {
    static int classLocal;

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.radius = 5;
        System.out.println("Circle 1s radius " + circle);

        Circle circle2 = new Circle();
        System.out.println("Circle 2s radius " + circle2);

        circle.radius = 10;
        System.out.println();

        int radius = 5;
        System.out.println("radius1 " + radius);

        int radius2 = radius;
        System.out.println("radius2 " + radius2);

        radius = 76;
        System.out.println("radius2 " + radius2);

        String name = new String("Tyler");
        String name1 = new String("Tyler");

        System.out.println(name.compareTo(name1));

        System.out.println(name);

        if (name == name1) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        Student student = new Student();
        System.out.println(student.name);
        student.GPA = Float.parseFloat("4537.1");
        System.out.println("Student GPA is " + student.GPA);
        
        // System.out.println(local);
        System.out.println(classLocal);


        System.out.println(vowels(name1));
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