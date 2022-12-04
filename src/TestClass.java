public class TestClass {

    public static void main(String[] args) {


    Student student1 = new Student("Luca");

    Student student2 = new Student("Sara");

    Teacher teacher = new Teacher();
    teacher.teacherName = "Lucia";


    teacher.assignGrade(student1,5);
    teacher.assignGrade(student2,7);

    student1.getStudentDetails();
    student2.getStudentDetails();















    }
}
