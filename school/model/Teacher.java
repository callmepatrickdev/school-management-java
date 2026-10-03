package school.model;

import java.util.ArrayList;
import java.util.List;

public class Teacher {

    private int id;
    private String name;
    private String subject;
    private String email;
    private List<Course> courses;

    public Teacher(int id, String name, String subject, String email) {
        this.id = id;
        this.name = name;
        this.subject = subject;
        this.email = email;
        this.courses = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public String getEmail() {
        return email;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void addCourse(Course course) {
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
               " | Subject: " + subject +
               " | Email: " + email;
    }
}