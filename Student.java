public class Student{
    private String name;
    private double GPA;
    
    public Student (String studentName, double studentGPA){
    name = studentName;
    GPA = studentGPA;
    }

    public void introduce(){
        if (GPA <= 2.0){
            System.out.println("My name is "+ name + ", I'm not doing very well on my academics...");
        }
        if (GPA < 3.0){
            System.out.println("My name is "+ name + ", I'm doing okay on my academics, but still not very good.");
        }
        else{
            System.out.println("My name is "+ name + ", I have a very good GPA, I think I'm doing very well!");
        }
    }
    public void printStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("GPA: " + GPA);
    }
}