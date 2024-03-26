import java.time.LocalDate;
import java.time.Period;

public class Student {
    String name;
    float GPA;
    boolean isVeteran;
    byte favoriteNumber;
    Major major;
    LocalDate dateOfBirth;

    // public Student() {
    //     this.name = "Unknown Student";
    //     this.GPA = 3.0f;
    //     this.isVeteran = false;
    // }

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, LocalDate DOB) {
        this.name = name;
        this.dateOfBirth = DOB;
    }

    public String toString() {
        return this.name + " " + this.major;
    }

    public String toString(String additionalString) {
        return name + " " + major + " " + additionalString;
    }

    public int getAge() {
        return Period.between(this.dateOfBirth, LocalDate.now()).getYears();
    }
}