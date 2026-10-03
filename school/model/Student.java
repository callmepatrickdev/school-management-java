package school.model;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private int id;
    private String name;
    private int age;
    private String email;
    private List<Course> courses;

    public Student(int id, String name, int age, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.courses = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void enrollInCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
        }
    }

    public void removeCourse(Course course) {
        courses.remove(course);
    }

    @Override
    public String toString() {
        return "ID: " + id +
               " | Name: " + name +
               " | Age: " + age +
               " | Email: " + email;
    }
}