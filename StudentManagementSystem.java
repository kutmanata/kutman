import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;

class Student {
    int id;
    String name;
    int age;
    Set<String> courses = new HashSet<>();

    Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    void addCourse(String course) {
        courses.add(course.toLowerCase());
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age + ", Courses: " + courses;
    }
}

class StudentManager {
    Map<Integer, Student> studentMap = new HashMap<>();
    Map<String, Set<Student>> courseMap = new HashMap<>();

    void addStudent(Student student) {
        studentMap.put(student.id, student);
        for (String course : student.courses) {
            courseMap.putIfAbsent(course, new HashSet<>());
            courseMap.get(course).add(student);
        }
    }

    void removeStudent(int id) {
        if (studentMap.containsKey(id)) {
            Student student = studentMap.get(id);
            for (String course : student.courses) {
                course = course.toLowerCase();
                if (courseMap.containsKey(course)) {
                    courseMap.get(course).remove(student);
                    if (courseMap.get(course).isEmpty()) {
                        courseMap.remove(course);
                    }
                }
            }
            studentMap.remove(id);
            System.out.println("Student successfully removed.");
        } else {
            System.out.println("Student not found.");
        }
    }

    void updateStudent(int id, String name, int age, Set<String> courses) {
        if (studentMap.containsKey(id)) {
            Student student = studentMap.get(id);
            student.name = name;
            student.age = age;
            student.courses = courses;
            System.out.println("Student successfully updated.");
        } else {
            System.out.println("Student not found.");
        }
    }

    void displayStudents() {
        if (studentMap.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        List<Student> studentList = new ArrayList<>(studentMap.values());

        studentList.sort((s1, s2) -> Integer.compare(s1.id, s2.id));

        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    void searchStudentById(int id) {
        if (studentMap.containsKey(id)) {
            System.out.println(studentMap.get(id));
        } else {
            System.out.println("Student not found.");
        }
    }

    void getStudentsByCourse(String course) {
        course = course.toLowerCase();
        if (courseMap.containsKey(course)) {
            for (Student student : courseMap.get(course)) {
                System.out.println(student);
            }
        } else {
            System.out.println("No students enrolled in this course.");
        }
    }

    void displayStudentsSortedByName() {
        List<Student> studentList = new ArrayList<>(studentMap.values());

        studentList.sort((s1, s2) -> s1.name.compareTo(s2.name));

        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        Student s1 = new Student(1, "Nurti", 20);
        s1.addCourse("Java");
        s1.addCourse("C++");

        Student s2 = new Student(2, "Ayana", 22);
        s2.addCourse("CS-24");
        s2.addCourse("Java");

        manager.addStudent(s1);
        manager.addStudent(s2);

        System.out.println("All students:");
        manager.displayStudents();

        System.out.println("\nStudent with ID 1:");
        manager.searchStudentById(1);

        System.out.println("\nStudents enrolled in Java course:");
        manager.getStudentsByCourse("Java");

        System.out.println("\nUpdate student with ID 1:");
        Set<String> updatedCourses = new HashSet<>(Set.of("Java", "Python"));
        manager.updateStudent(1, "Nurti", 21, updatedCourses);
        manager.displayStudents();

        System.out.println("\n Remove student with ID 2:");
        manager.removeStudent(2);
        manager.displayStudents();

        System.out.println("\n Students sorted by name:");
        manager.displayStudentsSortedByName();
    }
}
