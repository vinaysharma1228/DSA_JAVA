package BitManipulation;

/**
 * bitwise_AND
 */
public class bitwise_AND {

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
        System.out.println(7&5);

        /*
         * 
        In this case we used bitwise and (&) between 7 and 5:
        let's check how it will work

        remeber one thing about bitwise and (& ) operator- it return - 1 if both bits are equals else - 0
        
        let's do it-:😎👇

        7 -  111
        5 -  101
        ___________
             101        //always start comparing from right to left

             7 & 5 -> 101 // it is binary form so we need to convert it to decimal 

             1x2^2 + 0x2^1 + 1x2^0 (here ^ consider as power )
             4+0+1
             5  //final answer is 5:
         */
    }
}