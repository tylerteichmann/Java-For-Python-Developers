import java.time.LocalDate;
import java.time.Period;

enum Major {
    COMPUTERSCIENCE, BUSINESS, PSYCHOLOGY, COMMUNICATIONS, PHYSICS
};
public class Student {
    String name = "Unknown Student";
    float GPA;
    boolean isVeteran;
    byte favoriteNumber;
    Major major;
    LocalDate dateOfBirth;

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