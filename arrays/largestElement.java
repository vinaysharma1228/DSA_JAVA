package arrays;

public class largestElement {
    public static void main(String[] args) {
        int marks[]={97,98,99,100,95};

        int largest=marks[0];

        for(int i=0;i<marks.length;i++)
        {
            if(marks[i]>largest)
            {
                largest=marks[i];
            }
        }

        System.out.println("Highest Marks is : "+largest);
    }
}
