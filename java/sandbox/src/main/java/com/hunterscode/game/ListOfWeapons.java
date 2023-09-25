package com.hunterscode.game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ListOfWeapons {
    static final List<String> weapons = new ArrayList<>(Arrays.asList(
            "BATTLE AXE",
            "BROAD SWORD",
            "SMALL SWORD",
            "KNIFE"
    ));

    public static String whatsMyWeapon(){
        // Initialize a Random object
        Random random = new Random();

        // Generate a random index between 0 (inclusive) and the size of the list (exclusive)
        int randomIndex = random.nextInt(weapons.size());

        // Return the element at the random index
        return weapons.get(randomIndex);
    }




}
