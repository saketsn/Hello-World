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

        String makeOfCare = "Tata";
        boolean isDomestic = makeOfCare =="Tata" ? false:true; // Ternary Operator demonstration.
         if(!isDomestic){
             System.out.println("This car is domestic to our country") ;}
         String s= isDomestic ? "this car is domestic" : "this car is not domestic";
         System.out.println(s);







   }
}



