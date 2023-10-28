public class multilevel_inheritance {
    public static void main(String args[])
    {
        Dog sheru=new Dog();
        sheru.eat();
        sheru.legs=4;

        System.out.println(sheru.legs);
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
    int legs;
}

class Dog extends mammal{
    int breeds;
}
