package chapter03_conditional_loop;

public class calculate_CGPA {
    public static void main(String[] args) {
        double sem1=8.12;
        double sem2=9.42;
        double sem3=9.0;
        double sem4=9.0;
        double sem5=9.57;

        double cgpa=(sem1+sem2+sem3+sem4+sem5)/5.0;

        System.out.println("CGPA: "+cgpa);
        System.out.println("CGPA percentage : "+cgpa*9.5+"%");

    }
}
