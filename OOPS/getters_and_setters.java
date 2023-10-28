public class getters_and_setters {
    public static void main(String args[])
    {
       Pen p1=new Pen();

       p1.setcolor("Yelllow");
       System.out.println(p1.getColor());

       p1.settip(5);
       System.out.println(p1.getTip());
    }
}

class Pen{
    private String color;
    private int tip;

    String getColor()
    {
        return this.color;
    }

    int getTip()
    {
        return this.tip;
    }

    public void setcolor(String color)
    {
        this.color=color;
    }

    public void settip(int tip)
    {
        this.tip=tip;
    }
}
