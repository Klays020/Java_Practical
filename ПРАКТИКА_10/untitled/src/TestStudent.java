import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStudent {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new Student("namee", "surnamea", "course1", "groupe1", "speciality1");
        students[1] = new Student("named", "surnameb", "course2", "groupe2", "speciality2");
        students[2] = new Student("namec", "surnamec", "course3", "groupe3", "speciality3");
        students[3] = new Student("nameb", "surnamed", "course4", "groupe4", "speciality4");
        students[4] = new Student("namea", "surnamee", "course5", "groupe5", "speciality5");

        ArrayList<Student> mStudents = new ArrayList<Student>();

        for (Student value : students) Student.setArray(mStudents, value);

        for (Student student : mStudents) Student.outArray(student);

        Student.sort(mStudents);

        System.out.println();

        for (Student student : mStudents) Student.outArray(student);

        Student[] students2 = new Student[3];
        students2[0] = new Student("nameh", "surnamea", "course1", "groupe1", "speciality1");
        students2[1] = new Student("namez", "surnameb", "course2", "groupe2", "speciality2");
        students2[2] = new Student("namek", "surnamec", "course3", "groupe3", "speciality3");

        ArrayList<Student> mStudents2 = new ArrayList<Student>();

        for (Student value : students2) Student.setArray(mStudents2, value);

        ArrayList<Student> newlist = (ArrayList<Student>) Stream.concat(mStudents.stream(), mStudents2.stream()).collect(Collectors.toList());

        System.out.println();

        Student.sort(newlist);

        for (Student student : newlist) Student.outArray(student);
    }
}