package com.hunterscode.Demos;

public class Program2 {
    public static void main(String[] args) {
        System.out.println(3 + 10);
        System.out.println(addNumbers(3, 10));
        System.out.println(addNumbers(1, 99));
        System.out.println(addNumbers(10, 35));
        
    }

    private static int addNumbers(int a, int b){
        return a + b;
    }
}
