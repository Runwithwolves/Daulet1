public class StudentsList extends StudentsGroup{
    public static void main(String[] args) {
        Student eve = new Student("Evelynn", "24", "Canada");
        Student adam = new Student("Adam", "22", "Belgium");
        Student claire = new Student ("Claire", "19", "USA");
        Student john = new Student("Johnattan", "23", "England");
        Student mark = new Student("Markus","20", "Switzerland");

        StudentsList studentsgroup = new StudentsList();

        studentsgroup.addStudent(adam);
        studentsgroup.addStudent(eve);
        studentsgroup.addStudent(claire);
        studentsgroup.addStudent(john);
        studentsgroup.addStudent(mark);
        studentsgroup.exclude(eve);


        studentsgroup.printStudents();
    }
}


