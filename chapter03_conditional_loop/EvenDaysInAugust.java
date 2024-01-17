package chapter03_conditional_loop;


public class EvenDaysInAugust {
    public static void main(String[] args) {

        int daysInAugust = 31;

        int evenDaysCount = 0;

        for (int day = 1; day <= daysInAugust; day++) {
            if (day % 2 == 0) {
                evenDaysCount++;
            }
        }

        System.out.println("Kunal can go out on " + evenDaysCount + " even days in August.");

    }
}

