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
        System.out.println("Hi! My name is " + sName + " and I am signing in!");
        if (gradeNum > 9) {
            if (gradeNum > 10) {
                if (gradeNum > 11) {
                    System.out.println("I am a senior!");
                } else
                {
                    System.out.println("I am a junior!");
                }
            } else
            {
                System.out.println("I am a sophomore!");
            }
        } else
        {
            System.out.println("I am a freshman!");
        }
        System.out.println("ID: " + ID);
    }

    public void printStudentInfo() {
        System.out.println("Student: " + sName);
        System.out.println("Grade: " + gradeNum);
        System.out.println("ID: " + ID);
    }
}
