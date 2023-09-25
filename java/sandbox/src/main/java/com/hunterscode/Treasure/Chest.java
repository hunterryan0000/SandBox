package com.hunterscode.Treasure;

public class Chest implements Box{
    @Override
    public int open() {
        System.out.println("I'm opening the chest.");
        return 5;
    }

    @Override
    public void close() {
        System.out.println("I'm closing the chest.");
    }

    public void bury() {
        System.out.println("Bury the chest.");
    }

}
