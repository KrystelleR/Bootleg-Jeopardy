package question2;

import java.util.Random;

public class BonusRound extends Play {
   public static int number ;
   //play final round
   public static void finalRoundPlay(){
       
   BonusRoundCategories[0] = "Language";
   BonusRound[0][0] = "What is the Italian word for 'tomato'?";
   BonusRound[0][1] = "Pomodoro";
   
   BonusRoundCategories[1] = "The Internet";
   BonusRound[1][0] = "In 2009, Zappos.com was acquired by which company?";
   BonusRound[1][1] = "Amazon";
   
   BonusRoundCategories[2] = "Music";
   BonusRound[2][0] = "Which large wind instrument is used for cultural music by the indigenous people of Australia?";
   BonusRound[2][1]= "Didgeridoo";
   
   //get random
   //Stack Overflow
   Random random = new Random();
   number = random.nextInt(3);
   System.out.print(
           "Welcome to the Bonus Round! Your randomly choosen category is: " + BonusRoundCategories[number]+"\n\n"+
           "Your question for " + Points + " is... \n\n" +BonusRound[number][0]+"\n"
   );
   }
}
