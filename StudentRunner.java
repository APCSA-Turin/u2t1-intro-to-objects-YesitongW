public class StudentRunner {
    public static void main(String[] args) {
        Student stu1 = new Student("Zachary", 3.9);
        Student stu2 = new Student("Emily", 2.0);
        Student stu3 = new Student("White",2.8 );

        stu1.introduce();
        stu1.printStudentInfo();
        System.out.println();
        
        stu2.introduce();
        stu2.printStudentInfo();
        System.out.println();

        stu3.introduce();
        stu3.printStudentInfo();
        System.out.println();
    }
}
