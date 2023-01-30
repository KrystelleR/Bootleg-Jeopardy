package question2;

import java.util.Scanner;

//extend play
//Java Programming- Joyce Farrell
public class SolarSystems extends Play{
    public static int x=0;
    public static int y=0;
//load questions
    public static void loadArraySS(){
        
            SolarSystemQuestions.add(0,"How many planets are in the solar system? \n" + "a) 8 \n" +"b) 9 \n"+ "c) 7 ");
            SolarSystemAnswers.add(0,'A');
            
            SolarSystemQuestions.add(1,"What is the hottest planet in our solar system? \n" + "a) Earth \n" +"b) Venus \n"+ "c) Saturn ");
            SolarSystemAnswers.add(1,'B');
            
            SolarSystemQuestions.add(2,"'Phobos' and 'Deimos' are the moons of which planet? \n"+ "a) Jupiter \n" +"b) Uranus \n"+ "c) Mars");
            SolarSystemAnswers.add(2,'C'); 
         
    }
    //get questions
    public static void SSQuestion1(){
    if (SSFlag[0].equals("n")){
         x = 0;
         y = 10;
        SSQuestions();
        System.out.println("You currently have " + TotalPoints + " points.");
    }
    else{
        System.out.println("You have already completed this question. Try a different one.");
    }  
    
    }
    public static void SSQuestion2(){
    if (SSFlag[1].equals("n")){
         x = 1;
         y = 25;
        SSQuestions();
        System.out.println("You currently have " + TotalPoints + " points.");
    }
    else{
        System.out.println("You have already completed this question. Try a different one.");
    } 
    
    }
    public static void SSQuestion3(){
    if (SSFlag[2].equals("n")){
         x = 2;
         y = 50;
        SSQuestions();
        System.out.println("You currently have " + TotalPoints + " points.");
    }
    else{
        System.out.println("You have already completed this question. Try a different one.");
    } 
    
    }
    public static void SSQuestions(){
            loadArraySS();
            SSPoints[x] = "Completed";
            SSFlag [x] = "y";
            completedQuestions+= 1;
 
            Scanner input = new Scanner(System.in);
            System.out.println(SolarSystemQuestions.get(x));
            char answer = input.next().charAt(0);
            
            while(true){
            if (Character.toUpperCase(answer)==('A') || Character.toUpperCase(answer)==('B') || Character.toUpperCase(answer)==('C')){ 
                if(Character.toUpperCase(answer)==(SolarSystemAnswers.get(x))){
                    System.out.println("Correct!");
                    TotalPoints += y; 
                }
                else{
                    System.out.println("Incorrect! The answer was " + SolarSystemAnswers.get(x));
                    TotalPoints -= y;
                }
                break;
            }
            else{
                System.out.println("Enter A, B or C");
                answer = input.next().charAt(0);
            }
    }
    }
//ask question
    public static void playSolarSystem(){
            Scanner input = new Scanner (System.in);
            while (true){
            System.out.println("Enter the points you want for "+ Categories[1] +" (Enter 10, 25 or 50): ");
            int points = input.nextInt();
            if (points ==10 || points ==25 || points ==50){
                switch (points){
                    case 10: 
                        SSQuestion1();
                        break;
                    case 25:
                        SSQuestion2();
                        break;
                    case 50:
                        SSQuestion3();
                        break;
                }
                break;
            }
            else{
                System.out.println("Invaid response.");
            }
            } 
        }
}

