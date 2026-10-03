package school.service;

import java.util.ArrayList;
import java.util.List;

import school.model.Course;
import school.model.Student;
import school.model.Teacher;

public class SchoolService {

    private List<Student> students;
    private List<Teacher> teachers;
    private List<Course> courses;

    public SchoolService() {
        students = new ArrayList<>();
        teachers = new ArrayList<>();
        courses = new ArrayList<>();
    }

    // ================= STUDENTS =================

    public boolean addStudent(Student student) {

        if (findStudentById(student.getId()) != null) {
            return false;
        }

        students.add(student);
        return true;
    }

    public boolean removeStudent(int id) {

        Student student = findStudentById(id);

        if (student == null) {
            return false;
        }

        for (Course course : courses) {
            course.removeStudent(student);
        }

        students.remove(student);
        return true;
    }

    public Student findStudentById(int id) {

        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }

        return null;
    }

    public List<Student> getStudents() {
        return students;
    }

    // ================= TEACHERS =================

    public boolean addTeacher(Teacher teacher) {

        if (findTeacherById(teacher.getId()) != null) {
            return false;
        }

        teachers.add(teacher);
        return true;
    }

    public boolean removeTeacher(int id) {

        Teacher teacher = findTeacherById(id);

        if (teacher == null) {
            return false;
        }

        for (Course course : courses) {
            if (course.getTeacher() == teacher) {
                course.setTeacher(null);
            }
        }

        teachers.remove(teacher);
        return true;
    }

    public Teacher findTeacherById(int id) {

        for (Teacher teacher : teachers) {
            if (teacher.getId() == id) {
                return teacher;
            }
        }

        return null;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    // ================= COURSES =================

    public boolean addCourse(Course course) {

        if (findCourseById(course.getId()) != null) {
            return false;
        }

        courses.add(course);
        return true;
    }

    public boolean removeCourse(int id) {

        Course course = findCourseById(id);

        if (course == null) {
            return false;
        }

        Teacher teacher = course.getTeacher();

        if (teacher != null) {
            teacher.removeCourse(course);
        }

        for (Student student : course.getStudents()) {
            student.removeCourse(course);
        }

        courses.remove(course);
        return true;
    }

    public Course findCourseById(int id) {

        for (Course course : courses) {
            if (course.getId() == id) {
                return course;
            }
        }

        return null;
    }

    public List<Course> getCourses() {
        return courses;
    }

    // ================= ASSIGN TEACHER =================

    public boolean assignTeacherToCourse(int teacherId, int courseId) {

        Teacher teacher = findTeacherById(teacherId);
        Course course = findCourseById(courseId);

        if (teacher == null || course == null) {
            return false;
        }

        // Remove course from previous teacher
        if (course.getTeacher() != null) {
            course.getTeacher().removeCourse(course);
        }

        course.setTeacher(teacher);
        teacher.addCourse(course);

        return true;
    }

    // ================= ENROLL STUDENT =================

    public boolean enrollStudentInCourse(int studentId, int courseId) {

        Student student = findStudentById(studentId);
        Course course = findCourseById(courseId);

        if (student == null || course == null) {
            return false;
        }

        course.addStudent(student);
        student.enrollInCourse(course);

        return true;
    }

    // ================= DISPLAY =================

    public void displayStudents() {

        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        System.out.println("\n===== STUDENTS =====");

        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void displayTeachers() {

        if (teachers.isEmpty()) {
            System.out.println("No teachers found.");
            return;
        }

        System.out.println("\n===== TEACHERS =====");

        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
    }

    public void displayCourses() {

        if (courses.isEmpty()) {
            System.out.println("No courses found.");
            return;
        }

        System.out.println("\n===== COURSES =====");

        for (Course course : courses) {
            System.out.println(course);
        }
    }

    // ================= DETAILS =================

    public void displayStudentDetails(int id) {

        Student student = findStudentById(id);

        if (student == null) {
            System.out.println("Student not found.");
            return;
        }

        System.out.println("\n===== STUDENT DETAILS =====");
        System.out.println(student);

        System.out.println("Courses:");

        if (student.getCourses().isEmpty()) {
            System.out.println("No courses enrolled.");
        } else {

            for (Course course : student.getCourses()) {
                System.out.println(
                    "- " + course.getName() +
                    " (" + course.getCode() + ")"
                );
            }
        }
    }

    public void displayTeacherDetails(int id) {

        Teacher teacher = findTeacherById(id);

        if (teacher == null) {
            System.out.println("Teacher not found.");
            return;
        }

        System.out.println("\n===== TEACHER DETAILS =====");
        System.out.println(teacher);

        System.out.println("Courses:");

        if (teacher.getCourses().isEmpty()) {
            System.out.println("No courses assigned.");
        } else {

            for (Course course : teacher.getCourses()) {
                System.out.println(
                    "- " + course.getName() +
                    " (" + course.getCode() + ")"
                );
            }
        }
    }

    public void displayCourseDetails(int id) {

        Course course = findCourseById(id);

        if (course == null) {
            System.out.println("Course not found.");
            return;
        }

        System.out.println("\n===== COURSE DETAILS =====");
        System.out.println("ID: " + course.getId());
        System.out.println("Name: " + course.getName());
        System.out.println("Code: " + course.getCode());

        if (course.getTeacher() != null) {
            System.out.println(
                "Teacher: " + course.getTeacher().getName()
            );
        } else {
            System.out.println("Teacher: Not Assigned");
        }

        System.out.println("Students:");

        if (course.getStudents().isEmpty()) {
            System.out.println("No students enrolled.");
        } else {

            for (Student student : course.getStudents()) {
                System.out.println(
                    "- " + student.getName() +
                    " (ID: " + student.getId() + ")"
                );
            }
        }
    }
}