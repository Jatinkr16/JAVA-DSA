public class OOPS_with_access_modifier{
    public static void main(String args[])
    {
         Pen p1=new Pen();
         p1.setcolor("blue");
         System.out.println(p1.color);

         p1.color="Yellow";
         System.out.println(p1.color);

         p1.settip(5);
         System.out.println(p1.tip);

         Student p2=new Student();
         p2.setname("Abhimanyu");
         System.out.println(p2.name);

         p2.setage(18);
         System.out.println(p2.age);

         p2.calcpercentage(96,84 , 88);
         System.out.println(p2.percentage);

         Bankmanagement p3=new Bankmanagement();

         p3.setname("Surya");
         System.out.println(p3.name);

         p3.Accpassword("Bhutnike");
       //  System.out.println(p3.Password);
    }
}

class Bankmanagement{
    public String name;
    private String Password;

    public void setname(String newname)
    {
         name=newname;
    }
    public void Accpassword(String setpassword)
    {
          Password=setpassword;
    }
}

class Pen{
    String color;
    int tip;

    public void setcolor(String newcolor)
    {
        color=newcolor;
    }
    public void settip(int newtip)
    {
        tip=newtip;
    }
}

class Student{
    String name;
    int age;
    float percentage;

    public void setname(String newname)
    {
        name=newname;
    }

    public void setage(int newage)
    {
        age=newage;
    }
    public void calcpercentage(int math,int chem,int physics)
    {
        percentage=(math+chem+physics)/3;
    }
}

