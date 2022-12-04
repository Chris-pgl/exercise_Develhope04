public class Student {

    public String name;
    public int grade;


    public Student(String name){
        System.out.println("The Student has been created "+ name);
        this.name  = name;


    }


    public void getStudentDetails(){
        System.out.println("Name Student: "+name+ " FinalGrade: " + grade);
    }
}