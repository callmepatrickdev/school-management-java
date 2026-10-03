package school;

import school.model.Course;
import school.model.Student;
import school.model.Teacher;
import school.service.SchoolService;
import school.util.InputUtil;

public class Main {

    private static SchoolService schoolService =
            new SchoolService();

    public static void main(String[] args) {

        boolean running = true;

        System.out.println(
            "===================================="
        );
        System.out.println(
            "     SCHOOL MANAGEMENT SYSTEM"
        );
        System.out.println(
            "===================================="
        );

        while (running) {

            displayMenu();

            int choice = InputUtil.readInt("Choose an option: ");

            switch (choice) {

                case 1:
                    addStudent();
                    break;

                case 2:
                    addTeacher();
                    break;

                case 3:
                    addCourse();
                    break;

                case 4:
                    assignTeacher();
                    break;

                case 5:
                    enrollStudent();
                    break;

                case 6:
                    schoolService.displayStudents();
                    break;

                case 7:
                    schoolService.displayTeachers();
                    break;

                case 8:
                    schoolService.displayCourses();
                    break;

                case 9:
                    viewStudentDetails();
                    break;

                case 10:
                    viewTeacherDetails();
                    break;

                case 11:
                    viewCourseDetails();
                    break;

                case 12:
                    removeStudent();
                    break;

                case 13:
                    removeTeacher();
                    break;

                case 14:
                    removeCourse();
                    break;

                case 0:
                    running = false;
                    System.out.println(
                        "Thank you for using the system."
                    );
                    break;

                default:
                    System.out.println(
                        "Invalid option. Please try again."
                    );
            }
        }
    }

    // ================= MENU =================

    private static void displayMenu() {

        System.out.println("\n========== MENU ==========");
        System.out.println("1.  Add Student");
        System.out.println("2.  Add Teacher");
        System.out.println("3.  Add Course");
        System.out.println("4.  Assign Teacher to Course");
        System.out.println("5.  Enroll Student in Course");
        System.out.println("6.  Display Students");
        System.out.println("7.  Display Teachers");
        System.out.println("8.  Display Courses");
        System.out.println("9.  View Student Details");
        System.out.println("10. View Teacher Details");
        System.out.println("11. View Course Details");
        System.out.println("12. Remove Student");
        System.out.println("13. Remove Teacher");
        System.out.println("14. Remove Course");
        System.out.println("0.  Exit");
        System.out.println("==========================");
    }

    // ================= ADD STUDENT =================

    private static void addStudent() {

        System.out.println("\n===== ADD STUDENT =====");

        int id = InputUtil.readPositiveInt("Student ID: ");

        String name = InputUtil.readString("Student name: ");

        int age = InputUtil.readPositiveInt("Student age: ");

        String email = InputUtil.readString("Student email: ");

        Student student =
                new Student(id, name, age, email);

        if (schoolService.addStudent(student)) {

            System.out.println(
                "Student added successfully."
            );

        } else {

            System.out.println(
                "A student with this ID already exists."
            );
        }
    }

    // ================= ADD TEACHER =================

    private static void addTeacher() {

        System.out.println("\n===== ADD TEACHER =====");

        int id = InputUtil.readPositiveInt("Teacher ID: ");

        String name = InputUtil.readString("Teacher name: ");

        String subject =
                InputUtil.readString("Subject: ");

        String email =
                InputUtil.readString("Teacher email: ");

        Teacher teacher =
                new Teacher(id, name, subject, email);

        if (schoolService.addTeacher(teacher)) {

            System.out.println(
                "Teacher added successfully."
            );

        } else {

            System.out.println(
                "A teacher with this ID already exists."
            );
        }
    }

    // ================= ADD COURSE =================

    private static void addCourse() {

        System.out.println("\n===== ADD COURSE =====");

        int id = InputUtil.readPositiveInt("Course ID: ");

        String name =
                InputUtil.readString("Course name: ");

        String code =
                InputUtil.readString("Course code: ");

        Course course =
                new Course(id, name, code);

        if (schoolService.addCourse(course)) {

            System.out.println(
                "Course added successfully."
            );

        } else {

            System.out.println(
                "A course with this ID already exists."
            );
        }
    }

    // ================= ASSIGN TEACHER =================

    private static void assignTeacher() {

        System.out.println(
            "\n===== ASSIGN TEACHER ====="
        );

        int teacherId =
                InputUtil.readPositiveInt("Teacher ID: ");

        int courseId =
                InputUtil.readPositiveInt("Course ID: ");

        if (schoolService.assignTeacherToCourse(
                teacherId, courseId)) {

            System.out.println(
                "Teacher assigned successfully."
            );

        } else {

            System.out.println(
                "Teacher or course not found."
            );
        }
    }

    // ================= ENROLL STUDENT =================

    private static void enrollStudent() {

        System.out.println(
            "\n===== ENROLL STUDENT ====="
        );

        int studentId =
                InputUtil.readPositiveInt("Student ID: ");

        int courseId =
                InputUtil.readPositiveInt("Course ID: ");

        if (schoolService.enrollStudentInCourse(
                studentId, courseId)) {

            System.out.println(
                "Student enrolled successfully."
            );

        } else {

            System.out.println(
                "Student or course not found."
            );
        }
    }

    // ================= STUDENT DETAILS =================

    private static void viewStudentDetails() {

        int id =
                InputUtil.readPositiveInt("Student ID: ");

        schoolService.displayStudentDetails(id);
    }

    // ================= TEACHER DETAILS =================

    private static void viewTeacherDetails() {

        int id =
                InputUtil.readPositiveInt("Teacher ID: ");

        schoolService.displayTeacherDetails(id);
    }

    // ================= COURSE DETAILS =================

    private static void viewCourseDetails() {

        int id =
                InputUtil.readPositiveInt("Course ID: ");

        schoolService.displayCourseDetails(id);
    }

    // ================= REMOVE STUDENT =================

    private static void removeStudent() {

        int id =
                InputUtil.readPositiveInt("Student ID: ");

        if (schoolService.removeStudent(id)) {

            System.out.println(
                "Student removed successfully."
            );

        } else {

            System.out.println(
                "Student not found."
            );
        }
    }

    // ================= REMOVE TEACHER =================

    private static void removeTeacher() {

        int id =
                InputUtil.readPositiveInt("Teacher ID: ");

        if (schoolService.removeTeacher(id)) {

            System.out.println(
                "Teacher removed successfully."
            );

        } else {

            System.out.println(
                "Teacher not found."
            );
        }
    }

    // ================= REMOVE COURSE =================

    private static void removeCourse() {

        int id =
                InputUtil.readPositiveInt("Course ID: ");

        if (schoolService.removeCourse(id)) {

            System.out.println(
                "Course removed successfully."
            );

        } else {

            System.out.println(
                "Course not found."
            );
        }
    }
}