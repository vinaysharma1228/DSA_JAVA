package OOPS.inheritance;

class Animal1 {
   
    public int eye=2;
    public void walk()
    {
        System.out.println("Animal walks: ");
    }
    
}

class Horse1 extends Animal1{

}

class HorseType extends Horse1{

}

public class multi_level {
    public static void main(String[] args) {
        HorseType ht1=new HorseType();
        System.out.println(ht1.eye);
        ht1.walk();
    }
}
