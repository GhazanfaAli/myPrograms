import java.util.ArrayList;

class StudentTest {
    String name;
    int age;

    StudentTest(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class DuplicateStudentException extends Exception {
    public DuplicateStudentException(String message) {
        super(message);
    }
}

class StudentManagement {
    ArrayList<StudentTest> list = new ArrayList<>();

    // Use "throws" to declare the custom exception in the method signature
    void addStudents(StudentTest s) throws DuplicateStudentException {
        // Check if a student with the same name already exists
        for (StudentTest existingStudent : list) {
            if (existingStudent.name.equals(s.name)) {
                // Throw a custom exception if a duplicate is found
                throw new DuplicateStudentException("Student with the same name already exists.");
            }
        }

        // If no duplicate is found, add the student to the list
        list.add(s);
    }

    void print() {
        System.out.println("Display");
    }
}

public class Teacher {
    public static void main(String[] args) {
        StudentTest t1 = new StudentTest("ALI", 28);
        StudentTest t2 = new StudentTest("Sara", 25);

        StudentManagement st = new StudentManagement();

        try {
            st.addStudents(t1); // Adding the first student (ALI)
            st.addStudents(t2); // Adding the second student (Sara)
            st.addStudents(t1); // Attempting to add the first student (ALI) again (will trigger the exception)
        } catch (DuplicateStudentException e) {
            System.err.println("Error: " + e.getMessage());
        }

        // Printing the list
        st.print();
    }
}