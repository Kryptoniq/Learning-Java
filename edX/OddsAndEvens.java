import java.util.Scanner;
import java.util.Random;
public class OddsAndEvens {
   public static void main(String[] args) {
       System.out.println("Let’s play a game called “Odds and Evens");
       Scanner in = new Scanner(System.in);
       System.out.print("What is your name? ");
       String name = in.nextLine();
      System.out.println("Hi "+name+", which do you choose? (O)dds or (E)vens?");
      String choose = in.next();
     
      if(choose.equalsIgnoreCase("O")) {
          System.out.println(name +" has picked Odds, the computer will be Evens.");
      } else if(choose.equalsIgnoreCase("E")) {
          System.out.println(name+ " has picked Evens, the computer wills be Odds");
      } else { 
          System.err.println("Invalid Option");
      }
      
      Random rand = new Random();
      System.out.println("How many “fingers” do you put out?");
      int userNumber = in.nextInt();
      
       System.out.println("How many “fingers” do you put out?");
       
      int computer = rand.nextInt(6);
      System.out.println("The computer plays number "+computer+ " “fingers”");
      System.out.println("--------------------------------");
      
      int sum = userNumber+computer;
      System.out.println(userNumber +" + "+ computer +" = " + sum);
      
      boolean oddOrEven = sum % 2 == 0;
      
      System.out.println("--------------------------------");
      if(oddOrEven) {
          System.out.println(sum+" is Even");
          if(choose.equalsIgnoreCase("E")) {
              System.out.println(name+" wins...");
          } else {
              System.out.println("Computer wins...");
          }
      } 
      
      else {
           System.out.println(sum+" is Odd");
          if(choose.equalsIgnoreCase("O")) {
              System.out.println(name +" wins...");
          } else {
              System.out.println("Computer wins..");
          }
          
         
      }
      
 
   }
}
