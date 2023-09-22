public class Student {
    private String name;
    private int gradeNum;
    private String ID;
    public Student(String studentName, int studentGrade, String studentID) {
         name = studentName;
         gradeNum = studentGrade;
         ID = studentID;
    }

    public void Signin() {
        System.out.println("Hi! My name is " + name + "and I am signing in!");
        System.out.println("ID: " + ID);
    }
}
