package Set;

import java.util.HashSet;
import java.util.Objects;

public class CustomHashSet {
    public static void main(String[] args) {
        HashSet<Student> studentHashSet = new HashSet<>();

        studentHashSet.add(new Student(1, "Jhanvi", 100));
        studentHashSet.add(new Student(2, "Sumit", 90));
        studentHashSet.add(new Student(3, "Varsha", 80));

        System.out.println(studentHashSet.contains(new Student(1, "Jhanvi", 100)));
    }
}

class Student{
    int id;
    String name;
    int marks;

    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
