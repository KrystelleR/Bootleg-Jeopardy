package question2;

import java.util.Scanner;

public class DangerRanger {
    
    public static void main(String[] args) {
//Play menu
      Play p = new Play();
      p.instructions();
      p.askPlay();
      Scanner input = new Scanner(System.in);
      String choice = input.next();
//Display category list
//StackOverflow
      while(choice.equals("1")){
          while(p.completedQuestions < 3){
                Dinosaurs d = new Dinosaurs();
                SolarSystems SS = new SolarSystems(); 
                Medicine m = new Medicine();
                System.out.println("\n" +"Your categories are: ");
                System.out.printf("%-20s %-25s %-30s\n" ,"(1)"+ p.Categories[0], "(2)" + p.Categories[1],"(3)" + p.Categories[2] + "\n");
                System.out.printf("%-20s %-25s %-30s\n" ,p.dinoPoints[0], p.SSPoints[0], p.medPoints[0]+ "\n");
                System.out.printf("%-20s %-25s %-30s\n" ,p.dinoPoints[1], p.SSPoints[1], p.medPoints[1]+ "\n");
                System.out.printf("%-20s %-25s %-30s\n" ,p.dinoPoints[2], p.SSPoints[2], p.medPoints[2]+ "\n\n");
                       
        while (true){
        System.out.println("Choose your category (Enter 1, 2 or 3): ");
        int chooseCat = input.nextInt();
            if (chooseCat == 1 || chooseCat == 2 || chooseCat ==3){
                if(chooseCat ==1){
                    d.playDinosaur();
                    break;
                }
                else if(chooseCat ==2){
                    SS.playSolarSystem();
                    break;
                }
                else if(chooseCat ==3){
                    m.playMedicine();
                    break;
                }   
            break;
            }
            else{
                System.out.println("Invalid answer. Try again.");
            }
        }
      }
// Play bonus round
 while(true){
       if(p.TotalPoints > 0){
           p.bonusRound();

           System.out.println("Enter the amount of points you want to gamble: ");
           p.Points = input.nextInt();
           
           if(p.Points <= p.TotalPoints && p.Points>0){
                BonusRound br = new BonusRound();
               br.finalRoundPlay();
               String answer = input.next();
               if(p.BonusRound[br.number][1].equalsIgnoreCase(answer)){ 
                   p.TotalPoints+=p.Points;
                   System.out.print(
                           "\n" +"Congradulations! That was the correct answer! That leaves you with an impressive total score of "+ p.TotalPoints+" points!\n"+
                           "Thank you for playing Danger Ranger! Play again for a chance of getting a better score!\n"
                   );
                   break;
               }
               else{
                   p.TotalPoints-=p.Points;
                   System.out.print(
                           "\n" +"Oh no! That was not the correct answer! The answer we were looking for is "+br.BonusRound[br.number][1]+"\n"+
                           "Unfortunately this means you have lost " + p.Points + " leaving you with a total of " + p.TotalPoints + " points.\n"+
                           "Thank you for playing Danger Ranger! Play again for a chance of getting a better score!\n"
                   );
                   break;
               }
            
           }
           else{
               System.out.println("Invalid amount. Try again.");
           }
       }
       else{
           System.out.print(
                   "\n" + "Unfortunately you do not qualify for the bonus round as your points are in the negatives!\n" +
                   "Your total points are: "+ p.TotalPoints+"\n"+
                   "Thanks for playing! For a better score, you can always replay the game!\n"           
           );
                   break;
       }  
 }
 break;
      }
    }
}

