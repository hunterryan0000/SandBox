package com.hunterscode.game;

import com.hunterscode.toys.JackInTheBox;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Game {
    public static void main(String[] args) {
        Player player = new Player();
        player.setName("Ryan the Hunter");
        player.setHitPoints(75);

        player.setWeapon(ListOfWeapons.whatsMyWeapon()); // Battle Axe, Broad Sword, Short Sword

        List<Zombie> zombies = new ArrayList<>();
        zombies.add(new Zombie("Zombie1", 100));
        zombies.add(new Zombie("Zombie2", 99));
        zombies.add( new Zombie("Zombie3", 98));
        zombies.add(new Zombie());

        for (Zombie z: zombies){
            System.out.println(z);
        }

        for (int i = 0; i < 50 && zombies.size() > 0; i++) {
            int index = (int) (Math.random() * zombies.size());
            Zombie victim = zombies.get(index);
            player.attackZombie(victim);
            if (victim.isDead()) {
                zombies.remove(victim);
            } else {
                victim.attackPlayer(player);
            }
            if (player.isDead()){
                break;
            }
        }

        if (!player.isDead()){
            System.out.println();
            System.out.println("CONGRATULATIONS LEVEL 1 BEATEN");
            System.out.println();
            System.out.println(player.getName() + " is standing amongst the limbs of his enemies as he walks into the sunset.");
        }



    }

}
