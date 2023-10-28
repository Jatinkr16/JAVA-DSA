public class inheritance {
    public static void main(String args[])
    {
        Fish sharkFish=new Fish();
        sharkFish.breathe();
       
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

class Fish extends Animal{
     int swins;

     void swim()
     {
        System.out.println("swimming");
     }
}
