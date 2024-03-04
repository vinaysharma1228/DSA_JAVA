package _2D_Array;

public class findOccurance {

    public static int findOccuranceOfGivenNumber(int array[][],int target)
    {
        int count=0;

        for(int i=0;i<array.length;i++)
        {
            for(int j=0;j<array[0].length;j++)
            {
                if(array[i][j]==target)
                {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[][] array = { {4,7,7},{8,8,7} };
        int target=7;

        int ans=findOccuranceOfGivenNumber(array, target);

        System.out.println("Number of Occurance of "+target+" is : "+ans);


    }
}
