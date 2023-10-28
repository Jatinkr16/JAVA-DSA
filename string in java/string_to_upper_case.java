public class string_to_upper_case {
    public static void main(String args[])
    {
        String str="hello, i am jatin";

        System.out.print(touppercase(str));

    }

    public static String touppercase(String str)
    {
        StringBuilder sb=new StringBuilder("");
        Character ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1; i<str.length(); i++)
        {
            if(str.charAt(i)==' ' && i<str.length()-1)
            {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else
            {
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }
}
