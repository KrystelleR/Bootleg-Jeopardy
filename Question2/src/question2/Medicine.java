package question2;

import java.util.Scanner;

//extend play
//Java Programming - Joyce Farrell
public class Medicine extends Play {
    public static int x=0;
    public static int y=0;
//load questions
    public static void loadArrayMed(){
        
            MedicineQuestions.add(0, "What device is used to listen to a person heartbeat? \n" + "a) Thermometer \n" + "b) Nebulizer \n" + "c) Stethoscope " );
            MedicineAnswers.add(0, 'C'); 
            
            MedicineQuestions.add(1, "How many bones are in the adult body? \n" + "a) 206 \n" + "b) 204 \n" + "c) 210 ");
            MedicineAnswers.add(1, 'A');
            
            MedicineQuestions.add(2, "What is the medical name for a collarbone? \n" + "a) Cabeza \n" + "b) Clavicle \n" + "c) Calcaneus ");
            MedicineAnswers.add(2, 'B');
            
    }
    //get question
 public static void medQuestion1(){
    if (medFlag[0].equals("n")){
         x = 0;
         y = 10;
        medQuestions();
        System.out.println("You currently have " + TotalPoints + " points.");
    }
    else{
        System.out.println("You have already completed this question. Try a different one.");
    }  
    
    }
    public static void medQuestion2(){
    if (medFlag[1].equals("n")){
         x = 1;
         y = 25;
        medQuestions();
        System.out.println("You currently have " + TotalPoints + " points.");
    }
    else{
        System.out.println("You have already completed this question. Try a different one.");
    } 
    
    }
    public static void medQuestion3(){
    if (medFlag[2].equals("n")){
         x = 2;
         y = 50;
        medQuestions();
        System.out.println("You currently have " + TotalPoints + " points.");
    }
    else{
        System.out.println("You have already completed this question. Try a different one.");
    } 
    
    }
    public static void medQuestions(){
            loadArrayMed();
            medPoints[x] = "Completed";
            medFlag [x] = "y";
            completedQuestions+= 1;
 
            Scanner input = new Scanner(System.in);
            System.out.println(MedicineQuestions.get(x));
            char answer = input.next().charAt(0);
            
            while(true){
            if (Character.toUpperCase(answer)==('A') || Character.toUpperCase(answer)==('B') || Character.toUpperCase(answer)==('C')){ 
                if(Character.toUpperCase(answer)==(MedicineAnswers.get(x))){
                    System.out.println("Correct!");
                    TotalPoints += y; 
                }
                else{
                    System.out.println("Incorrect! The answer was " + MedicineAnswers.get(x));
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
// ask question
    public static void playMedicine(){
            Scanner input = new Scanner (System.in);
            while (true){
            System.out.println("Enter the points you want for "+ Categories[2] +" (Enter 10, 25 or 50): ");
            int points = input.nextInt();
            if (points ==10 || points ==25 || points ==50){
                switch (points){
                    case 10: 
                        medQuestion1();
                        break;
                    case 25:
                        medQuestion2();
                        break;
                    case 50:
                        medQuestion3();
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

