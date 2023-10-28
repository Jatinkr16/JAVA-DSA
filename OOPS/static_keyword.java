public class static_keyword {
    public static void main(String args[])
    {
       Student s1=new Student();
       s1.myschoolname="JMV";

       Student s2=new Student();
       System.out.println(s2.myschoolname);

       Student s3=new Student();
       System.out.println(s3.myschoolname);

     
       System.out.println(s1.markspercent(100,89,90));
    }
}

class Student{
    String name;
    int roll;

    static String myschoolname;

    static int markspercent(int math,int phy,int chem)
    {
        return (math+phy+chem)/3;
    }

    void setname(String name){
        this.name=name;
    }

    String getname(){
         return this.name;
    }
}
