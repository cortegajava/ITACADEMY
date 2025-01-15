package Sprint1.s01_08.lv3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void printStudents(String msg, List<Student> students) {
        System.out.println(msg);
        for(Student student : students) {
            System.out.println(student.toString());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("aaaa", 16, "Java", 7));
        students.add(new Student("bbbb", 17, "PHP", 8));
        students.add(new Student("aabb", 19, "Java", 4));
        students.add(new Student("pspsps", 18, "Java", 5));
        students.add(new Student("sssss", 16, "PHP", 6));
        students.add(new Student("asdf", 20, "Java", 8));
        students.add(new Student("fdsa", 21, "PHP", 9));
        students.add(new Student("efgtg", 16, "Java", 2));
        students.add(new Student("qwerty", 18, "PHP", 7));
        students.add(new Student("owowowo", 17, "Java", 6));
        printStudents("All students:", students);

        List<Student> nameStartsWithA = students.stream()
                .filter(student -> student.toString().startsWith("a")).toList();
        printStudents("Students whose name starts with a:", nameStartsWithA);

        List<Student> passingGPA = students.stream()
                .filter(student -> student.getGPA() >= 5).toList();
        printStudents("Students with GPA 5 or greater: ", passingGPA);

        List<Student> passingGPAnotPHP = students.stream()
                .filter(student -> student.getGPA() >= 5).filter(student -> student.get_class().compareTo("PHP") != 0).toList();
        printStudents("Students with GPA 5 or greater and not taking PHP: ", passingGPAnotPHP);

        List<Student> AdultAgedAndJava = students.stream()
                .filter(student -> student.getAge() >= 18).filter(student -> student.get_class().compareTo("Java") == 0).toList();
        printStudents("Students 18 or older and taking Java: ", AdultAgedAndJava);

    }
}
