package school.model;

import java.util.ArrayList;
import java.util.List;

public class Course {

    private int id;
    private String name;
    private String code;
    private Teacher teacher;
    private List<Student> students;

    public Course(int id, String name, String code) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.students = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    @Override
    public String toString() {

        String teacherName =
                teacher != null ? teacher.getName() : "Not Assigned";

        return "ID: " + id +
               " | Course: " + name +
               " | Code: " + code +
               " | Teacher: " + teacherName +
               " | Students: " + students.size();
    }
}