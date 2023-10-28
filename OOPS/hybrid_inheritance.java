public class hybrid_inheritance {
    public static void main(String args[])
    {
       cat chimi=new cat();

       chimi.eat();
       chimi.milk();

       mammal ronky=new mammal();
       ronky.breathe();
       ronky.walking();
    }
}

class Animal{
    String color;

    void eat()
    {
        System.out.println("eats");
    }

    void breathe()
    {
       System.out.println("breathing");
    }
}

class mammal extends Animal{
    void walking()
    {
        System.out.println("mammal is walking");
    }
}

class cat extends Animal{
    void milk(){
        System.out.println("cat is drinking milk ");
    }
}

class fish extends Animal{
    void swim()
    {
        System.out .println("fish is swimming ");
    }
}

class shark extends fish{
    void dangour(){
        System.out.println("shark is dangerous");
    }
}

class human extends mammal{
    void mind(){
        System.out.println("human is genious");
    }
}
