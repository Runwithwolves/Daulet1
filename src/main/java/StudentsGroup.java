import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class StudentsGroup {
    private List<Student> students = new ArrayList<Student>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void exclude(Student student) {
        students.remove(student);
    }
    public void printStudents(){
        Iterator Student1 = students.iterator();
        while (Student1.hasNext()) {
            Student student = (Student)Student1.next();
            System.out.println(student);
        }

    }
}
