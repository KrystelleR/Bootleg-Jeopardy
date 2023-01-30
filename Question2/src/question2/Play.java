package question2;

import java.util.ArrayList;
import java.util.Scanner;

public class Play {
//Declare variables
//Java Programming - Joyce Farrell
protected static ArrayList <String> DinosaurQuestions = new ArrayList <String> (); 
protected static ArrayList <Character> DinosaurAnswers = new ArrayList <Character> ();

protected static ArrayList <String> SolarSystemQuestions = new ArrayList <String> ();
protected static ArrayList <Character> SolarSystemAnswers = new ArrayList <Character> ();

protected static ArrayList <String> MedicineQuestions = new ArrayList <String> ();
protected static ArrayList <Character> MedicineAnswers = new ArrayList <Character> ();

public static int SIZE = 3;
protected static String [] BonusRoundCategories = new String [SIZE];
protected static String [][] BonusRound =new String [SIZE][2];

public static int TotalPoints =0;
public static int completedQuestions =0;
public static int Points=0;

public static String [] dinoPoints = {"10", "25", "50"};
public static String [] SSPoints = {"10", "25", "50"};
public static String [] medPoints = {"10", "25", "50"};

protected static String [] dinoFlag ={"n", "n", "n"};
protected static String [] SSFlag ={"n", "n", "n"};
protected static String [] medFlag ={"n", "n", "n"};

public static String [] Categories = {"DINOSAUR", "SOLAR SYSTEM", "MEDICINE"};
//display instructons
        public static void instructions(){
        System.out.print(
                "Welcome to...DANGER RANGER" + "\n \n" +
                "In this quiz competition, your aim is to rack up as many points as possible. \n" +
                "You will be given 3 categories. Each category has 3 questions ranging from easy to hard. \n" +
                "The harder the question, the more points you'll get! \n " +
                "You will only be allowed to answer 3 questions, so make them count! \n" +
                "Get the question right and points will be added to you but... \n" + 
                "get a question wrong and the points will be deducted from you. \n" +
                "This quiz is multiple choice, so answer A,B or C \n"+
                "GOODLUCK!!\n\n"
        );
    }
        public static void askPlay(){
        Scanner input = new Scanner (System.in);
        System.out.println("Enter (1) to begin or any other key to exit.\n");
    }
        //display bonus round
        public static void bonusRound(){
            System.out.println(
                    "Well done! You have a total of " +TotalPoints+ " points which qualifies you for the BONUS ROUND!! \n" +
                    "For this round, you decide how many points you can gain! \n" +
                    "You can pick a number that is lower than or equal to your current points. \n"+
                    "If you get it right, the amount you choose will be added onto your total. \n"+
                    "However, get it wrong and the amount will be subtracted from your total. \n" +
                    "This round is NOT multiple choice..."+
                    "Pick your amount wisely and goodluck! \n"
            );
        }

}