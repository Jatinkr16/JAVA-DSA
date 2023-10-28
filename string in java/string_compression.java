public class string_compression {
    public static void main(String args[])
    {
        String str="aaabbbbccdd";


        System.out.print(compression(str));

    }
    public static String compression(String str)
    {
        String newstr="";

        for(int i=0; i<str.length(); i++)
        {
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1))
            {
                count++;
                i++;
            }

            newstr+=str.charAt(i);
            if(count>0)
            {
                newstr+=count.toString();
            }
        }

        return newstr;
    }
}
