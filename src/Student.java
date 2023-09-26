public class Student {

    private String sName;
    private int gradeNum;
    private String ID;

    public Student(String studentName, int studentGrade, String studentID) {
         sName = studentName;
         gradeNum = studentGrade;
         ID = studentID;
    }

    public void Signin() {
        System.out.println("Hi! My name is " + sName + "and I am signing in!");
        System.out.println("ID: " + ID);
    }
}
