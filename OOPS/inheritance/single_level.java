package OOPS.inheritance;

/**
 * single_level
 */

 class Animal{

    Animal(){
        System.out.println("Animal constructor called.");
    }
    public void walk(){
        System.out.println("Animal method called.");
    }
 }

 class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor called.");
    }

    public void walk(){
       
        System.out.println("Horse method called.");
        super.walk();
    }
 }


public class single_level {

    public static void main(String[] args) {
        Horse h1=new Horse();
        h1.walk();
       
        
    }
}