package exercises;

import java.util.Scanner;

public class Superhero {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your favorite superhero movie.");
        String name = input.nextLine();
        System.out.println(name + " is my favorite superhero movie.");

    }

}
