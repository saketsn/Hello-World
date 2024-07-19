public class Hello {

    public static void main(String[] args) {
        System.out.println("hello, world");
        System.out.println(" hello , tim ");

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an Alien");

        }

        int topScore =80;
        if(topScore < 100){
            System.out.println("You got the top score");
        }

        int secondTopScore = 60;
        if((secondTopScore<topScore) && (topScore<100)){
            System.out.println("Greater than second top score but less than 100");
        }
    }
}
