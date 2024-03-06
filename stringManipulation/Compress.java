package stringManipulation;

public class Compress {

    public static String compress(String str)
    {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            Integer count=1;
            char current=str.charAt(i);

            while (i<str.length()-1 && current == str.charAt(i+1)) {
                count++;
                i++;
            }

            sb.append(current);

            if(count > 1)
            {
                sb.append(count.toString());
            }

        }

        return sb.toString();
    }
    public static void main(String[] args) {
        String str="aaabbcccdd";

        System.out.println(compress(str));

    }
}
