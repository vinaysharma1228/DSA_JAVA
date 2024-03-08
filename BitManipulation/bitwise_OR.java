package BitManipulation;

public class bitwise_OR {
    public static void main(String[] args) {
         /*

        binary reperesentation of decimal number 
        0- 000
        1- 001
        2- 010
        3- 011
        4- 100
        5- 101
        6- 110
        7- 111 

     */
    System.out.println(7|5);

    /*
     * 
    In this case we used bitwise OR (|) between 7 and 5:
    let's check how it will work

    remeber one thing about bitwise OR ( | ) operator- it return - 0 if both bits are 0 otherwise - 1
    
    let's do it-:😎👇

    7 -  111
    5 -  101   
    ___________
         111        //always start comparing from right to left

         7 | 5 -> 111 // it is binary form so we need to convert it to decimal 

         1x2^2 + 1x2^1 + 1x2^0 (here ^ consider as power )
         4+2+1
         7  //final answer is 5:
     */
    }
}
