public class constructor {
    public static void main(String args[])
    {
        // parameterized constructor
        Student p1=new Student("Abhimanyu");
        System.out.println(p1.name);


        // non parameterized constructor

        Student p2=new Student();
        
        
    }
}

class Student{
    String name;
    int rollno;

    Student(String name)
    {
        System.out.println("Constructor is called....");
         this.name=name;
    }

    Student()
    {
        System.out.println("My name is Jatin");
    }
}
