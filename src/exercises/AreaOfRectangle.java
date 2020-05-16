package exercises;

import java.util.Scanner;

public class AreaOfRectangle {

    public static void main(String[] args) {

        System.out.println(areaOfTriangle());
    }

    protected static int areaOfTriangle() {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the base of the triangle?: ");
        int inputBase = input.nextInt();
        System.out.println("What is the height of the triangle?: ");
        int inputHeight = input.nextInt();
        int areaOfTriangle = ((inputBase * inputHeight) / 2);
        return areaOfTriangle;
    }
}
