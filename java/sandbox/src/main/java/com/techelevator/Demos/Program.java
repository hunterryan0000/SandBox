package com.techelevator.Demos;

public class Program {

    public static void main(String[] args) {
            double num = 5.32342313241234;
            String name = "Jerry";
        System.out.println(num);
        String result2 = "[Item# " + 123 + "] price: $" + num + " " + name + "(discount available)";
        String result = String.format("[Item# %d] price: $%.2f %s(discount available)", 123, num, name);

        System.out.println(result);
        System.out.println(result2);
    }

}
