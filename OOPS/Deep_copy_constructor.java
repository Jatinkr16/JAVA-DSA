public class Deep_copy_constructor {
 
 
        public static void main(String args[])
        {
            Student p1=new Student();
    
            p1.name="Jatin";
            p1.rollno=434;
            p1.password="abcd";
            p1.marks[0]=84;
            p1.marks[1]=95;
            p1.marks[2]=100;
    
            Student p2=new Student(p1);
            p2.password="xyz";
    
            p1.marks[2]=98;
            
            for(int i=0; i<3; i++)
            {
                System.out.println(p2.marks[i]);
            }
    
        }
    }
    
    class Student{
        String name;
        int rollno;
        String password;
        int marks[]=new int[3];

        // Deep copy constructor

        Student(Student p1)
        {
            marks=new int[3];
            this.name=p1.name;
            this.rollno=p1.rollno;

            for(int i=0; i<marks.length; i++)
            {
                this.marks[i]=p1.marks[i];
            }
        }
    
        
    
        Student(String name)
        {
             this.name=name;
        }
    
        Student()
        {
            System.out.println("My name is Jatin");
        }
    }
    



