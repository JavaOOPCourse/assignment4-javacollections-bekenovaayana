package service;

import model.Student;
import java.util.ArrayList;
import java.util.Iterator;

public class StudentService {

    private ArrayList<Student> students = new ArrayList<>();

    public void initializeStudents() {

        students.add(new Student(1, "Anna", 3.5));
        students.add(new Student(2, "Bek", 1.8));
        students.add(new Student(3, "Amina", 3.9));
        students.add(new Student(4, "Daniel", 2.5));
        students.add(new Student(5, "Elena", 1.5));
    }

    public void removeLowGPA() {

        students.removeIf(student -> student.getGpa() < 2.0);
    }

    public void findHighestGPA() {

        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        Student topStudent = students.get(0);

        for (Student s : students) {
            if (s.getGpa() > topStudent.getGpa()) {
                topStudent = s;
            }
        }

        System.out.println("Highest GPA Student: " + topStudent);
    }

    public void insertAtIndex() {

        if (students.size() >= 2) {
            students.add(2, new Student(6, "NewStudent", 3.2));
        } else {
            System.out.println("Not enough students to insert at index 2.");
        }
    }

    public void printStudents() {

        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}