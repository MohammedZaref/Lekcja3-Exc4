package Future.Collars;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String numberOfMinutes;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of seconds to be converted: ");
        double seconds = sc.nextInt();
        double convertToMinutes = secondsToMinutesConverter(seconds);
        if (convertToMinutes <= 1) {
            numberOfMinutes = " Minute.";
        } else {
            numberOfMinutes = " Minutes.";
        }

        System.out.println(seconds + " Seconds = " + convertToMinutes + numberOfMinutes);


    }

    static final int min = 60;

    public static double secondsToMinutesConverter(double seconds) {
        return seconds / min;
    }
}