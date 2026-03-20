package studentRegistration;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentRegistrationSystem {
    private final List<Student> students;

    public StudentRegistrationSystem() {
        this.students = new ArrayList<>();
    }

    static void main() {
        StudentRegistrationSystem system = new StudentRegistrationSystem();

        // --- registerStudent validations ---

        // name null
        try {
            system.registerStudent(null, 25, "E12345");
        } catch (IllegalArgumentException | DuplicatedStudentException e) {
            System.out.println("name=" + null + ", age=" + 25 + ", id=" + "E12345");
            System.out.println(e.getMessage());
        }

        // name empty
        try {
            system.registerStudent("   ", 25, "E12345");
        } catch (IllegalArgumentException | DuplicatedStudentException e) {
            System.out.println("name=" + "   " + ", age=" + 25 + ", id=" + "E12345");
            System.out.println(e.getMessage());
        }

        // age too young (< 17)
        try {
            system.registerStudent("Eve", 16, "E12345");
        } catch (IllegalArgumentException | DuplicatedStudentException e) {
            System.out.println("name=" + "Eve" + ", age=" + 16 + ", id=" + "E12345");
            System.out.println(e.getMessage());
        }

        // age too old (> 100)
        try {
            system.registerStudent("Frank", 101, "F12345");
        } catch (IllegalArgumentException | DuplicatedStudentException e) {
            System.out.println("name=" + "Frank" + ", age=" + 101 + ", id=" + "F12345");
            System.out.println(e.getMessage());
        }

        // id null
        try {
            system.registerStudent("Eve", 25, null);
        } catch (IllegalArgumentException | DuplicatedStudentException e) {
            System.out.println("name=" + "Eve" + ", age=" + 25 + ", id=" + null);
            System.out.println(e.getMessage());
        }

        // id empty
        try {
            system.registerStudent("Frank", 30, "   ");
        } catch (IllegalArgumentException | DuplicatedStudentException e) {
            System.out.println("name=" + "Frank" + ", age=" + 30 + ", id=" + "   ");
            System.out.println(e.getMessage());
        }

        // id invalid format (lowercase letter)
        try {
            system.registerStudent("Grace", 28, "a12345");
        } catch (IllegalArgumentException | DuplicatedStudentException e) {
            System.out.println("name=" + "Grace" + ", age=" + 28 + ", id=" + "a12345");
            System.out.println(e.getMessage());
        }

        // id invalid format (not enough digits)
        try {
            system.registerStudent("Hank", 23, "A123");
        } catch (IllegalArgumentException | DuplicatedStudentException e) {
            System.out.println("name=" + "Hank" + ", age=" + 23 + ", id=" + "A123");
            System.out.println(e.getMessage());
        }


        try {
            system.registerStudent("Alice", 20, "A12345");
            system.registerStudent("Bob", 22, "B54321");
            system.registerStudent("Charlie", 19, "C67890");
            system.registerStudent("David", 21, "A12345");
        } catch (DuplicatedStudentException e) {
            System.out.println("name=" + "David" + ", age=" + 21 + ", id=" + "A12345");
            System.out.println(e.getMessage());
        }

        System.out.println("Registered Students:");
        for (Student student : system.students) {
            System.out.println(student);
        }

        // --- removeStudent validations ---

        // id null
        try {
            system.removeStudent(null);
        } catch (IllegalArgumentException | StudentNotFoundException e) {
            System.out.println("Attempted ID: null");
            System.out.println(e.getMessage());
        }

        // id empty
        try {
            system.removeStudent("   ");
        } catch (IllegalArgumentException | StudentNotFoundException e) {
            System.out.println("Attempted ID: \"   \"");
            System.out.println(e.getMessage());
        }

        // student not found
        try {
            system.removeStudent("D00000");
        } catch (StudentNotFoundException e) {
            System.out.println("Attempted ID: D00000");
            System.out.println(e.getMessage());
        }

        // successful removal
        try {
            system.removeStudent("B54321");
        } catch (StudentNotFoundException e) {
            System.out.println("Attempted ID: B54321");
            System.out.println(e.getMessage());
        }

        System.out.println("Registered Students:");
        for (Student student : system.students) {
            System.out.println(student);
        }


    }

    public void registerStudent(String name, int age, String id) throws DuplicatedStudentException {
        validateStudentData(name, age, id);

        if (isStudentRegistered(id)) {
            throw new DuplicatedStudentException("The student is already registered.");
        }

        students.add(new Student(name, age, id));
        System.out.println("Student registered successfully.");
    }

    public void removeStudent(String id) throws StudentNotFoundException {
        if (id == null || id.trim().isEmpty()) {
            throw new IllegalArgumentException("ID cannot be null or empty.");
        }

        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getId().equals(id)) {
                iterator.remove();
                System.out.println("Student removed successfully.");
                return;
            }
        }

        throw new StudentNotFoundException("Student not found.");
    }

    private void validateStudentData(String name, int age, String id) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty.");
        }

        if (age < 17 || age > 100) {
            throw new IllegalArgumentException("Age must be between 17 and 100.");
        }

        if (id == null || id.trim().isEmpty()) {
            throw new IllegalArgumentException("ID cannot be null or empty.");
        }

        if (!id.matches("^[A-Z][0-9]{5}$")) {
            throw new IllegalArgumentException("ID must start with an uppercase letter followed by 5 digits.");
        }
    }

    private boolean isStudentRegistered(String id) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }
}

