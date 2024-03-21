package LinkedList;

import java.util.LinkedList;

/**
 * createLinkedList
 */
public class createLinkedList {

    public static void main(String[] args) {
        LinkedList<Integer> list =new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);

       
        System.out.println( list.reversed());

    }



}