public class Student {
    // fields
    private String first;
    private String last;
    private int gradeLvl;
    private double GPA;
    private int studentID;
    private static int num = 0;

    public Student() {
        first = "None";
        last = "None";
        gradeLvl = 0;
        GPA = 0;

        num++;
        studentID = num;
    }

    public Student(String firstName, String lastName, int gradeLevel, double gpa) {
        first = firstName;
        last = lastName;

        if (gradeLevel >= 0 && gradeLevel <= 12) {
            gradeLvl = gradeLevel;
        } else {
            gradeLvl = 0;
        }

        if (gpa >= 0.0 && gpa <= 4.5) {
            GPA = gpa;
        } else {
            GPA = 0.0;
        }

        num++;
        studentID = num;
    }

    public String toString() {
        return last + ", " + first + "\n" + "GPA: " + GPA + "\n" + "Grade Level: " + gradeLvl + " id # " + studentID;
    }

}