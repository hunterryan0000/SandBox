package com.hunterscode.game;

public class Player {
    private String name;
    private int hitPoints = 100;
    private String weapon;

    public boolean isDead(){
        return hitPoints <= 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getHitPoints(){
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public String getWeapon(){
        return weapon;
    }

    public void setWeapon(String weapon){
        this.weapon = weapon;
    }

    public void attackZombie(Zombie zombie) {
        int damage = getDamage();
        System.out.println();
        System.out.println(name + " attacks with his " + weapon + "!");
        zombie.damage(damage);
    }

    public void damage(Zombie zombieAttacker, int damage) {
// Add 1 to change the range to between 1 and 10 (inclusive)
        int dodgeRoll = (int) (Math.random() * 10) + 1; //Math.random() - 0-1
        if (dodgeRoll >= 5){
            System.out.println();
            System.out.println(name + " adeptly dodges to his right, sneers and strikes back!");
            int heroDamage = getDamage();
            zombieAttacker.damage(heroDamage);
        } else {
            System.out.println();
            System.out.println(name + " get hit in the face and loses " + damage + " hit points!");
            hitPoints -= damage;
            if (hitPoints <= 0){
                System.out.println();
                System.out.println(name + " has been beaten like he owed the zombie money!   Game Over...");
            }
        }
    }

    private int getDamage() {
        switch(weapon.toUpperCase()) {
            case("BATTLE AXE"): return 20;
            case("BROAD SWORD"): return 15;
            case("SHORT SWORD"): return 10;
            default: return 5;
        }
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", weapon='" + weapon + '\'' +
                '}';
    }


}
