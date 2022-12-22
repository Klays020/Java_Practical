import java.util.ArrayList;

public class Student {
    private String name;
    private String surname;
    private String course;
    private String groupe;
    private String speciality;

    public Student(String name, String surname, String course, String groupe, String speciality)
    {
        this.name = name;
        this.surname = surname;
        this.course = course;
        this.groupe = groupe;
        this.speciality = speciality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getGroupe() {
        return groupe;
    }

    public void setGroupe(String groupe) {
        this.groupe = groupe;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
    public static void setArray(ArrayList<Student> students, Student student){
        students.add(student);
    }
    public static void outArray(Student students){
        System.out.println(students.name + " " + students.surname + " " + students.speciality + " " + students.course + " " + students.groupe);
    }
    public static void sort(ArrayList<Student> mStudents){
        mStudents.sort((o1, o2)-> o1.getName().compareTo(o2.getName()));
    }
}