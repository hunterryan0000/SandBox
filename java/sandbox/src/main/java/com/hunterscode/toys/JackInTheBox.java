package com.hunterscode.toys;

public class JackInTheBox {
    int numberOfCranks = 0;
    boolean isOpen = false;

   public void closeLid() {
       if (isOpen) {
           System.out.println("You close the lid");
           isOpen = false;
            numberOfCranks = 0;
       } else {
           System.out.println("You press down on the box and nothing happens.");
       }
   }

   public void turnCrank() {
        System.out.println("You turn the crank.");
        numberOfCranks++;
        if (numberOfCranks > 4 && !isOpen){
            jackSpringsForth();
        } else {
            playMusic();
        }
   }

   private void playMusic() {
       System.out.println("♫♫♫");
   }

   private void jackSpringsForth() {
       isOpen = true;
       System.out.println("Jack SPRINGS FORTH AND SCREAMS!");
   }

    private static void playJackInTheBox() {
        JackInTheBox jack = new JackInTheBox();
        jack.closeLid();
        for (int i = 0; i < 10; i++){
            jack.turnCrank();
        }
        jack.closeLid();
        for (int i = 0; i < 5; i++){
            jack.turnCrank();
        }
    }

    public static void main(String[] args) {
        playJackInTheBox();
    }

}
