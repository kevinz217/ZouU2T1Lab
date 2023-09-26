public class StudentRunner {
    public static void main(String[] args) {
        Student student1 = new Student("Carl", 9, "38318");
        student1.Signin();
        student1.printStudentInfo();
        Student student2 = new Student("Ethan", 12, "28591");
        student2.Signin();
        student2.printStudentInfo();
    }
}
