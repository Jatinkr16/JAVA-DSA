public class type_promotio_1 {
    public static void main(String args[])
    {
        char a='a';
        char b='b';

        System.out.println(b-a);

        short c=5;
        byte d= 6;

        char f='f';

        byte bt= (byte) (c+d+f);
        System.out.println(bt);
    }
}
