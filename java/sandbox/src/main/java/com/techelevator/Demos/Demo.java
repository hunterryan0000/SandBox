package com.techelevator.Demos;

import java.util.Arrays;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        //For every other element, display the value of element + "Fizz";
        //
        int[] nums = new int[]{34, 34, 10, 5, 18};
        // 0,
        for (int i = 0; i < nums.length; i += 2) {
            System.out.println(nums[i] + "Fizz");
        }

        String sample = "redwhiteblue";
        // r e d w h i t e b l u e
        // 0 1 2 3 4 5 6 7 8 9 1011
        System.out.println(sample.substring(0, 3));
        System.out.println(sample.substring(8, 12));
        System.out.println(sample.substring(sample.length() - 4, sample.length()));
        System.out.println(sample.substring(sample.length() - 4));
        System.out.println(sample.substring(1));
        System.out.println(sample.substring(3, 8));

        String red = sample.substring(0, 3);
        String white = sample.substring(3, 8);
        String blue = sample.substring(sample.length() - 4);

        System.out.println(red + " " + white + " " + blue);

        String line = "red white blue";
        String[] colors = line.split(" ");
        System.out.println("colors = " + Arrays.toString(colors));
        for (int i = 0; i < colors.length; i++) {
            System.out.println("** " + colors[i] + " **");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please tell me your name: ");
        String userInput = scanner.nextLine();
        System.out.println("Hello " + userInput + "!  Please have a great day!");

        System.out.println("****");
        System.out.print("red");
        System.out.print("white");
        System.out.print("blue");

    }

}
