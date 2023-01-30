package question2;

import java.util.Scanner;
//extened play
//Java Programming - Joyce Farrell
public class Dinosaurs extends Play{
public static int x=0;
public static int y=0;

//Load arrays
   public static void loadArryDino(){
            DinosaurQuestions.add(0,"How many horns did a triceratops have? \n"+"a) 2 \n"+"b) 3 \n" + "c) 4");
            DinosaurAnswers.add(0,'B');
            
            DinosaurQuestions.add(1,"What is the study of fossils called? \n" + "a) Paleontology \n" +"b) Archaeology \n"+ "c) Paleology" );
            DinosaurAnswers.add(1,'A');
            
            DinosaurQuestions.add(2,"Which dinosaur had the smallest brain for its body size? \n" + "a) Tyrannosaurus \n" + "b) Brontosaurus \n" + "c) Stegosaurus ");
            DinosaurAnswers.add(2,'C');
            
    }
   // get questions
    public static void dinoQuestion1(){
    if (dinoFlag[0].equals("n")){
         x = 0;
         y = 10;
        dinoQuestions();
        System.out.println("You currently have " + TotalPoints + " points.");
    }
    else{
        System.out.println("You have already completed this question. Try a different one.");
    }  
    
    }
    public static void dinoQuestion2(){
    if (dinoFlag[1].equals("n")){
         x = 1;
         y = 25;
        dinoQuestions();
        System.out.println("You currently have " + TotalPoints + " points.");
    }
    else{
        System.out.println("You have already completed this question. Try a different one.");
    } 
    
    }
    public static void dinoQuestion3(){
    if (dinoFlag[2].equals("n")){
         x = 2;
         y = 50;
        dinoQuestions();
        System.out.println("You currently have " + TotalPoints + " points.");
    }
    else{
        System.out.println("You have already completed this question. Try a different one.");
    } 
    
    }
    public static void dinoQuestions(){
            loadArryDino();
            dinoPoints[x] = "Completed";
            dinoFlag [x] = "y";
            completedQuestions+= 1;
 
            Scanner input = new Scanner(System.in);
            System.out.println(DinosaurQuestions.get(x));
            char answer = input.next().charAt(0);
            
            while(true){
            if (Character.toUpperCase(answer)==('A') || Character.toUpperCase(answer)==('B') || Character.toUpperCase(answer)==('C')){ 
                if(Character.toUpperCase(answer)==(DinosaurAnswers.get(x))){
                    System.out.println("Correct!");
                    TotalPoints += y; 
                }
                else{
                    System.out.println("Incorrect! The answer was " + DinosaurAnswers.get(x));
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
// ask questions
    public static void playDinosaur(){
            Scanner input = new Scanner (System.in);
            while (true){
            System.out.println("Enter the points you want for " + Categories[0]+ " (Enter 10, 25 or 50): ");
            int points = input.nextInt();
            if (points ==10 || points ==25 || points ==50){
                switch (points){
                    case 10: 
                        dinoQuestion1();
                        break;
                    case 25:
                        dinoQuestion2();
                        break;
                    case 50:
                        dinoQuestion3();
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

