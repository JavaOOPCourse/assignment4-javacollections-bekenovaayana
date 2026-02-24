package model;

public class Student {

    // fields
    private int id;
    private String name;
    private double gpa;

    // constructor
    public Student(int id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    // getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    // toString
    @Override
    public String toString() {
        return "ID: " + id +
                ", Name: " + name +
                ", GPA: " + gpa;
    }
}