package exercises;

import java.util.Scanner;

public class MilesDriven {

    public static void main(String[] args) {

        System.out.println(milesPerGallon());

    }

    protected static int milesPerGallon() {
        Scanner milesDriven = new Scanner(System.in);
        System.out.println("How many miles have you driven?: ");
        int miles = milesDriven.nextInt();
        Scanner gasConsumedInGallons = new Scanner(System.in);
        System.out.println("How much gas have you consumed (in gallons)?: ");
        int gas = gasConsumedInGallons.nextInt();
        int milesPerGallon = (miles / gas);
        return milesPerGallon;
    }
}
