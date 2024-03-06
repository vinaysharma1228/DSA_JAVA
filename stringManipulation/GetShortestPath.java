package stringManipulation;

public class GetShortestPath {

    public static float  getShortestPath(String string)
    {
        int x=0;
        int y=0;

        for(int i=0;i<string.length();i++)
        {
            if(string.charAt(i) == 'W')
            {
                x--;
            }

            else if (string.charAt(i) == 'N')
            {
                y++;
            }

            else if (string.charAt(i) == 'E')
            {
                x++;
            }
            else
            {
                y--;
            }
        }

        int x2= x*x;
        int y2= y*y;

        return (float) Math.sqrt(x2+y2);
    }
    public static void main(String[] args) {
        String path="WNEENESENNN";

        System.out.println(getShortestPath(path));


    }
    
}
