public class abstract_class {
    public static void main(String args[])
    {
       chiken ch=new chiken();
       ch.eat();
       ch.walk();

       murtain myhorse=new murtain();
       myhorse.walk();
    }
}

abstract class Animal{

    Animal(){
        System.out.println("Animal constructor is called..");
    }

    void eat(){
        System.out.println("Animal eats");
    }

    abstract void walk();
}


class Horse extends Animal{
    
    Horse(){
        System.out.println("Horse constructor is called");
    }
    void walk()
    {
        System.out.println("Horse is walking in 4 legs");
    }
} 

class murtain extends Horse{
    murtain(){
        System.out.println("murtain constructor is called");
    }
}

class chiken extends Animal{

    void walk()
    {
        System.out.println("chicken is walking is 4 legs");
    }
}
