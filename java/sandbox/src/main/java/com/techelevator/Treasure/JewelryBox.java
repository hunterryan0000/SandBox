package com.techelevator.Treasure;

public class JewelryBox implements Box{
        @Override
        public int open() {
                System.out.println("You found valuable gems in the box");
                return 100;
        }

        @Override
        public void close() {
                System.out.println("You close the jewelry box.");
        }
}
